package id.ac.undiksha.ais;

import id.ac.undiksha.ais.people.Student;
import id.ac.undiksha.ais.people.Lecturer;
import id.ac.undiksha.ais.people.Human;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Student student1 = new Student();
		
//		student1.getStudentId()
		
		student1.setStudentId("12456");
		student1.setName("Ani");
		student1.setBirthDate("1 January 2003");
		student1.setGender(false);
		student1.setAddress("Singaraja");
		student1.setSmtr(3);
		
		System.out.println("-std1-");
		student1.printAll();
		System.out.println("--------");
		
		
	Student student2 = new Student();
		System.out.println("-std2-");
		student2.printAll();
		System.out.println("--------");
		
		
	Student student3 = new Student(
			"Budi",
			"2 januari 2000",
			true,
			"Gianyar",
			"12345",
			3
		);
	
	System.out.println("-std3-");
	student3.printAll();
	System.out.println("--------");
	
	Lecturer lecture2 = new Lecturer();
	
	
	Lecturer lecture1 = new Lecturer();
	
		lecture1.setLectureId("1901412849");
		lecture1.setName("AI");
		lecture1.setGender(true);
		lecture1.setAddress("Buleleng");
		lecture1.setBirthDate("7 Juni 1992");
		lecture1.setDepartment("IT");
		lecture1.setFaculty("Teknik");
		lecture1.setStudyProgram("Computer Science");
		
		System.out.println("-lecture1-");
		lecture1.printAll();
		System.out.println("--------");
		
		student3.prodi.setStudyProgramId(null);
		student3.prodi.setDepartmentName();
		student3.prodi.getFacultyCode();
;		
		
//		Student student4 = new Human(); // human tidak tau cara membuat student
		
		Human student5 = new Student(); //student tau cara membuat human 
		
		Human human1 = new Student();
		human1.setName(null);
		
		System.out.println("-human-");
		human1.printAll();
		System.out.println("--------");
		
		// abstract class and interface
		// human is abstract (abstract class), the concept exist, but the object doesn't. superclass(?)
		
//		student1.name = "Ani";
//		student1.studentId = "21345";
//		student1.birthDate = "1 January 2003";
//		student1.gender = false;
//		student1.smtr = 6;
//		student1.address = "Singaraja";
//		
//		System.out.print(student1.name);
//		System.out.print(student1.studentId);
//		System.out.print(student1.birthDate);
//		System.out.print(student1.gender);
//		
//		if (student1.gender)
//			System.out.printLn("Male");
//		else
//			System.out.printLn("Female");
//		
//		System.out.print(student1.smtr);
//		System.out.print(student1.address);
	}

}
