import java.util.*;
import java.util.zip.DataFormatException;
import java.text.*;

/**
 * Passes the lecture submission times in and orders it.
 * 
 * @author (Christopher G Manna) 
 * @version (12/12/11)
 */

public class Scheduler  {
	//Instance Variables
	private static DateFormat MILITARY = new SimpleDateFormat("HH:mm");
    private static Date MAXTIME;
    private static Date MINTIME;
    private ArrayList<Lesson> allLessons;
    private ArrayList<Lesson> schedule;
    //End IV
    //Start Constructor Class
    public Scheduler(ArrayList<Lesson> lessonsIn) throws ParseException{
    	allLessons=new ArrayList<Lesson>();
    	schedule=new ArrayList<Lesson>();
    	allLessons=lessonsIn;
    	MAXTIME = MILITARY.parse("17:00");
    	MINTIME = MILITARY.parse("08:00");
    }//End Constructor Class
    
    public void sortLessons(){
    	Collections.sort(allLessons);
    }//End Sort Method
    
    public void ProcessLessons() throws DataFormatException{
    	DataFormatException dfe = new DataFormatException();
    	//sort by endTime in comparison to other end times
    	//Collections.sort(lesson);//based on end time
    	//for each person (starting with earliest end
    	//time with a start time that begins after beginning time) add to schedule
    	//if no conflict exists
    	
    	//build schedule
    	for(int i=0; i<allLessons.size();i++){
    		
    		if(allLessons.get(i).startTime().compareTo(allLessons.get(i).endTime())>0){
    			throw dfe;
    		}
    		if(!(allLessons.get(i).startTime().before(MINTIME) ||
    				allLessons.get(i).endTime().after(MAXTIME)) &&
    				schedule.size()<1){//if start time is NOT before 8:00 OR NOT after
    			schedule.add(allLessons.get(i));
    		}
    		
    		if((!allLessons.get(i).startTime().before(MINTIME) &&//start time >= Min Time
    				!allLessons.get(i).endTime().after(MAXTIME)) &&//end time <= Max Time
    				schedule.size()>0 &&//and schedule size is not 0.
    				!allLessons.get(i).startTime().before(schedule.get(schedule.size()-1).endTime())){
    			schedule.add(allLessons.get(i));
    		}
    	}
    }
    public ArrayList<Lesson> getSchedule(){
    	return schedule;
    } 
}
