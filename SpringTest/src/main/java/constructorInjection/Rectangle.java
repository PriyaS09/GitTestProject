package constructorInjection;

public class Rectangle implements Shape {
	
	private int length1;
	private int breadth1;
	
	

	public Rectangle(int length1, int breadth1) {
		this.length1 = length1;
		this.breadth1 = breadth1;
	}



	@Override
	public int calculateArea() {
		// TODO Auto-generated method stub
		return length1*breadth1;
	}

}
