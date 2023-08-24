package PatternPrinting;

public class Pattern17 {
	public static void main(String[]args) {
		
	
	for(int i=5;i>=0;i--) {
		int Alphabetical=65;
		for(int j=i;j>=0;j--) {
			
			System.out.print((char)(Alphabetical+j)+" ");
			
			}
		System.out.println();
	}
		for(int i=0;i<=5;i++) {
			int Alphabetical=65;
			for(int j=i;j>=0;j--) {
				System.out.print((char)(Alphabetical+j)+" ");
			}
			System.out.println();
		}

}
}