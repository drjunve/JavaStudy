package ex12inheritance;

/* 상속관계가 있는 클래스에서 자식 클래스를 통해 인스턴스를 생성할 때에는 반드시 부모클래스의
 * 인스턴스를 먼저 생성해야한다. */
class Car2
{
       	int gasoline;
       	public Car2(int gas) {
       		this.gasoline = gas;
       	}
}
class HybridCar2 extends Car2
{
       	int electric;
       	//인수 1개를 부모로 전달하고 멤버변수를 초기화한다.
       	public HybridCar2(int ga, int el) {
       		super(ga);
       	}
}
class HybridWaterCar2 extends HybridCar2
{
		int water;
		//부모클래스로 2개의 인수를 전달하고 1개의 멤버변수를 초기화한다.
		public HybridWaterCar2(int gasoline, int electric, int water) {
			super(gasoline, electric);
			this.water = water;
		}
		public void showNowGauge()
       	{
                 	System.out.println("남은가솔린:"+gasoline);
                 	System.out.println("남은전기량:"+electric);
                 	System.out.println("남은워터량:"+water);
       	}
}
public class QuConstructorAndSuper2 {

	public static void main(String[] args)
	{
		HybridWaterCar2 hcar = new HybridWaterCar2(10,20,30);
		hcar.showNowGauge();
	}
}