package abstractClass;

public class Square extends Shape {
float side;
	public Square() {
		// TODO Auto-generated constructor stub
	}

	public Square(String name,float side) {
		super(name);
		this.side=side;
	}

	@Override
	public void findArea() {
		area = side*side;
	}
	
	@Override
	public void printShape() {
		System.out.println("Side length= " + side);
		super.printShape();
	}
}
