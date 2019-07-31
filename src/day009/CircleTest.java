package day009;

import java.util.Scanner;
public class CircleTest {

	public static void main(String[] args){
//		
//		Circle c1 = new Circle();
//		c1.inputRaius();
//		c1.showPerimeter();
//		c1.showArea();
//		
//		Circle2 c2 = new Circle2(23);
//		c2.showArea();
		
		System.out.println("«Î ‰»Î∞Îæ∂");
		Scanner sc = new Scanner(System.in) ;
		double radius = sc.nextDouble();

		Circle3 c3 = new Circle3(radius);
		c3.show();
		sc.close();
	}
}
