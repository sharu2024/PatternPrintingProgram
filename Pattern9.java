package PatternPrinting;

import java.util.Scanner;
public class Pattern9 {

	public static void main(String[] args) {
		
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter row and col");
			int row = sc.nextInt();
			int col = sc.nextInt();
			int count = col-1;
			for (int i = 1; i <= row; i++) {
				for (int j = 1; j <= i; j++) {
				System.out.print(count);
				}
				
				count++;
				System.out.println();
			}
		}
	}

	
