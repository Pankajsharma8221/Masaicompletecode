public class Main {
    int i;// instance variable
    // here we declaring the i and never initialize the value it give 0 and in main it give  compilor error


    //    non static method
    void fun1() {
        System.out.println("inside fun of fun1");
    }

    static void fun2() {
        System.out.println("inside the fun2");
    }


    static int j = 200;

    public static void main(String[] args) {
// we acces the staic varible and function in in main directly but not instance
        int x = 10;// local variable primitive variable
//        System.out.println(i);
        System.out.println(j);
        fun2();


        // creatin the object also known as intance of objects
        Main f1 = new Main();// this is the reference variable

        System.out.println(f1.i);
        f1.fun1();
//        creating the object is helpful to access the instance object
          f1.i=100;
        Main f2=f1;
          f2=null;

        System.out.println(f2.i);

    }

    // static loading : a block of code loading into the ram before executed
}