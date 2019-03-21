package com.examples.Core;

public class EnumDemo {
	
	public enum weekDay{MONDAY{
		public String getDay() {
			return "monday";
		}
	},TUESDAY{
		public String getDay() {
			return "tuesday";
		}
	},WEDNESDAY,THURSDAY,FRIDAY,SATURDAY,SUNDAY;
		weekDay(){
		System.out.println("constructor");
	};
	public String getDay() {
		return "Default";
	}};
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String day="MONDAY";
		if(weekDay.MONDAY.toString()==day) {
			System.out.println("Today is "+day);
		}
		
		//enum comparision
		if(weekDay.MONDAY==weekDay.valueOf(day)) {
			System.out.println("Today is "+day);
		}
		
		for(Enum days:weekDay.values()) {
			System.out.println(days);
			
		}
		
		System.out.println(weekDay.MONDAY.getDay());
		System.out.println(weekDay.TUESDAY.getDay());

	}

}
