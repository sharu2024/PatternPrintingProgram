package PatternPrinting;

import java.util.Scanner;
public class Pattern11 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter number of rows");
		int row=scan.nextInt();
		
		for(int i=1;i<=row;i++) {
			for(int j=1;j<=i;j++) {
				if(j%2==0) {
					System.out.print(0);
				}
				else {
					System.out.print(1);
				}
				
			}
			System.out.println();
	}

}
} 