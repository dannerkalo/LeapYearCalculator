package leapyearcalculator;

public class LeapYearCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("LeapYear: " + isLeapYear(2000));
	}
	
	//isLeapYear
	public static boolean isLeapYear(int year) {
		
		if(year >= 1) {	
			if( year % 4 == 0 &&  year % 100 == 0 &&  year % 400 == 0 ) {
				
				/*
				 * System.out.println("Divided by 4 = " + year % 4);
				 * System.out.println("Divided by 100 = " + year % 100);
				 * System.out.println("Divided by 400 = " + year % 400);
				 */
				 
				return true;
			}
		}
		return false;	
	}
	

}
