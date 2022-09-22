package q1;

public class Main {
	public static void main(String[] args) {
        Bird b1= new Parrot(); // here we create the object of bird in parrot and 
        
 
         b1.fly();// here we call that b1.fly();
         
         Parrot p=(Parrot)b1;// here we downcast from parrot the the main page
         // here we use child then created then downcat (parrot)b1 assign this
         
         p.sing();// here we acces the sing of child of parrto
	}
}
