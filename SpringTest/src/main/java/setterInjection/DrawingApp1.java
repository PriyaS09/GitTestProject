package setterInjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DrawingApp1 {

	public static void main(String[] args) {

		ApplicationContext ctx = new ClassPathXmlApplicationContext("spring-context.xml");
		Square1 square = (Square1) ctx.getBean("square1");

		int area = square.calculateArea();
		System.out.println("Area is :" + area);

		Rectangle1 rectangle = (Rectangle1) ctx.getBean("rectangle1");
		int area1 = rectangle.calculateArea();

		System.out.println("Area is :" + area1);

		Shape1 shape = (Shape1) ctx.getBean("rectangle1");

		int ar = shape.calculateArea();
		System.out.println("Area is :" + ar);

		int bre = rectangle.getBreadth1();
		int len = rectangle.getLength1();
		int sd=square.getSide1();
		
		System.out.println("breadth is :" + bre);
		System.out.println("length is :" + len);
		System.out.println("side is :" + sd);

	}

}
