package PatternPrinting;

public class Pattern10 {

	public static void main(String[] args) {
		int count=2;
		for(int i=1;i<=4;i++) {
			for(int j=1;j<=i;j++) {
				
				System.out.print(count);
			}
			count++;
			
			System.out.println();
		}
		
		int count1=6;
		for(int i=4;i>=1;i--) {
			for(int j=1;j<=i;j++) {
				
				System.out.print(count1);
				
			}
			count1--;
			System.out.println();
		}
		
	}

}
