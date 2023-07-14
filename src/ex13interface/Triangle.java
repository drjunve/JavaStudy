package ex13interface;

import ex13interface.figure.IDrawable;
import ex13interface.figure.IFigure;
/* 삼각형을 표현한 클래스로 사각형과 동일한 형태로 정의되어있다.
 * 단, 얿이를 구하는 방식만 다르므로 오버라이딩 한 메서드에서 0.5를
 * 추가로 곱해준다. */
public class Triangle extends FigureData implements IDrawable, IFigure{

	public void draw(String figureName) {}
	
	public void area(String figureName) {
		
	}
	
}
