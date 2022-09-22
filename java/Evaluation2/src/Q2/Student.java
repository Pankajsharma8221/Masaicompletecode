package Q2;

public class Student {
	private int rollNumber;
	private String studentName;
	private int marks;

	Student() {

	}

	Student(int rollNumber, String studentName, int marks) {

		this.rollNumber = rollNumber;
		this.marks = marks;
		this.studentName = studentName;
	}

	public int getRollNumber() {
		return rollNumber;
	}

	public void setRollNumber(int rollNumber) {
		this.rollNumber = rollNumber;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public int getMarks() {
		return marks;
	}

	public void setMarks(int marks) {
		this.marks = marks;
	}

	public static void main(String[] args) {
		Student s1 = new Student();
		s1.setRollNumber(101);
		s1.setStudentName("kundan");
		s1.setMarks(200);

		System.out.println("Rollnumber is :" + s1.getRollNumber());
		System.out.println("student name is :" + s1.getStudentName());
		System.out.println("student marks is:" + s1.getMarks());

		Student s2 = new Student(110, "kunal", 100);

		System.out.println("Rollnumber is :" + s2.getRollNumber());
		System.out.println("student name is :" + s2.getStudentName());
		System.out.println("student marks is:" + s2.getMarks());

	}

}