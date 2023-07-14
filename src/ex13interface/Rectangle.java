package ex13interface;

import ex13interface.figure.IDrawable;
import ex13interface.figure.IFigure;
/* 사각형을  표현한 클래스로 가로, 세로가 필요하므로 FigureData를 상속하고,
 * 넓이와 그리는 행위를 표현하기위해 2개의 인터페이스까지 구현한다. */
public class Rectangle extends FigureData implements IDrawable, IFigure{
	//생성자에서 부모클래스의 생성자를 super를 ㅗㅌㅇ해 호출한다.
	public Rectangle(int width, int height) {
		super(width, height);
	}
	
	public void draw(String figureName) {
		
	}
	public void area(String figureName) {
		
	}
	
}
