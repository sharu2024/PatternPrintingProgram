package PatternPrinting;

public class Pattern16 {

	public static void main(String[] args) {
		int Alphabetical=65;
		for(int i=0;i<=5;i++) {
			for(int j=0;j<=i;j++) {
				
				System.out.print((char)(Alphabetical+j)+" ");
				
				}
			System.out.println();
		}
			for(int i=5;i>=0;i--) {
				for(int j=0;j<=i;j++) {
					System.out.print((char)(Alphabetical+j)+" ");
				}
				System.out.println();
			}
	}
	
}
