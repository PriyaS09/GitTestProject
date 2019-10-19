package constructorInjection;

public class Square implements Shape {

	private int side1;

	public Square(int side1) {
		super();
		this.side1 = side1;
	}

	@Override
	public int calculateArea() {
		// TODO Auto-generated method stub
		return side1 * side1;
	}

}
