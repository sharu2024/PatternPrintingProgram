package PatternPrinting;

public class Pattern6 {
	public static void main(String[]args) {
       for(int i=1;i<=4;i++) {
			
			for(int j=1;j<=3;j++) {
				if(i==1||i==4||j==1) {
					System.out.print(3);
				}
				else if(i==2&&j==2) {
					System.out.print(2);
				}
				
				else if(i==3&&j==2) {
					System.out.print(1);
				}
				else {
					System.out.print(3);
				}
		}
			System.out.println();
	}

		}
	}
		
	
	