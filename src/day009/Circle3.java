package day009;

public class Circle3 {

	/** �뾶*/
	private double radius;
	/** �ܳ�*/
	private double perimeter;
	/** ���*/
	private double area;
	
	
	

	public void show(){
		System.out.println("�ܳ�Ϊ:" + this.getPerimeter() + ", ���Ϊ:" + this.getArea());
	}
	
	public Circle3() {}
	
	
	public Circle3(double radius) {
		this.radius = radius;
	}


	public double getRatius(){	//������
		return radius;
	}
	public void setRadius(double radius){	//д����
		//this ��ָ�� == �ޡ�����
		if(radius <=0){
			radius = 1;
		}else{
			this.radius = radius;
		}
	}
	public double getPerimeter() {
		perimeter = 2 * Math.PI * radius;
		return perimeter;
		
	}
	
	public double getArea() {
		area = Math.PI * Math.pow(radius, 2);
		return area;
	}
	
	
	
}
