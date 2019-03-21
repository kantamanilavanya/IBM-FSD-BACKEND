package com.Date;

import java.time.DayOfWeek;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.TemporalAdjusters;
import java.util.Calendar;
import java.util.Date;

public class DateExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Date myDate=new Date();
		System.out.println(myDate);
		Date yesterday=new Date(2019,02,13);
		System.out.println(yesterday);
		
		Calendar cal=Calendar.getInstance();
		System.out.println(cal.getTimeInMillis());
		System.out.println(cal.getTime());
		//System.out.println(cal.get);
		
		Instant now=Instant.now();
		System.out.println(now);
		
		LocalDateTime d1= LocalDateTime.now();
		System.out.println(d1);
		LocalDateTime d2=d1.with(TemporalAdjusters.next(DayOfWeek.TUESDAY));
		System.out.println();
		System.out.println(d2);
		System.out.println(d2.getDayOfMonth());
		System.out.println(d2.getDayOfYear());
		System.out.println(d2.getYear());
		System.out.println(d2.getMonthValue());
		

	}

}
