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
		 // Method to search student by PRN
		public void searchByPRN(int prn) {
			for (Student student : students) {
				if (student.getPRN() == prn) {
					student.display();
                return;
				}
			}
        System.out.println("Student with PRN " + prn + " not found.");
		}
		// Method to search student by Name
		public void searchByName(String name) {
			for (Student student : students) {
				if (student.getName().equalsIgnoreCase(name)) {
					student.display();
					return;
				}
			}
			System.out.println("Student with name " + name + " not found.");
		}

		// Method to search student by Position in List
		public void searchByPosition(int position) {
			if (position >= 0 && position < students.size()) {
				students.get(position).display();
			} else {
				System.out.println("Invalid position!");
			}
		}

		// Method to update student details by PRN
		public void updateStudent(int prn, String name, String branch, String batch, float cgpa) {
			for (Student student : students) {
				if (student.getPRN() == prn) {
					student.setName(name);
					student.setBranch(branch);
					student.setBatch(batch);
					student.setCgpa(cgpa);
					System.out.println("Student details updated!");
					return;
				}
			}
			System.out.println("Student with PRN " + prn + " not found.");
		}

		// Method to delete student details by PRN
		public void deleteStudent(int prn) {
			Iterator<Student> iterator = students.iterator();
			while (iterator.hasNext()) {
				if (iterator.next().getPRN() == prn) {
					iterator.remove();
					System.out.println("Student with PRN " + prn + " deleted.");
					return;
				}
			}
			System.out.println("Student with PRN " + prn + " not found.");
		}	
}
