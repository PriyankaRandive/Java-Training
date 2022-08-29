package com.abc;

import java.util.logging.Logger;

public class Test {
	
	static Logger logger=Logger.getLogger(JavaTraining.class.getName());
	
	 public static void main(String[] args){ 
		 
		 logger.info("Hello this is program");
	        String a = "Andrew";  
	        String b = "Andrew";  
	        String c=  "Yash";
	        if(a.equals(b)){   //checking the equality of objects using equals() methods  
System.out.println("a & b are equal and hashvalues are:" + " "+ a.hashCode() + " & " + b.hashCode());  
	          
	        }  
	  
	       /* System.out.println(a.compareTo(b));//0 because both are equal  
	        System.out.println(a.compareTo(c));//-24   
	        
	        System.out.println(a.equals(b)); // Returns true because they are equal
	        System.out.println(a.equals(c)); // false
           */ 
	      //Reference comparison
	        System.out.println(a == b);

	        //Content comparison
	        System.out.println(a.equals(b)); 

	        // integer-type 
	        System.out.println(10 == 10); 

	        // char-type 
	        System.out.println('a' == 'a'); 
	        /*true
	        true
	        true
	        true*/

}
}