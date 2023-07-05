package ex04controlstatement;

public class QuPyramid03 {

	public static void main(String[] args) {
		
		int row;
		int spa;
		int ast;
		int col = 5;
		
		for(row=0 ; row<col ; row++) {
			for(spa=1 ; spa<col-row ; spa++) {
				System.out.print(" ");
			}
			for(ast=0 ; ast<row*2+1 ; ast++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
