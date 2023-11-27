package id.ac.undiksha.ais.people;

public class Student {

	private String studentId;
	private String name;
	private String birthDate;
	private boolean gender; // 0=female and 1=male, bipolar ga diajak DD
	private String address;
	private int smtr;

	public String getStudentId() {
		return this.studentId;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(String birthDate) {
		this.birthDate = birthDate;
	}

	public boolean isGender() {
		return gender;
	}

	public String getGender() {
		if (this.isGender()) {
			return "Male";
		}
		else {
			return "Female";
		}	
	}
	
	public void setGender(boolean gender) {
		this.gender = gender;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getSmtr() {
		return smtr;
	}

	public void setSmtr(int smtr) {
		this.smtr = smtr;
	}

	public void setStudentId(String studentId) {
		this.studentId = studentId;
	}
	
	public void printAll() {
		System.out.println("Name : " + this.name);
		System.out.println("Student ID : " + this.studentId);
		if (this.gender) {
			System.out.println("Gender : Male");
		}
		else {
			System.out.println("Gender : Female");
		}
		System.out.println("Address : " + this.address);
		System.out.println("Smtr : " + this.smtr);
		
//		student1.studentId = "21345";
//		student1.birthDate = "1 January 2003";
//		student1.smtr = 6;
//		student1.address = "Singaraja"
	}
}
