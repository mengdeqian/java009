package day009;

import java.util.Scanner;

/**
 * ��Բ��������ܳ�
 * */
public class Circle {
	/** �뾶*/
	public double radius;
	/** �ܳ�*/
	public double perimeter;
	/** ���*/
	public double area;
	
	public void inputRaius(){
		Scanner sc = new Scanner(System.in);
		System.out.println("������Բ�İ뾶:");
		radius = sc.nextDouble();
		sc.close();
	}
	
	public void showPerimeter(){
		if(radius <= 0){
			inputRaius();
		}
		perimeter = 2 * Math.PI * radius;
		System.out.println("�ܳ�Ϊ: " + perimeter);
	}
	
	public void showArea(){
		if(radius <= 0){
			inputRaius();
		}
		area = Math.PI * Math.pow(radius, 2);
		System.out.println("���Ϊ" + area);
	}
}
