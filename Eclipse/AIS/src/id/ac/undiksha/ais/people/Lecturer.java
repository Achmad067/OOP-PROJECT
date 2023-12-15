package id.ac.undiksha.ais.people;

public class Lecturer extends Human{

	private String lectureId;
	private String faculty;
	private String department;
	private String studyProgram;
	
	public Lecturer() {
		this.lectureId = "<Lecture id>";
		this.faculty = "<Lecture faculty>";
		this.department = "<Lecture department>";
		this.studyProgram = "<Lecture StudyProgram>";
	}
	
	
	
	public Lecturer(String lectureId, String name, boolean gender, String address, String birthDate, String faculty,
			String department, String studyProgram) {
		super();
		this.lectureId = lectureId;
		this.faculty = faculty;
		this.department = department;
		this.studyProgram = studyProgram;
	}

	
	

	public String getLectureId() {
		return this.lectureId;
	}

	public void setLectureId(String lectureId) {
		this.lectureId = lectureId;
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
		super.printAll();
		System.out.println("Faculty : " + this.faculty);
		System.out.println("Department : " + this.department);
		System.out.println("Program Study : " + this.studyProgram);
		
	}
	
}
