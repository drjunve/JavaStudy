package ex12inheritance;

class Rectangle
{
	int wide;
	int height;
	
	public Rectangle() {}
	
    public Rectangle(int wide, int height) {
    	this.wide = wide;
    	this.height = height;
    }
    
    void showAreaInfo() {
    	System.out.println("직사각형 면적: "+wide*height);
    }
}
//정사각형을 표현한 클래스(정사각형은 직사각형의 일종)
class Square extends Rectangle
{
	int side;
	
	public Square(int side) {
		this.side = side;
	}
	
	void showAreaInfo() {
		System.out.println("정사각형 면적: "+side*side);
	}
} 

class QuRectangleMain {
	public static void main(String[] args) {
	       	Rectangle rec = new Rectangle(4, 3);
	       	rec.showAreaInfo();
 
       		Square sqr = new Square(7);
	       	sqr.showAreaInfo();
   	}
}
