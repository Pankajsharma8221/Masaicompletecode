package q3;

public class ThreadA extends Thread {
	@Override
	public void run() {
	     for(int i=1; i<=20; i++) {
	    	 if(i%2 ==0) {
	    		 System.out.println("Even Number :"+i);
	    	 }
	     }
		
	}
}
