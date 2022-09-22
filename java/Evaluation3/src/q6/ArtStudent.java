package q6;
import java.util.Scanner;

public class ArtStudent implements Student{
	
	@Override
	public double findPercentage() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Marks for hindiMarks:");
		int ph=sc.nextInt();
		
		System.out.println("Enter the Marks for englishMarks:");
		int ch=sc.nextInt();
		
		System.out.println("Enter the Marks for historyMarks:");
		int ma=sc.nextInt();
		

		
		double sum=((ph+ch+ma)/300) * 100;
		
	
		return sum;
		
	}
	
	
	private int hindiMarks;
	private int englishMarks;
	private int historyMarks;
	
	
	ArtStudent(){
		
	}
	
	
	public int getEnglishMarks() {
		return englishMarks;
	}
	public void setEnglishMarks(int englishMarks) {
		this.englishMarks = englishMarks;
	}
	
	public int getHistoryMarks() {
		return historyMarks;
	}
	public void setHistoryMarks(int historyMarks) {
		this.historyMarks = historyMarks;
	}
	
	public int getHindiMarks() {
		return hindiMarks;
	}
	public void setHindiMarks(int hindiMarks) {
		this.hindiMarks = hindiMarks;
	}

}