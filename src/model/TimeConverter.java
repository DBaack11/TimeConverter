/**
 * 
 */
package model;

import java.text.DecimalFormat;

/**
 * @author Devin Baack - dfbaack
 * CIS175 - Spring 2021
 * Feb 18, 2021
 */
public class TimeConverter {

	private double seconds;
	private double minutes;
	private double hours;
	private double days;
	private double months;
	private double years;
	private DecimalFormat df = new DecimalFormat("#,###.###");
	
	
	public TimeConverter() {
		super();
	}
	
	public TimeConverter(int amount, String unit) {
		super();
		if(unit.equals("seconds")) {
			this.setSeconds(amount);
			convertSeconds(amount);
		}else if(unit.equals("minutes")) {
			this.setMinutes(amount);
			convertMinutes(amount);
		}
		
		
	}
	
	public void convertSeconds(int amount) {
		final double MINUTES = 60.0; // number of seconds in a minute
		final double HOURS = 3600.0; // number of seconds in an hour
		final double DAYS = 86400.0; // number of seconds in a day
		final double MONTHS = 2592000.0; // number of seconds in a month
		final double YEARS = 31104000.0; // number of seconds in a year
		
		setMinutes(amount / MINUTES);
		setHours(amount / HOURS);
		setDays(amount / DAYS);
		setMonths(amount / MONTHS);
		setYears(amount / YEARS);
	}
	
	public void convertMinutes(int amount) {
		final double SECONDS = 60.0; // number of seconds in a minute
		final double HOURS = 60.0; // number of minutes in an hour
		final double DAYS = 1440.0; // number of minutes in a day
		final double MONTHS = 43200.0; // number of minutes in a month
		final double YEARS = 518400.0; // number of minutes in a year
		
		setSeconds(amount * SECONDS);
		setHours(amount / HOURS);
		setDays(amount / DAYS);
		setMonths(amount / MONTHS);
		setYears(amount / YEARS);
	}

	public String getSeconds() {
		return df.format(seconds);
	}

	public void setSeconds(double seconds) {
		this.seconds = seconds;
	}

	public String getMinutes() {
		return df.format(minutes);
	}

	public void setMinutes(double d) {
		this.minutes = d;
	}

	public String getHours() {
		return df.format(hours);
	}

	public void setHours(double d) {
		this.hours = d;
	}

	public String getDays() {
		return df.format(days);
	}

	public void setDays(double d) {
		this.days = d;
	}

	public String getMonths() {
		return df.format(months);
	}

	public void setMonths(double d) {
		this.months = d;
	}

	public String getYears() {
		return df.format(years);
	}

	public void setYears(double d) {
		this.years = d;
	}

	@Override
	public String toString() {
		return "TimeConverter [seconds=" + this.getSeconds() + ", minutes=" + this.getMinutes() + ", hours=" + this.getHours() + ", days=" + this.getDays()
				+ ", months=" + this.getMonths() + ", years=" + this.getYears() + "]";
	}
	
		
}
