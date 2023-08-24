package PatternPrinting;

public class Pattern19 {

	public static void main(String[] args) {
		int alphabetical=65;
		for(int i=0;i<=5;i++) {
			
			for(int j=5;j>=i;j--) {
			System.out.print((char)(alphabetical+j));
			
		}
			System.out.println();
	}

}
}