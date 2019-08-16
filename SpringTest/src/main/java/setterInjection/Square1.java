package setterInjection;

public class Square1 implements Shape1 {

	private int side1;

	public int getSide1() {
		return side1;
	}

	public void setSide1(int side1) {
		this.side1 = side1;
	}

	@Override
	public int calculateArea() {
		// TODO Auto-generated method stub
		return side1 * side1;
	}

}
