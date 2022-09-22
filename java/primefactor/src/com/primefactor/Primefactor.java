package com.primefactor;

public class Primefactor {
	
	public static void primeFactor(int n) {
		int c=2;// here it the count 
		while(n>1) { // if n is greter then this it will execute there
			if(n%c==0) {  // here hte
				System.out.println(c);
				n/=c;
			}else {
				c++;
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
        primeFactor(10);
	}

}
