//Student.java

class Student{
		private String name;
		private int prn;
		private String branch;
		private String batch;
		private float cgpa;
		//constructor
		public Student(String name, int prn, String branch, String batch, float cgpa){
				setName(name);
				setPRN(prn);
				setBranch(branch);
				setBatch(batch);
				setCgpa(cgpa);
		}	
		
		//getter and setter name
		
		public String getName(){ //returns a string
				return name;
		}
		public void setName(String name){ //gets parameter as name and initializes with current instance
			this.name = name;
		}
		
		//getter and setter PRN 
		public int getPRN() {
			return prn;
		}
		
		public void setPRN(int prn){
			this.prn = prn;
		}
		
		//getter and setter branch
		
		public String getBranch(){ //returns a string
				return branch;
		}
		public void setBranch(String branch){ //gets parameter as branch and initializes with current instance
			this.branch = branch;
		}
		//getter and setter batch
		
		public String getBatch(){ //returns a string
				return batch;
		}
		public void setBatch(String batch){ 
			this.batch = batch;
		}
		//getter and setter cgpa 
		public float getCgpa() {
			return cgpa;
		}
		
		public void setCgpa(float cgpa){
			this.cgpa = cgpa;
		}
		
		public void display() {
			System.out.println("Name: " +getName()+" PRN: "+getPRN()+  "Branch: "+getBranch()+" Batch: "+getBatch()+" CGPA: "+getCgpa());
		}
		
}