package ex04controlstatement;

public class QuPyramid01 {

	public static void main(String[] args) {
		int row = 1;
		while(row<=5) {
			int col = 1;
			while(col<=5) {
				if(col<=row) {
					System.out.print("*");
				}
				col++;
			}
			System.out.println();
			row++;
		}
	}

}
