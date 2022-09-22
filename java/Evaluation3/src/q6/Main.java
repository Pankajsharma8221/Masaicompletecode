package q6;

import java.util.Scanner;




public class Main {
	public static double getStudent(int choice) {
	
		ArtStudent ar=new ArtStudent();
		ScienceStudent sc=new ScienceStudent();
		CommerceStudent cr=new CommerceStudent();
		
		 
		if(choice == 1) {
		return  ar.findPercentage();
		}
		else if(choice ==2){
			return sc.findPercentage();
		}
		else {
			return cr.findPercentage();		}
		
	};

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Which Student percentage do you want to find:\r\n"
				+ "1. ArtStudent\r\n"
				+ "2. ScienceStudent\r\n"
				+ "3. CommerceStudent\r\n"
				+ "");
		
		int v=sc.nextInt();
	
		double marks= getStudent(v);
		System.out.println("Percentage is:"+marks);
		
		

	}

}