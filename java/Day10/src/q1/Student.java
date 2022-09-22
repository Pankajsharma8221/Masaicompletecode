package q1;

public class Student extends Person{
int StudentId;
String courseEnrolled;
int courseFee;

public String toString() {
	StudentId=26;
	courseEnrolled="JA111";
	courseFee=33;
	return "["+"Studentid"+StudentId+"courseEnrolled"+courseEnrolled+"]";
}
}
