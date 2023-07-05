package ex04controlstatement;

public class QuPyramid02 {

	public static void main(String[] args) {
		int row = 1;
		do {
			
			int col = 1;
			
			do {
				if(row<=col) {
				System.out.print("*");
				}
				col++;
			}while(col<=5);
			
			System.out.println();
			row++;
			
		}while(row<=5);
	}

}
