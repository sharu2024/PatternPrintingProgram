package PatternPrinting;

import java.util.Scanner;
public class Pattern1 {

	public static void main(String[] args) {
		
		//Printing Hollow Rectangle Star Pattern
      Scanner scan=new Scanner(System.in);
      System.out.println("enter row and column");
      int row=scan.nextInt();
      int col=scan.nextInt();
      for(int i=1;i<=row;i++) {
    	  for(int j=1;j<=col;j++) {
    		  if(i==1||j==1||j==col||i==row) {
    			  System.out.print("*");
    			  
    	  }
    		  else {
    			  System.out.print(" ");
    		  }
    		  
    	  }
    	  System.out.println();
      }
}
}

