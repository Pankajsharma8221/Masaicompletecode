package q3;
//Q3/- Create two threads, one thread to display all even numbers between 1 & 20, another to
//display odd numbers
//between 1 & 20.
//Note: Display all even numbers followed by odd numbers from the main method.
//Hint: use join


public class X {
	public static void main(String[] args) {
		ThreadA ta=new ThreadA();
		ThreadB tb=new ThreadB(ta);
		
		ta.start();
		tb.start();
		
	}
}
