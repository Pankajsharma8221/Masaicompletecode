package Q3;

public class Prime {
	public  int[] findAndReturnPrimeNumbers(int[] inputArray){
		 int[] arr1=new int[7]; 
		for(int a=0;a<inputArray.length;a++) {
		      boolean flag=false;
		   int num=inputArray[a];
		   for(int b=2;b<num/2;b++) {
	  	   if(num%2==0) {
	  		   flag=true;
	  		   break;
	  	   }
	     }
		

	     if(!flag) {
	    		 arr1[a]=num;
	    		
	     }
	    	
		}
	   return arr1;
	  
		
		}
    

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int[] arr= {10,12,5,50,11,14};
       Prime p=new Prime();
    
     int[] x= p.findAndReturnPrimeNumbers(arr);
//      int num=29;
       for(int a=0;a<x.length;a++) {
    	System.out.println(x[a]);   
       }
       
       
      
 
  
    	   
       }
       
      
	

}
