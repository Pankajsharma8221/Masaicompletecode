package q6;

import java.util.Scanner;

public class CommerceStudent implements Student{
	
	@Override
	public double findPercentage() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Marks for accountMarks:");
		int ph=sc.nextInt();
		
		System.out.println("Enter the Marks for economicsMarks:");
		int ch=sc.nextInt();
		
		System.out.println("Enter the Marks for businessStudiesMarks:");
		int ma=sc.nextInt();
		

		
		double sum=((ph+ch+ma)/300) * 100;
		
		return sum;
		
	}
	
	
	
	
	private int accountMarks;
	private int economicsMarks;
	private int businessStudiesMarks;
	

	
	
	CommerceStudent(){
		
	}
	
	
	public int getAccountMarks() {
		return accountMarks;
	}
	public void setAccountMarks(int accountMarks) {
		this.accountMarks = accountMarks;
	}
	public int getEconomicsMarks() {
		return economicsMarks;
	}
	public void setEconomicsMarks(int economicsMarks) {
		this.economicsMarks = economicsMarks;
	}
	public int getBusinessStudiesMarks() {
		return businessStudiesMarks;
	}
	public void setBusinessStudiesMarks(int businessStudiesMarks) {
		this.businessStudiesMarks = businessStudiesMarks;
	}

}