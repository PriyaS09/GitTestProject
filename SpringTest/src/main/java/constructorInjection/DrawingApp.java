package constructorInjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DrawingApp {

	public static void main(String[] args) {
		
		ApplicationContext ctx=new ClassPathXmlApplicationContext("spring-context.xml");
		Square square=(Square)ctx.getBean("square");
		
		int area=square.calculateArea();
		System.out.println("Area is :"+area);


		Rectangle rectangle=(Rectangle)ctx.getBean("rectangle");
		int area1=rectangle.calculateArea();

		System.out.println("Area is :"+area1);
		
		
Shape shape=(Shape)ctx.getBean("rectangle");
		
		int ar=shape.calculateArea();
		System.out.println("Area is :"+ar);
		

	}

}
