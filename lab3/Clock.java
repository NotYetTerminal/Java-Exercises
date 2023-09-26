import java.util.Calendar;

// 1
public class Clock
{
	public static void main(String[] args)
	{
		// makes new Calendar
		Calendar cal = Calendar.getInstance();
		// sets the new Time object
		Time t = new Time(cal.get(Calendar.HOUR_OF_DAY), cal.get(Calendar.MINUTE));
		// prints out variables
		System.out.println(t.toString());
		
		long startMin;
		// runs 60 times as there is 60 seconds in a minute
		for (int index = 0; index < 60; index++)
		{
			startMin = System.currentTimeMillis();
			// runs until a second has passed
			while (System.currentTimeMillis() - startMin < 1000)
			{
				// sleeps for 50 milliseconds
				// so that the cpu does not run unnesesarily
				try
				{
					Thread.sleep(1);
				}
				catch (InterruptedException e)
				{
					Thread.currentThread().interrupt();
				}
			}
			t.tick();
		}
		// prints out time
		System.out.println(t.toString());
	}
}