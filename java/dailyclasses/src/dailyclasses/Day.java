package dailyclasses;

//public class Day {
//	public static void main(int i) {
//		System.out.println("Inside main "+i);
//	}
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//        Day d1=new Day();
//        Day.main(0);
//        
//        A.main(null);// null is compulsory to pass another classes
//	}
//
//}

//we can call the main of another class of another class

// 

//constructor in java  it is kind of non static method which will be executed
//  executed automatically at the time of creating an object

//Demo d1= new Demo();
//  the meaning of the above 

//public class Day {
//
//	int x = 10;
//	int y;
//
//	void fun1(int a) {
//		System.out.println("inside fun 1");
//	}
//
//	Day() {
//System.out.println("inside contructor of day");	}
//
//	public static void main(String[] args) {
//		Day d1 = new Day();
//		d1.fun1(24);
//		Day d2=new Day();
//	}
//
//}

// strictly speaking , it iws not empty body, there is one hidden statement is there
// inside the default constructor as a first statement.

//contructor name must be class it not have return type static keyword is not applicatble for this constructor is called only one
// method namem can be same a method must have a return type alesat vod method can be static we call multple time a method is abstract and final also.
// similarity botha r the code block , we can write multple executable statement.
// as we can overload a method, we can overload a contructor also. and all the static polymorphism rule are applicabel with the constructor overloading.

//public class Day {
//
//	int x = 10;
//	int y;
//
//	void fun1(int a) {
//		System.out.println("inside fun 1");
//	}
//
//	Day() {
//		System.out.println("inside contructor of day");
//	}
//	
//	Day(int i){
//	System.out.println("inside demo (Int)");
//	System.out.println(i);
//		
//	}
//	Day(A a1){
//	System.out.println("inside demo (Int)");
//	System.out.println(a1);
//		
//	}
//
//	public static void main(String[] args) {
//		Day d1 = new Day();
//	     Day d2=new Day(10);// agr tum constructor declare kar denge to default object jo hum phle create karte the vo nhi denge
//	     Day d3= new Day(new A());
//	}
//	
//	
//	// if we place 4 oveloaded constructor inside our class, then we can create object of our class in 4 ways.
//	
//
//}

// this keword

//it will represnt the curren class object.
//there are 3 uses of this keyword
//
//1 to represnt the currne class object.
//to defrentiate the instance and the local variable.
//to call constructor of a class from the another consuttor of the same calss

//****Note: this keyword we can not use in static variable

//public class Day {
//
//	int x = 10;
//
//
//	void fun1() {
//		System.out.println("inside fun 1");
//		System.out.println(x);// non static and static are sharebale
//         System.out.println(this.x);
//         System.out.println(this);
//	}
//
//
//
//	public static void main(String[] args) {
//		Day d1=new Day();
//		d1.fun1();
//	}
//	
//	
//	// if we place 4 oveloaded constructor inside our class, then we can create object of our class in 4 ways.
//	
//
//}

//Note : constructor will be called automativally whenever we create obj of class, but we can also call also call a constructor explicity.

//if we want to all a constructort, then that call must be from the another constructor of sam clas ( by using "this") keyword or form the contructo

//that call of the constructor must be the first statement 

//
//public class Day {
//
//	int x = 10;
//	int y;
//
//	void fun1(int a) {
//		System.out.println("inside fun 1");
//	}
//
//	Day() {
//		this(10);
//		System.out.println("inside contructor of day");
//	}
//	
//	Day(int i){
//		this("hello");
//	System.out.println("inside demo (Int)");
//	System.out.println(i);
//		
//	}
//	Day(String s){
//	System.out.println("inside demo (Int)");
//	System.out.println(s);
//		
//	}
//
//	public static void main(String[] args) {
//		Day d1 = new Day();
//	 
//	}
//	
//	
//	// constructor are used for basically for 2 purpose:
//
////	1. if we wnat excute some statement at the ime of ou object creation , then we can keep thos statement inside the constructor function.
////	
////	
//	
//	
//	
//
//}




// java bean class it is reusable , universal component which should have following properties;

//this class should be public


//variable /fields should be private
//for each variable/fields should be corresponding public getter setter methods




public class Day {


   public static void main(String[] args) {
		Student s1=new Student();
		s1.setMarks(20);
	 System.out.println(s1.getMarks()); 
	}


	
	// if we place 4 oveloaded constructor inside our class, then we can create object of our class in 4 ways.
	

}

