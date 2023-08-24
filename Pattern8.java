package PatternPrinting;

import java.util.Scanner;
public class Pattern8 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter row and colum");
		int row=scan.nextInt();
		int col=scan.nextInt();
		
		int count=col+2;

		
		for (int i = row; i >= 1; i--) {
			for (int j = 1; j<=i ; j++) {
				
		
				System.out.print(count);
			
			}
			count--;
			System.out.println();
		}
		}

	}

