package abstractClass;

public class Triangle extends Shape {
double base;
double height;
	public Triangle() {
		// TODO Auto-generated constructor stub
	}

	public Triangle(String name,double base,double height) {
		super(name);
		this.base=base;
		this.height=height;
	}
	
	public void findArea() {
		area = 0.5*base*height;
	}
	
	@Override
	public void printShape() {
		System.out.println("Base length= " + base);
		System.out.println("Height length= " + height);
		super.printShape();
	}

}
