//StudentOperations.java

//CRUD operations on arraylist

import java.util.*;
class StudentOperations{
	
		ArrayList <Student> students; //arraylist will contain int and strings of student details
		
		public StudentOperations(){
			this.students = new ArrayList<>(); //initialize arraylist
			
		}
		//method to add students
		public void addStudent(Student student){
			students.add(student);
			System.out.println("Student added!");
		}
		//method to display the students details
		public void displayStudents() {
			for (Student student : students){ //for every student in students arraylist, display the details
				student.display();
			}
		}
	
	
	
	
		
}