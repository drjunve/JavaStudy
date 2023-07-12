package ex12inheritance;

class Point {
   	int xDot, yDot;
   	public Point(int x, int y) {
         		xDot=x;
         		yDot=y;
   	}
   	public Point() {}
   	public void showPointInfo() {
         		System.out.println("[x좌표:"+xDot+", y좌표"+yDot+"]");
   	}
}
//Point클래스를 기반으로 원(Circle) 클래스 표현하기
class Circle{	
	//멤버변수
	int radian;//반지름
	Point center;
	public Circle(int radian) {
		this.radian = radian;
	}
	public void showRadianInfo() {
		System.out.printf("뱐지름 : %d\n",radian);
	}
}
//원 2개를 겹쳐서 링을 표현하는 클래스
class Ring{
	//멤버변수
	Circle innerCircle;//안쪽의 원
	Circle outerCircle;//바깥쪽의 원
	Point innerCircleD;
	Point outerCircleD;
	
	public Ring(int inCirX, int inCirY, int inCirR,
			int outCirX, int outCirY, int outCirR) {
		innerCircle = new Circle(inCirR);
		outerCircle = new Circle(outCirR);
		innerCircleD = new Point(inCirX, inCirY);
		outerCircleD = new Point(outCirX, outCirY);
	}
	
	void showRingInfo() {
		System.out.println("안쪽원의 정보:");
		innerCircle.showRadianInfo();
		innerCircleD.showPointInfo();
		System.out.println("바깥쪽원의 정보:");
		outerCircle.showRadianInfo();
		outerCircleD.showPointInfo();
		
		
	}
	//블라블라
}
class QuRingMake {
	public static void main(String[] args) {
		Ring c = new Ring(1,1,3,2,2,9);
		c.showRingInfo();
	}
}
