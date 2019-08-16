package constructorInjection;

public class Square implements Shape {

	private int side;

	public Square(int side) {
		super();
		this.side = side;
	}

	@Override
	public int calculateArea() {
		// TODO Auto-generated method stub
		return side * side;
	}

}
