package week3.day1;

public class MyVehicle {

	public static void main(String[] args) {
		AshokLeyland al=new AshokLeyland();
		al.truckcap();
		al.truckmodel();
		al.soundHorn();
		
		
		Suzuki suz= new Suzuki();
		suz.applyBreak();
		suz.legGear();
		//overriding
		al.applyBreak(5, 4);
		
		//overloading
		Vehicle ve=new Vehicle();
		ve.applyBreak(4, 3);

	}

}
