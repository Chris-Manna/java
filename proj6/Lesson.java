import java.util.*;
import java.text.*;

/**
 * converts the Lesson End times
 * converts the Lesson Start times
 * finds the Lesson Names
 * 
 * @author (Christopher G Manna) 
 * @version (12/12/11)
 *
 */
public class Lesson implements Comparable<Lesson>
{
	private final DateFormat MILITARY = new SimpleDateFormat("HH:mm");
	private String lessonTitle;
	private String start, end;
	private Date eTime;
	private Date sTime;

	//passes the Strings in from the Tester Class
	public Lesson(String lessonName1, String stLesson, String endLesson)
			throws ParseException
			{
		start = stLesson;
		end = endLesson;
		lessonTitle = lessonName1;
		sTime = MILITARY.parse(start); //parses beginning times String to standard times
		eTime = MILITARY.parse(end); //parses end time Strings to standard times
			}

	public Date endTime()// returns end time value
	{
		return eTime;
	}
	public Date startTime()//returns start time value
	{
		return sTime;
	}
	public String getTitle()//returns class title value
	{
		return lessonTitle;
	}
	public int compareTo(Lesson a) {//compares the class value times for compare.
		if(eTime.compareTo(a.endTime())>0)
			return 1;
		else if(eTime.compareTo(a.endTime())<0)
			return -1;
		return 0;
	}
}
