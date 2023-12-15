package id.ac.undiksha.ais.people;

public class Human {

	private String name;
	private String birthDate;
	private boolean gender; // 0=female and 1=male, bipolar ga diajak DD
	private String address;
	
	public Human(){
		this.name = "<ea name>";
		this.birthDate = "<ea birthdate>";
		this.address = "<ea address>";
	}
	
	public Human(String name, String birthDate, boolean gender, String address) {
		super();
		this.name = name;
		this.birthDate = birthDate;
		this.gender = gender;
		this.address = address;
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
	
	public void printAll() {
		System.out.println("Name : " + this.name);
		
		if (this.gender) {
			System.out.println("Gender : Male");
		}
		else {
			System.out.println("Gender : Female");
		}
		System.out.println("Address : " + this.address);
		System.out.println("Birth Date : " + this.birthDate);
	}
}
