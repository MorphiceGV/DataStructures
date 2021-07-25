/**
 * 
 */
package lab1;

/**
 * @author MorphiceGV
 *
 */
public class Time {

	/**
	 * @param args
	 */

	private int hours;
	private int minutes;
	private int seconds;

	/**
	 * @param hours
	 * @param minutes
	 * @param seconds
	 */

	/**
	 * 
	 * @param hours
	 * @param minutes
	 * @param seconds
	 * @returns user specified time
	 */
	public Time(int hours, int minutes, int seconds) {
		super();
		this.hours = hours;
		this.minutes = minutes;
		this.seconds = seconds;
	}

	/**
	 * @param hours
	 * @param minutes
	 * @param seconds
	 * @return default time of 9:00:00
	 */
	public Time() {
		super();
		int hours = 9;
		int minutes = 00;
		int seconds = 00;
	}

	@Override
	public String toString() {
		return hours + ":" + minutes + ":" + seconds;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + hours;
		result = prime * result + minutes;
		result = prime * result + seconds;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Time other = (Time) obj;
		if (hours != other.hours)
			return false;
		if (minutes != other.minutes)
			return false;
		if (seconds != other.seconds)
			return false;
		return true;
	}

	/**
	 * @return the hours
	 * @Gets defined hours
	 */
	public int getHours() {
		return hours;
	}

	/**
	 * @return the minutes
	 * @gets defined minutes
	 */
	public int getMinutes() {
		return minutes;
	}

	/**
	 * @return the seconds
	 * @gets defined seconds
	 */
	public int getSeconds() {
		return seconds;
	}
/**
 * Increments seconds 
 * if >= 60 increments minutes
 * if minutes >= 60 
 * increments hours 
 * returns seconds as 00 if function is applied 
 */
	
	public void incrementSeconds() {
		// TODO Auto-generated method
		seconds++;
		if (seconds >= 60) {
			minutes++;

			if (minutes >= 60) {
				hours++;
				minutes = 00;
			}
			seconds = 00;
		}

	}
/**
 *Increments minutes
 *adds one to minutes if >=60 @return 0 and 
 *add 1 to hours
 */
	public void incrementMinutes() {
		minutes++;

		if (minutes >= 60) {
			hours++;
			minutes = 00;
		}

	}
/*
 * increments hours if hours >=24
 * @returns 0
 */
	public void incrementHours() {
		hours++;

		if (hours >= 24) {

			hours = 00;
		}

	}

}
