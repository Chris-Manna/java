import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.io.*;
import java.util.*;
import java.util.zip.*;
/**
 * User gives values for program.
 * 
 * @author (Christopher G Manna) 
 * @version (12/12/11)
 */
public class Tester {
	//instance variables
	private static DateFormat MILITARY = new SimpleDateFormat("HH:mm");
	//initializes the instance variables into proper Date Format according to String
	private static String title;//title name of the course
	private static String sTime;//start time of the course
	private static String eTime;//end time of the course
	private static String fileIn;//File name as string
	private static File inFile;//File as the source
	private static ArrayList<Lesson> lessonList;//ArrayList from the source file
	private static ArrayList<Lesson> scheduleList;//ArrayList to the target
	private static ArrayList<String> megargs;
	private static Scheduler maximize;
	//end of instance variables

	public static void main(String[] args) {// throws IOException
		//Local Variables
		lessonList = new ArrayList<Lesson>();//
		scheduleList = new ArrayList<Lesson>();
		megargs = new ArrayList<String>();
		fileIn="";
		maximize = null;
		//end of local variables
		
		//Method
		for(int i=0;i<args.length;i++) {
			megargs.add(args[i]);
		}

		for(int i=0; i<args.length;i++){
			if(args[i].equals("-in")){
				fileIn=args[i+1];
				inFile=new File(fileIn);
			}
			else if(args[i].equals("-sample")){
				printSample();
				System.exit(1);
			}
			/*	
		  else if(!((megargs.get(i).equals("-in") && !(megargs.get(i+1).length() >0))|| megargs.get(i).equals("-sample"))){
			  System.out.println("your program must have either argument" +
			  		" -in or -sample.  Try again.");
			  System.exit(1);
		  }
			 */
		}
		
		//This section will create a bunch of lesson objects in an ArrayList
		try {
			loadLessonsToAL();//tries to pass the elements from the document into an ArrayList of objects
		} 	catch (java.io.FileNotFoundException e) {// if it not found let the user know
			System.out.println("Hey I couldn't find "+ fileIn);//specifies the arg value the user used an source
//			e.printStackTrace();
			System.exit(1);
		} 	catch (ParseException pe) {//if trouble parsing the input to date time and specifies the source
			System.out.println("Hey I had trouble reading lines in "+ fileIn);//given by the user.
//			pe.printStackTrace();
			System.exit(1);
		} 
		//pass the arrayList to the scheduler
		try {
			maximize = new Scheduler(lessonList);//tries to scan the schedule 
		} 
		catch (ParseException e) {
			// this is a parse exception from a static value.
			// will never happen.
			// e.printStackTrace();
		}
		maximize.sortLessons();//takes the array of lessons and optimizes it in Scheduler
		//    	maximize.testPrintAll();
		try {
			maximize.ProcessLessons();//with the given elements it finds which elements are illegal
			//and throws the exceptions with a message accordingly.
		} 
		catch (DataFormatException dfe) {
			System.out.println("Your file has conflicting start and end times.");
//			e.printStackTrace();
			System.exit(1);
		}

		scheduleList = maximize.getSchedule();
		if (scheduleList.size()==0){
			System.out.println("You don't have any times in your source file ");
			System.out.println("that transfer to make a schedule. Try again.");
			System.exit(1);
			}
		printSchedule();
	}

	private static void printSample() {
		System.out.println("This is a sample.");
	}

	private static void printSchedule() {
		for(int i = 0; i < scheduleList.size(); i++){

			System.out.println(scheduleList.get(i).getTitle());
			System.out.println(MILITARY.format(scheduleList.get(i).startTime()));
			System.out.println(MILITARY.format(scheduleList.get(i).endTime()));
			System.out.println();	
		}		
	}

	private static void loadLessonsToAL() 
			throws java.io.FileNotFoundException, ParseException{
		Scanner input = new Scanner(inFile);
		while(input.hasNextLine()){
			title=input.nextLine();
			sTime=input.nextLine();
			eTime=input.nextLine();
			lessonList.add(new Lesson(title, sTime, eTime));
			if(input.hasNextLine())
				input.nextLine();
		}
	}
}
