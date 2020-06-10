package com.sow.math;

import java.util.Calendar;
import java.util.Scanner;

public class GetdayFromDate {
	    static Calendar c = Calendar.getInstance();
	    static String strDays[] = new String[] { "Sunday", "Monday", "Tuesday",  "Wednesday","Thursday", "Friday", "Saturday" };

	    private static String getDay(String date, String month, String year) {
	        String dayName = null;
	        int yr = Integer.parseInt(year);
	        if (2000 <= yr && yr <= 3000) {
	            c.set(yr, Integer.parseInt(month), Integer.parseInt(date));
	            dayName = strDays[(c.get(Calendar.DAY_OF_WEEK)-1)].toUpperCase();
	        }
	        
	        return dayName;
	    }

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String day = in.next();
		String month = in.next();
		String year = in.next();

		System.out.println(getDay(day, month, year));

	}

}
