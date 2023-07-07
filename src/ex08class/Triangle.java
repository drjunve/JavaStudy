package ex08class;

public class Triangle {
	
	double bottom;
	double height;
	double area;
	
	void init(double bo, double he) {
		bottom = bo;
		height = he;
	}
	
	void setBottom(double bo) {
		bottom = bo;
	}
	
	void setHeight(double he) {
		height = he;
	}
	
	double getArea() {
		return area = (bottom*height)/2;
	}

	public static void main(String[] args) {

	}

}
