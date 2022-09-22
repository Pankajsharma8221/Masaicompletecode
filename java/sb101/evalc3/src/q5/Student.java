package q5;

public class Student {
	
	private int roll;
	private String name;
	private int marks;
	private String email;
	private String password;
	
	
	public Student() {
		// TODO Auto-generated constructor stub
	}
	
	public Student(int roll,String name,int marks,String email,String password) {
		this.roll=roll;
		this.name=name;
		this.marks=marks;
		this.email=email;
		this.password=password;
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Student [roll=" + roll + ", name=" + name + ", marks=" + marks + ", email=" + email + ", password="
				+ password + ", address=" + address + "]";
	}

	private Address address;

	public int getRoll() {
		return roll;
	}

	public void setRoll(int roll) {
		this.roll = roll;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getMarks() {
		return marks;
	}

	public void setMarks(int marks) {
		this.marks = marks;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}



}