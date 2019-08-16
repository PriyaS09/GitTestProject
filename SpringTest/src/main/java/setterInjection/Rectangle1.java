package setterInjection;

public class Rectangle1 implements Shape1 {

	private int length1;
	private int breadth1;

	public int getLength1() {
		return length1;
	}

	public void setLength1(int length1) {
		this.length1 = length1;
	}

	public int getBreadth1() {
		return breadth1;
	}

	public void setBreadth1(int breadth1) {
		this.breadth1 = breadth1;
	}

	@Override
	public int calculateArea() {
		// TODO Auto-generated method stub
		return length1 * breadth1;
	}

}
