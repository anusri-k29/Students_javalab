# Student Management System

This project is a **Student Management System** implemented in Java. It allows users to add, update, delete, and search for student details using a menu-driven approach.

## Files in the Repository

1. **Student.java** - Defines the `Student` class with attributes like name, PRN, branch, batch, and CGPA. It includes getter and setter methods along with a display function.
2. **Main.java** - Handles user input and provides a menu-driven interface for interacting with the student records.
3. **StudentOperations.java** - Implements the core functionalities, including adding, searching, updating, and deleting student records using an ArrayList.

## Features
✅ Add new students to the system  
✅ Display all students  
✅ Search students by PRN, Name, or Position  
✅ Update student details  
✅ Delete student records  
✅ Menu-driven interface for easy interaction  
✅ Showcases **classes, array of objects, instance members, and constructors in Java**  

## Function and Method Descriptions

### **Student.java**
- **`Student(String name, int prn, String branch, String batch, float cgpa)`**: Constructor that initializes student details.
- **`getName()` / `setName(String name)`**: Getter and setter for student name.
- **`getPRN()` / `setPRN(int prn)`**: Getter and setter for student PRN.
- **`getBranch()` / `setBranch(String branch)`**: Getter and setter for student branch.
- **`getBatch()` / `setBatch(String batch)`**: Getter and setter for student batch.
- **`getCgpa()` / `setCgpa(float cgpa)`**: Getter and setter for student CGPA.
- **`display()`**: Prints student details.

### **StudentOperations.java**
- **`StudentOperations()`**: Constructor that initializes an empty `ArrayList` of students.
- **`addStudent(Student student)`**: Adds a student to the list.
- **`displayStudents()`**: Displays all students in the list.
- **`searchByPRN(int prn)`**: Finds and displays a student by PRN.
- **`searchByName(String name)`**: Finds and displays students with a matching name.
- **`searchByPosition(int position)`**: Retrieves and displays a student at a specific position in the list.
- **`updateStudent(int prn, String name, String branch, String batch, float cgpa)`**: Updates the details of a student based on PRN.
- **`deleteStudent(int prn)`**: Deletes a student from the list based on PRN.

### **Main.java**
- **Handles user input** to interact with the system.
- **Allows the user to perform operations** such as adding, searching, updating, and deleting student records using a menu-driven interface.
- **Uses `Scanner` for input handling** and manages program flow.

## How to Run the Project
1. Clone the repository:
   ```bash
   git clone https://github.com/your-username/student-management-system.git
   ```
2. Navigate to the project directory:
   ```bash
   cd student-management-system
   ```
3. Compile the Java files:
   ```bash
   javac Main.java Student.java StudentOperations.java
   ```
4. Run the program:
   ```bash
   java Main
   ```

## Author
**Anusri Kadam**  
PRN: 23070126016  
SY AIML A1  

## License
This project is open-source and available under the MIT License.
