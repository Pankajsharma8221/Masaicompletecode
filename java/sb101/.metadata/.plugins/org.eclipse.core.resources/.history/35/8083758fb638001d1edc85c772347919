package p;

class X extends Thread{
@Override
public void run(){
for(int i=0;i<30;i++){
System.out.println("inside run mehod "+i);
}
System.out.println("end of run() method");
}


public static void main(String[] args){
//------here one thread (main)
X x1=new X();
//x1.run();//it will be called as a normal method.
x1.start();//here second thread will start
for(int i=25;i<60;i++){
System.out.println("inside main mehod"+i);
}
System.out.println("end of main()..");
}
}