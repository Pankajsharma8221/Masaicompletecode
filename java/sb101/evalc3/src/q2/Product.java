package q2;

public class Product extends Thread{
int p=1;
@Override
public void run() {
	synchronized(this) {
		for(int a=1;a<=10;a++) {
			p=p*a;
		}
		this.notify();
	}
}
}
