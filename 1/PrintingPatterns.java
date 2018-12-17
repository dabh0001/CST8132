//Aditya Dabhi

public class PrintingPatterns {

	public static void main (String[] args) {

		int displaySize =  5;
		char displayChar =  '#';

		// Pattern 1
		for (int r=1; r<=displaySize; r++) {

			for (int c=1; c<=r; c++) {
				System.out.print(displayChar);
			}
			System.out.println();
		}

		//for the blank space
		System.out.println();

		// Pattern 2
		for(int r=0;r<displaySize;r++){
			for(int y=r;y<displaySize;y++){
				System.out.print(displayChar);
			}
			System.out.println();
			for(int i=displaySize;i<0;i--){
				System.out.println(" ");
				System.out.println();
			}
		}

		//for the blank space
		System.out.println();

		//Pattern 3
		for(int r=displaySize; r>0; r--){
			for(int star=r;star>0;star--){
				System.out.print(displayChar);
			}
			System.out.println();
			for(int space=0 ; space<=(displaySize-r);space++){
				System.out.print(" ");
			}
		}
		
		
		// Pattern 4
				for(int r=0;r<=displaySize;r++){
					for(int space=0;space<=(displaySize-r-1);space++){
						System.out.print(" ");
					}
					for(int k=0;k<r;k++){
						System.out.print(displayChar);
					}
					System.out.println();
				}
	}

}
