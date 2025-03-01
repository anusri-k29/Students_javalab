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
		System.out.println("Enter choice 1.Enter details of next student  2. Go to operations menu");
		choice = Integer.parseInt(scan.nextLine());
		}while(choice != 2);
		
		
		int menuChoice;
        do {
            System.out.println("\n1. Display All Students\n2. Search by PRN\n3. Search by Name\n4. Search by Position\n5. Update Student\n6. Delete Student\n7. Exit");
            System.out.print("Enter your choice: ");
            menuChoice = Integer.parseInt(scan.nextLine());

            switch (menuChoice) {
                case 1:
                    operations.displayStudents();
                    break;
                case 2:
                    System.out.println("Enter PRN to search: ");
                    int searchPrn = Integer.parseInt(scan.nextLine());
                    operations.searchByPRN(searchPrn);
                    break;
                case 3:
                    System.out.println("Enter Name to search: ");
                    String searchName = scan.nextLine();
                    operations.searchByName(searchName);
                    break;
                case 4:
                    System.out.println("Enter Position to search: ");
                    int position = Integer.parseInt(scan.nextLine());
                    operations.searchByPosition(position);
                    break;
                case 5:
                    System.out.println("Enter PRN of student to update: ");
                    int updatePrn = Integer.parseInt(scan.nextLine());
                    System.out.println("Enter New Name: ");
                    String newName = scan.nextLine();
                    System.out.println("Enter New Branch: ");
                    String newBranch = scan.nextLine();
                    System.out.println("Enter New Batch: ");
                    String newBatch = scan.nextLine();
                    System.out.println("Enter New CGPA: ");
                    float newCgpa = Float.parseFloat(scan.nextLine());
                    operations.updateStudent(updatePrn, newName, newBranch, newBatch, newCgpa);
                    break;
                case 6:
                    System.out.println("Enter PRN of student to delete: ");
                    int deletePrn = Integer.parseInt(scan.nextLine());
                    operations.deleteStudent(deletePrn);
                    break;
                case 7:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice! Try again.");
            }
        } while (menuChoice != 7);
    }
		
		
}	
