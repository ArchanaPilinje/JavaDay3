package abstractClass;
import java.util.*;
public class TestShape {

	public static void main(String[] args) {
//		Shape c=new Circle("Circle",3.2f);
//		c.findArea();
//		c.printShape();
//		
//		Shape s=new Square("Square",12);
//		s.findArea();
//		s.printShape();
//		
//		Shape t=new Triangle("Triangle",12,14);
//		t.findArea();
//		t.printShape();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of shapes");
		int num=sc.nextInt();
		Shape c[]=new Shape[num];
		for(int i=0;i<num;i++) {
			System.out.println("Enter 1.Circle 2.Square  3.Triangle");
			int ch=sc.nextInt();
		
			switch(ch) {
			case 1: System.out.println("Enter the name and radius(in float)");
			        sc.nextLine();
					String n=sc.nextLine();
					float r=sc.nextFloat();
					c[i]=new Circle(n,r);
					
					break;
			
			case 2: System.out.println("Enter name and the side length");
			        sc.nextLine();
			        String ns=sc.nextLine();
					float l=sc.nextFloat();
					c[i]=new Square(ns,l);
					break;
					
			case 3:System.out.println("Enter the name,base and height");
					sc.nextLine();
					String nt=sc.nextLine();
					double b=sc.nextDouble();
					double h=sc.nextDouble();
					c[i]=new Triangle(nt,b,h);
					break;
			
					
			
			}
		}
		
		
		for(int i=0;i<num;i++) {
			c[i].findArea();
		}
		
		for(int i=0;i<num;i++) {
			c[i].printShape();
		}
		
		

	}

}
