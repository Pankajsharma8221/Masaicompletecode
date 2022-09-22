package q3;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class X {

	public static void main(String[] args)throws Exception {
		
		Mycallable[] val= {
				new Mycallable(5),
				new Mycallable(10),
				new Mycallable(15),
				new Mycallable(16),
				new Mycallable(17),
				new Mycallable(18),
		};
		ExecutorService service=Executors.newFixedThreadPool(3);

		for(Mycallable product:val){
			Future f= service.submit(product);
			System.out.println(f.get());

	};
	service.shutdown();

}
}
