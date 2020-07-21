import java.io.*;

public class ExceptionExample11 {

   public static void main (String[] args) throws Exception {

      /* 
         - this handles the NumberFormatException

      */

      BufferedReader keyboard=
         new BufferedReader (new InputStreamReader(System.in),1);

      
      boolean done = false;
      
      while (done == false) {
    	  
    	  System.out.print("Enter an integer: ");
    	  String userTyped = keyboard.readLine();
      
		      try {
		         int value = Integer.parseInt(userTyped);
		         done = true;
		         System.out.println("Success!");
		      }
		      catch (NumberFormatException e) {
		         System.out.println("Hey, " + e.getMessage() + " is not an integer!");
		      }
      }
   }
}