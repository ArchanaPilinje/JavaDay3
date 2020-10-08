package abstractClass;

public class TestShape {

	public static void main(String[] args) {
		Shape c=new Circle("Circle",3.2f);
		c.findArea();
		c.printShape();
		
		Shape s=new Square("Square",12);
		s.findArea();
		s.printShape();
		
		Shape t=new Triangle("Triangle",12,14);
		t.findArea();
		t.printShape();
		
	}

}
