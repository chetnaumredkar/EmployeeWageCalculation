package com.bridgelabz;

public class ComputationOfEmployeeWage {
	public static void main(String[] args) {
		int Emp_Rate_Per_Hour = 20;
		int Full_Day_Hour = 8;
		int IS_FULL_TIME = 1;
		int IS_PART_TIME = 2;
		int empHrs = 0;
		int empWage = 0;
		int Total_Working_Day=20;
		int Total_Income;
		for(int i=0;i<20;i++) {
		int empcheck =(int) ((Math.random()*100) % 3);
		switch(empcheck)  
        {
            case 1:
                empHrs=16;
                break;
            case 2:
                empHrs= 8;
                break;
           default:
                empHrs= 0;
                break;
        }
		
		empWage+=  (empHrs * Emp_Rate_Per_Hour);
		}
		System.out.println("Daily emp wage: " + empWage);
		//Total_Income=empWage*Total_Working_Day;			
		//System.out.println("The total income of an employee in a month is :"+Total_Income+"RS");
			
		
	}
}
