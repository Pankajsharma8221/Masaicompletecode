package q4;

import java.util.ArrayList;


public class Test  implements Intr{

	@Override
	public int[] display(int p) {
ArrayList<Integer>arr=new ArrayList();
	boolean flag=false;
	for(int a=2;a<p/2;a++) {
		if(p%a==0) {
			flag=true;
			break;
		}
	}
	
	if(!flag) {
		arr.add(p);
		return arr;
	
	}
		
	}
}
