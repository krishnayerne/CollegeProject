package com.sit.collegemanagement.client;

import java.util.Scanner;

import com.sit.collegement.serviceImpl.Karvenagar;

public class Test {

	public static void main(String[] args) {
		
		
		
		Karvenagar k = new Karvenagar();
		Scanner sc = new Scanner(System.in);

		boolean running = true;

		System.out.println("*----WELCOME TO OUR COLLEGE MANAGEMENT SYSTEM----*");
		System.out.println("----------------------------------------------------");
		
		while(running) {
			displayMenu();
			Integer choice = sc.nextInt();
			switch(choice) {
			
			case 1:
				k.addCourse();
				break;
			
			case 2:
				k.viewCourse();
				break;
				
			case 3:
				k.addFaculty();
				break;
				
			case 4:
				k.viewFaculty();
				break;
				
			case 5:
				k.addBatch();
				break;
				
			case 6:
				k.viewBatch();
				break;
				
			case 7:
				k.addStudent();
				break;
				
			case 8:
				k.viewStudent();
				break;
				
			case 0:
				running = false;
				break;
				
			default:
				System.out.println("Invalid Choice::Please re-enter your choice.s");
				
			}
		
		}
	}

	private static void displayMenu() {
	
		System.out.println("Enter your Choice:: ");
		System.out.println("1.AddCourse");
		System.out.println("2.ViewCourse");
		System.out.println("3.AddFaculty");
		System.out.println("4.ViewFaculty");
		System.out.println("5.AddBatch");
		System.out.println("6.ViewBatch");
		System.out.println("7.AddStudent");
		System.out.println("8.ViewStudent");
	}

	
		
		
	}





