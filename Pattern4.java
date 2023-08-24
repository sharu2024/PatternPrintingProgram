package PatternPrinting;
import java.util.Scanner;

public class Pattern4 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter no of rows");
		int n=scan.nextInt();
		for(int i=1;i<=n-1;i++) {
			for(int k=1;k<=i;k++) {
				System.out.print(" ");
			}
			for(int j=1;j<=n-i;j++) {
				System.out.print("*"+" ");
			}
			
			System.out.println();
		}
		}
}