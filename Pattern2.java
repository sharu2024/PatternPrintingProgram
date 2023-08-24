package PatternPrinting;

import java.util.Scanner;

public class Pattern2 {

	public static void main(String[] args) {
		//Pyramid star pattern
		
		Scanner scan=new Scanner(System.in);
		System.out.println("enter number");
		int n=scan.nextInt();
		for(int i=0;i<n;i++) {
			for(int j=n-i;j>1;j--) {
				System.out.print(" ");
			}
			
			for(int k=0;k<=i;k++) {
				System.out.print(" *");
			}
				
			
			System.out.println();
		}
		
		}
		
		}

	

