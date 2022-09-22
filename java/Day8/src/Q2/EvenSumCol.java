package Q2;
import java.util.Scanner;

public class EvenSumCol {

	
	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
	System.out.println("Enter the row value");
		
		int row=s.nextInt();
		
		
	System.out.println("Enter the column value");
		
		int col=s.nextInt();
		int[][]  arr= new int[row][col];
		int c=1;
for(int i=0;i<row;i++) {
			int bag=0;
			for(int j=0;j<col;j++) {
				
				arr[j][i]=c;
				c++;
			
//				
				
			}	
			
//			System.out.println();
		}

for(int[] ar:arr) {
	int bag=0;
	for(int j:ar) {
		if(j%2==0) {
			bag=bag+j;
			
		}
		
	}System.out.println(bag);
	
}


		
  
    
		
		

	
		
		
	}
}
