package com.java7;

public class StringInSwitchStatement {
	private static final String JANUARY="JANUARY";
	private static final String FEBRUARY="FEBRUARY";
	private static final String MARCH="MARCH";
	private static final String APRIL="APRIL";
	private static final String MAY="MAY";
	private static final String JUNE="JUNE";
	private static final String JULY="JULY";
	private static final String AUGUST="AUGUST";
	private static final String SEPTEMBER="SEPTEMBER";
	private static final String OCTOBER="OCTOBER";
	private static final String NOVEMBER="NOVEMBER";
	private static final String DECEMBER="DECEMBER";

	public static void main(String[] args) {
		String month = APRIL;
		beforeJava7(month);
		afterJava7(month);
		}

	private static void afterJava7(String month) {
		System.out.println("Inside afterJava7===============: ");
		switch(month) {
		case JANUARY:
		case FEBRUARY:
		case MARCH:
			System.out.println("Season in winter");
			break;
		case APRIL:
		case MAY:
		case JUNE:
		case JULY:
			System.out.println("Season is summer");
			break;
		case AUGUST:
		case SEPTEMBER:
			System.out.println("Season is rainy");
			break;
		case OCTOBER:
		case NOVEMBER:
		case DECEMBER:
			System.out.println("Season is winter");
			break;
		default:
			System.out.println("Invalid month value");
		}
		
	}

	private static void beforeJava7(String month) {
		System.out.println("Inside beforeJava7===============: ");
		if(month.equals(JANUARY) || month.equals(FEBRUARY)||month.equals(MARCH)){
			System.out.println("Season in winter");
		}else if(month.equals(APRIL)||month.equals(MAY)||month.equals(JUNE)||month.equals(JULY)) {
			System.out.println("Season is summer");
		}else if(month.equals(AUGUST) || month.equals(SEPTEMBER)){
			System.out.println("Season is rainy");
		}else if(month.equals(OCTOBER) || month.equals(NOVEMBER)||month.equals(DECEMBER)){
			System.out.println("Season is winter");
		}else {
			System.out.println("Invalid month value");
		}
	}


}
