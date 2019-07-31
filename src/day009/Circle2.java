package day009;

import java.util.Scanner;

/**
 * 求圆的面积和周长
 * */
public class Circle2 {
	/** 半径*/
	public double radius;
	/** 周长*/
	public double perimeter;
	/** 面积*/
	public double area;
	
	public Circle2(){
		inputRaius();
	}
	public Circle2(double r1){
		if(r1 > 0){
			radius = r1;
			
		} else{
			inputRaius();
		}
	}
	
	private void inputRaius(){
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入圆的半径:");
		radius = sc.nextDouble();
		sc.close();
	}
	
	public void showPerimeter(){
		if(radius <= 0){
			inputRaius();
		}
		perimeter = 2 * Math.PI * radius;
		System.out.println("周长为: " + perimeter);
	}
	
	public void showArea(){
		if(radius <= 0){
			inputRaius();
		}
		area = Math.PI * Math.pow(radius, 2);
		System.out.println("面积为" + area);
	}
}
