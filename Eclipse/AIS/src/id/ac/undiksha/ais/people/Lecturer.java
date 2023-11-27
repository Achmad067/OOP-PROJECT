package id.ac.undiksha.ais.people;

public class Lecturer {

	private String lectureId;
	private String name;
	private boolean gender; // 0=female and 1=male
	private String address;
	private String birthDate;
	private String faculty;
	private String department;
	private String studyProgram;
	
	public String getLectureId() {
		return this.lectureId;
	}

	public void setLectureId(String lectureId) {
		this.lectureId = lectureId;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
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

	public String getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(String birthDate) {
		this.birthDate = birthDate;
	}

	public String getFaculty() {
		return faculty;
	}

	public void setFaculty(String faculty) {
		this.faculty = faculty;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public String getStudyProgram() {
		return studyProgram;
	}

	public void setStudyProgram(String studyProgram) {
		this.studyProgram = studyProgram;
	}
	
	public void printAll() {
		System.out.println("Name :" + this.name);
		
		if (this.gender) {
			System.out.println("Gender : Male");
		}
		else {
			System.out.println("Gender : Female");
		}
		System.out.println("Address : " + this.address);
		System.out.println("Birth Date : " + this.birthDate);
		System.out.println("Faculty : " + this.faculty);
		System.out.println("Department : " + this.department);
		System.out.println("Program Study : " + this.studyProgram);
		
	}
	
}
