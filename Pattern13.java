package PatternPrinting;

import java.util.Scanner;

class Pattern13{
	public static void main(String[]args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter row and col");
		int row=scan.nextInt();
		int col=scan.nextInt();
		int count=1;
		
		for(int i=1;i<=row;i++) {
			for(int j=1;j<=i;j++) {
				count++;
				System.out.print(count+"*");
			}
			System.out.println();
		}
		
	}
}
