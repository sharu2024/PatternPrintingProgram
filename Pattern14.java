package PatternPrinting;

import java.util.Scanner;
public class Pattern14 {
	
          public static void main (String[]args)
	    {
	       Scanner scan=new Scanner(System.in);
	       System.out.print ("Enter the row and col value:");
	       int row=scan.nextInt();
	       int col=scan.nextInt();
	       int count=1;
	    
	        for (int i=1; i<=row; i++)
	        {
		        
		        for (int j=1; j <=i; j++)
		        {
		        	
		            System.out.print (count+"*");
		        }
		        count++;
		        System.out.println ();
	        }
	        for(int i=row;i>=1;i--) {
	        	for(int j=1;j<=i;j++) {
	        		System.out.print(count+"*");
	        	}
	        	count--;
	        	System.out.println();
	        }
	    }
	}





