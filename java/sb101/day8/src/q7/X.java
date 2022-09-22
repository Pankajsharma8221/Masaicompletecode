package q7;
//Q7) Create an application in which start 2 threads along with main thread :
//● Both threads will print their priority along with the thread name 10 times.
//● From the main method set the name of both the thread as Dhoni thread for thread 1
//And Kohli thread for thread 2,
//● Set the priority for thread1 as 8 and thread2 as 10.
//Note: Both threads should run on a single object

public class X {
	  public static void main(String[] args) {
			
	    	 RunThread t1=new RunThread();
	    	
	    	 Thread t=new Thread(t1);
	    	 Thread tt=new Thread(t1);
	    	 
	    	 t.setPriority(8);
	    	 tt.setPriority(10);
	    	 
	    	 t.setName("Dhoni");
	    	 tt.setName("Kohli");
	    	 
	    	 t.start();
	    	 tt.start();
	    	 
	    	    
	       }
}
