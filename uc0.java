package first;

public class assignOne {
	public static final int WAGE_PER_HOUR = 20;
	public static final int FULL_DAY_HOUR = 8;
	public static final int PART_DAY_HOUR = 4;
	public static final int IS_FULL_TIME =1;
	public static final int IS_PART_TIME=2;
	public static final int NO_OF_WORK_DAYS = 20;
	public static final int HOURS_WORKING = 100;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int dailyempwage = 0;
		int monthlywage =0;
		int noHours =0;
		int noDays = 0;
		System.out.println("Welcome to Employee Wage Computation program");
		while(noDays<=20 && noHours<=100) {
		
		double empCheck = Math.floor(Math.random() * 10) % 3;
//		if( empCheck == 1){
//			System.out.println("Employee is present");
//		}
//		else {
//			System.out.println("Employee is absent");
//		}
		
//		System.out.println("full time employee wage-"+ dailyempwage);
//		System.out.println("part time employee wage-"+ partempwage);
	    switch((int)empCheck) {
	        case IS_FULL_TIME :
	    	   System.out.println("Employer is present");
	    	   noHours = noHours+1;
	    	   noDays = noDays+FULL_DAY_HOUR;
	    	   break;
	        case IS_PART_TIME:
	    	   System.out.println("Employer is absent");
	    	   noHours = noHours + PART_DAY_HOUR;
	    	   noDays = noDays +1;
	    	   break;
	        default:
	    	   System.out.println("Employer is absent");
	    	
	    }
	    dailyempwage = noHours * WAGE_PER_HOUR ;
	    System.out.println("Daily wage-"+ dailyempwage);
	    monthlywage = dailyempwage * NO_OF_WORK_DAYS;
	    System.out.println("Monthlywage-" + monthlywage);
	}
}
}


