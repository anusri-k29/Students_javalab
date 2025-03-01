//Main.java
//Anusri Kadam
//PRN: 23070126016
//SY AIML A1

import java.util.*;
class Main{
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		int choice = 1;
		StudentOperations operations = new StudentOperations();
		do{ //for multiple students
		
		System.out.println("Enter Name: ");
		String name = scan.nextLine();
		
		System.out.println("Enter PRN: ");
		int prn = Integer.parseInt(scan.nextLine());
		
		System.out.println("Enter branch: ");
		String branch = scan.nextLine();
		
		System.out.println("Enter batch: ");
		String batch = scan.nextLine();
		
		System.out.println("Enter cgpa: ");
		float cgpa = Float.parseFloat(scan.nextLine());
		
		
		//object creation
		
		Student student = new Student(name,prn,branch,batch,cgpa);
		
		operations.addStudent(student);//adding student
		System.out.println("Enter choice 1. Continue 2.Exit");
		choice = Integer.parseInt(scan.nextLine());
		}while(choice != 2);
		operations.displayStudents();//display student
		
		
	}	
}