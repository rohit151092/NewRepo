package com.infy.sample;

import org.joda.time.DateTime;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;

public class DateTimeDemo {
	public static void main(String[] args) {
		DateTimeFormatter dateTimeFormatter = DateTimeFormat.forPattern("MMMM YYYY");
		String currentDate = "November 2018";
		String dateToBeselected = "March 2019";
		DateTime currentDateTime = dateTimeFormatter.parseDateTime(currentDate);
		DateTime dateTimeToBeselected = dateTimeFormatter.parseDateTime(dateToBeselected);
		int diffMonths = (dateTimeToBeselected.getYear() - currentDateTime.getYear()) * 12
				+ dateTimeToBeselected.getMonthOfYear() - currentDateTime.getMonthOfYear();
		System.out.println(diffMonths);
		for (int i = 0; i < diffMonths; i++) {
			System.out.println(diffMonths);
		}

	}

}
