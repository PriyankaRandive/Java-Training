package com.abc;

import java.util.logging.Logger;

public class UseEmployee {
	static Logger logger=Logger.getLogger(UseEmployee.class.getName());
	
	 public static void main(String[] args)
     {
		 logger.info("this is fir log");
         Employee E = new Employee("GFG1", 56);
         Employee F = new Employee("GFG2", 45);
         Employee G = new Employee("GFG3", 25);
         E.show();
         F.show();
         G.show();
         E.showNextId();
         F.showNextId();
         G.showNextId();
  
         { // It is sub block to keep
             // all those interns.
             Employee X = new Employee("GFG4", 23);
             Employee Y = new Employee("GFG5", 21);
             X.show();
             Y.show();
             X.showNextId();
             Y.showNextId();
         }
         // After countering this brace, X and Y
         // will be removed.Therefore,
         // now it should show nextId as 4.
            
           // Output of this line
         E.showNextId();
         // should be 4 but it will give 6 as output.
     }
 }

