package Q1;

public class FirstQuestion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
           String st="Hello";
           char res=st.charAt(0);
           System.out.println(res);
           
           String st1="Pankaj";
           System.out.println(st.concat(st1));
           
           String up= st1.toUpperCase();
           System.out.println(up);
           String lower= st1.toLowerCase();
           System.out.println(lower);
           
           boolean t= st.equals(st1);
           System.out.println(t);
           
           
           String s1 = new String("abc");
           String s2 = new String("abc");
           System.out.println(s1.equals(s2));

           System.out.println("----");
           
           StringBuilder sb1 = new StringBuilder("abc");
           StringBuilder sb2 = new StringBuilder("abc");
           System.out.println(sb1.equals(sb2));
           
           System.out.println("----");
           
           String s = new String("abc");
           String sx = new String("abc");
           System.out.println(s==sx);
           
	}

}
