package PatternPrinting;

import java.util.Scanner;

public class Pattern3 {

	public static void main(String[] args) {
		//Diamond Star Pattern
		Scanner scan=new Scanner(System.in);
		System.out.println("enter number");
		int n=scan.nextInt();
		for (int i=0; i<n; i++){ 
            for (int j=n; j>i+1; j--) {
            	
            
              System.out.print(" "); 
            }
            for (int j=0; j<=i*2; j++ ) {
              System.out.print("*"); 
            }
         System.out.println(); 
			}
		
			for(int i=n;i>0;i--)     
			   {
			      for(int k=n;k>i;k--) {     
			         System.out.print(" "); 
			      }
			      for(int j=0;j<i*2-1;j++){
			    	  
			        System.out.print("*");  
			      }
			      System.out.println();     
			   }
	}
}
