package q6;

import java.util.Scanner;

public class ScienceStudent implements Student {
	
	@Override
	public double findPercentage() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Marks for physicsMarks:");
		int ph=sc.nextInt();
		
		System.out.println("Enter the Marks for chemistryMarks:");
		int ch=sc.nextInt();
		
		System.out.println("Enter the Marks for mathsMarks:");
		int ma=sc.nextInt();
		
		System.out.println("Enter the Marks for biologyMarks:");
		int bio=sc.nextInt();
		
		double sum=((ph+ch+ma+bio)/400) * 100;
		
		return sum;
		
	}
   private int physicsMarks;
   private int chemistryMarks;
   private int mathsMarks;
   private int biologyMarks;
   
   
   
   ScienceStudent(){
	   
   }
	
	
	public int getPhysicsMarks() {
		return physicsMarks;
	}
	public void setPhysicsMarks(int physicsMarks) {
		this.physicsMarks = physicsMarks;
	}
	public int getChemistryMarks() {
		return chemistryMarks;
	}
	public void setChemistryMarks(int chemistryMarks) {
		this.chemistryMarks = chemistryMarks;
	}
	public int getMathsMarks() {
		return mathsMarks;
	}
	public void setMathsMarks(int mathsMarks) {
		this.mathsMarks = mathsMarks;
	}
	public int getBiologyMarks() {
		return biologyMarks;
	}
	public void setBiologyMarks(int biologyMarks) {
		this.biologyMarks = biologyMarks;
	}


}