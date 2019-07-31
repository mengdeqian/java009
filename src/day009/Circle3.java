package day009;

public class Circle3 {

	/** 半径*/
	private double radius;
	/** 周长*/
	private double perimeter;
	/** 面积*/
	private double area;
	
	
	

	public void show(){
		System.out.println("周长为:" + this.getPerimeter() + ", 面积为:" + this.getArea());
	}
	
	public Circle3() {}
	
	
	public Circle3(double radius) {
		this.radius = radius;
	}


	public double getRatius(){	//读操作
		return radius;
	}
	public void setRadius(double radius){	//写操作
		//this 自指针 == 朕、寡人
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
