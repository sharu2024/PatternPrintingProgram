package PatternPrinting;

import java.util.Scanner;
public class Pattern12 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter row and column");
		int row=scan.nextInt();
		int col=scan.nextInt();
		int count=1;
		
		for(int i=1;i<=row;i++) {
			for(int j=1;j<=col;j++) {
				
				System.out.print(count++ +"*");
			}
			System.out.println();
		}
		
	}

}
