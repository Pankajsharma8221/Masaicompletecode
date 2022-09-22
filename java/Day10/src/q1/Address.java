package q1;

public class Address extends Person {
String city;
String state;
String pinCode;

public String toString()
{         city="Karnal";
         state="Haryana";
         pinCode="132114";
	   
	return "Address[city=" +city+",state="+state+"pincode="+pinCode+"]";
}
}
