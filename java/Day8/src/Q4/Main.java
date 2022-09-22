package Q4;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		  System.out.println(args[0]);
		int val= Integer.parseInt(args[0]);
		int vala= Integer.parseInt(args[1]);
		if(args.length==1) {
			int mul=1;
			  for(int a=1;a<=val;a++) {
				  mul=mul*a;
			  }
			  System.out.println(mul);
		}
		else if(args.length==2) {

			int x=Math.abs((val+vala)/2);
			System.out.println(x);
		}else {
			System.out.println("Error");
		}

		
		
		
		
		}
	
		

	
			
			
			
	}
	


