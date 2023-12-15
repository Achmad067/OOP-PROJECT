package id.ac.undiksha.ais.people;

import id.ac.undiksha.ais.organizations.StudyProgram;
//only can extend 1 class. we can implement more than 1 interface
public class Student extends Human{

	private String studentId;
	private int smtr;
	
	public Student(){
		this.studentId = "<Student Id>";
		this.smtr = 0;
	}
	
	

	public Student(String studentId, String name, String birthDate, boolean gender, String address, int smtr) {
		super();
		this.studentId = studentId;
		this.smtr = smtr;
	}

	

// polymorphism, overloading, from human superclass to student	
	public Student(
			String name, 
			String birthDate, 
			boolean gender, 
			String address, 
			String studentId, 
			int smtr) 
	{
		super(name, birthDate, gender, address);
		this.studentId = studentId;
		this.smtr = smtr;
	}



	public Student(
			String name, 
			String birthDate, 
			boolean gender, 
			String address) 
	{
		super(name, birthDate, gender, address);
		
	}



	public String getStudentId() {
		return studentId;
	}



	public void setStudentId(String studentId) {
		this.studentId = studentId;
	}



	public int getSmtr() {
		return smtr;
	}



	public void setSmtr(int smtr) {
		this.smtr = smtr;
	}


	@Override
	public void printAll() {
		super.printAll();
		System.out.println("Student ID : " + this.studentId);
		System.out.println("Smtr : " + this.smtr);
		
//		student1.studentId = "21345";
//		student1.birthDate = "1 January 2003";
//		student1.smtr = 6;
//		student1.address = "Singaraja"
	}
	
	public StudyProgram prodi = new StudyProgram();
	
}