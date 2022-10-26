package week1.day1;

public class Car {
	
	public void driveCar() {
		System.out.println("I am driving car");
	}
	public void applyBrake() {
		System.out.println("Applying brake now");
	}
	public void soundHorn() {
		System.out.println("I am making sound horn now");
	}
	public boolean isPuncture() {
		return true;
	}
	public static void main(String[] args) {
		Car obj= new Car();
		obj.driveCar();
		obj.applyBrake();
		obj.soundHorn();
		boolean puncture = obj.isPuncture();
		System.out.println("My car is punctured :" +puncture);
	}
}
