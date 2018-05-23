package training;

public abstract class Concrete {
	public void bike() {
		System.out.println("I have a bike");
	}
	public void handle() {
		System.out.println("bike have a handle");
	}
	public abstract void wheel();
	
	public abstract void engine();
	public static void main(String[] args) {
		Abstrac obj = new Abstrac ();
		obj.engine();
		obj.wheel();
		
	}
	
}
