package com.bridgelabz;

public class ComputationOfEmployeeWage {
	public static void main(String[] args) {
		int Emp_Rate_Per_Hour = 20;
		int Full_Day_Hour = 8;
		int IS_FULL_TIME = 1;
		int PART_TIME = 0;
		int empHrs = 0;
		int empWage = 0;
		double empcheck = Math.floor(Math.random() * 10) % 2;
		if (empcheck == IS_FULL_TIME) {
			System.out.println("Employee is Present");
		} else {
			System.out.println("Employee is not Present");
		}
		// =-------------------------------------------------------------------------------
		// UC2 problem solving
		if (empcheck == IS_FULL_TIME) {
			empHrs = 8;
		} else {
			empHrs = 0;
		}
		empWage = empHrs * Emp_Rate_Per_Hour;
		System.out.println("emp wage: " + empWage);
	}
}
