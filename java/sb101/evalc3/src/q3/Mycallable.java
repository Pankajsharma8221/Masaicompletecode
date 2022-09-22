package q3;

import java.util.concurrent.Callable;

//Q3/- Create a ThreadPool of 3 threads, submit the 6 tasks using Callable, and from each
//task calculate the product of supplied number from 1 and return the product from each
//thread. And then print the result.


public class Mycallable implements Callable {

	int num;
	public Mycallable(int num) {
		this.num=num;
	}
	@Override
	public Object call() throws Exception {
		// TODO Auto-generated method stub
		System.out.println(Thread.currentThread().getName()+" .. is responsible to find the product "+num+" numbers");
		int pro=1;
		for(int a=1;a<=num;a++) {
			pro=pro*a;
		}
		return pro;
	}
	

}
