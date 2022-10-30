package com.bridgelabz;

public class ComputationOfEmployeeWage {
	public static void main(String[] args) {
		int Emp_Rate_Per_Hour = 20;
		int Full_Day_Hour = 8;
		int IS_FULL_TIME = 1;
		int IS_PART_TIME = 2;
		int empHrs = 0;
		int empWage = 0;
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
		
	
		empWage = empHrs * Emp_Rate_Per_Hour;
		System.out.println("emp wage: " + empWage);
	}
}