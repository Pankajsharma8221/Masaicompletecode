package Q5;

public class Student {
 private int roll;
 private String name;
 private String address;
private  int marks;
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
public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}
public int getMarks() {
	return marks;
}
public void setMarks(int marks) {
	this.marks = marks;
}
Student(int roll,String name,String address,int marks){
	this.roll=roll;
	this.name=name;
	this.address=address;
	this.marks=marks;
}


Student(){
	
}
}
