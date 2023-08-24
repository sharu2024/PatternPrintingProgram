package PatternPrinting;

public class Pattern15 {

	public static void main(String[] args) {
		
		int Alphabetical=65;
		for(int i=0;i<=5;i++) {
			for(int j=0;j<=i;j++) {
				
				System.out.print((char)(Alphabetical+j)+" ");
				
				}
			System.out.println();
		}
			
	}
	}
