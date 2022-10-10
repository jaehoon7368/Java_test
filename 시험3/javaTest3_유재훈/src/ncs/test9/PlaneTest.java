package ncs.test9;

import java.util.Arrays;

public class PlaneTest {

	public static void main(String[] args) {
		Airplane a = new Airplane("L747",1000);
		Cargoplane c = new Cargoplane("C40",1000);
		
		System.out.println("Plane\t fuleSize");
		System.out.println("------------------------");
		System.out.println(a.getPlaneName() + "\t " + a.getFuelSize());
		System.out.println(c.getPlaneName() + "\t " + c.getFuelSize());
		
		System.out.println("Plane\t fuleSize");
		System.out.println("------------------------");
		a.flight(100);
		c.flight(100);
		System.out.println(a.getPlaneName() + "\t " + a.getFuelSize());
		System.out.println(c.getPlaneName() + "\t " + c.getFuelSize());
		
		System.out.println("Plane\t fuleSize");
		System.out.println("------------------------");
		a.refuel(200);
		c.refuel(200);
		System.out.println(a.getPlaneName() + "\t " + a.getFuelSize());
		System.out.println(c.getPlaneName() + "\t " + c.getFuelSize());
		
		
		
	}

}
