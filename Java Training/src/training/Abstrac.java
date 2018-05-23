package training;

public class Abstrac extends Concrete {

	@Override
	public void wheel() {
			System.out.println("BIKE HAS WEELS");
		}

	@Override
	public void engine() {
		System.out.println("engine has");
		
	}
public static void main(String[] args) {
	Abstrac obj = new Abstrac ();
	obj.bike();
	obj.handle();
	obj.wheel();
	obj.engine();
}
}