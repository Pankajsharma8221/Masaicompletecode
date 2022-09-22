package q4;

//Q4/- Write a multithreading application which should perform the following task:
//● Start the 3 thread
//● Give the name of those threads as Kohli, Dhoni, Rohit
//● Set the max priority to the Dhoni thread.
//● Kohli thread should print from 1 to 10 number
//● Dhoni thread should print Addition of first 20 number.
//● Rohit Thread should print the product of first 10 number.
//Note: Make sure that first Dhoni thread should print then Rohit Thread and then Kohli
//Thread.

public class Main {

	
	public static void main(String[] args) {
		Runthe t=new Runthe();
		Thread t1= new Thread(t);
		Thread t2= new Thread(t);
		Thread t3= new Thread(t);
		
		t2.setPriority(10);
		t1.setName("Virat Kohli");
		t2.setName("M.S. Dhoni");
		t3.setName("Rohit Sharma");
		
		
		t1.start();
		t2.start();
		t3.start();
		
		
	}
}
