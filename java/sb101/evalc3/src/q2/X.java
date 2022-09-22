package q2;

//Q2/- Make a thread that will calculate the product of 1 to 10 number and another
//thread (main thread ) will print the calculated value of the first thread. Make use of
//wait and notify method.


public class X {

	public static void main(String[] args)throws InterruptedException {
		
		Product p=new Product();
		p.start();
		synchronized(p) {
			p.wait();
		}
		System.out.println(p.p);
	}
}
