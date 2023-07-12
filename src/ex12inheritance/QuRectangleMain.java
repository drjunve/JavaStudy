package ex12inheritance;
//메인이랑 T랑 바뀜. 다시 바꿀 것
class Rectangle2
{
	private int width;
	private int height;
	
    public Rectangle2(int width, int height) {
    	this.width = width;
    	this.height = height;
    }
    
    public void showAreaInfo() {
    	System.out.println("직사각형 면적: " + (width*height));
    }
    // private멤버변수를 외부에서 반환받기 위한 getter선언
	public int getWidth() {
		return width;
	}

	public int getHeight() {
		return height;
	}
}
//정사각형을 표현한 클래스(정사각형은 직사각형의 일종)
class Square2 extends Rectangle2
{
	/* 정사각형은 밑변과 높이의 길이가 같으므로 하나의 값으로 두개의
	 * 길이를 대체할 수 있다. */
	
	// 멤버변수 : 여기서는 확장이 필요없다.
	
	//생성자 : 하나의 값으로 2개를 초기화한다.
	public Square2(int side) {
		super(side, side);
	}
	
	/* 부모 클래스에서 private으로 선언된 멤버변수 이므로 직접적인 접근은 불가능하다.
	 * 따라서 getter를 통해 값을 얻어온 후 연산해야 한다. */
	@Override
	public void showAreaInfo() {
		System.out.println("정사각형 면적: " + (getWidth()*super.getHeight()));
	}
} 

class QuRectangle2Main {
	public static void main(String[] args) {
	       	Rectangle2 rec = new Rectangle2(4, 3);
	       	rec.showAreaInfo();
 
       		Square2 sqr = new Square2(7);
	       	sqr.showAreaInfo();
   	}
}
