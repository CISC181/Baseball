package pkgMain;

public class Rectangle {

	private int Length;
	private int Width;
	public Rectangle(int length, int width) {
		super();
		Length = length;
		Width = width;
	}
	public int getLength() {
		return Length;
	}
	public void setLength(int length) {
		Length = length;
	}
	public int getWidth() {
		return Width;
	}
	public void setWidth(int width) {
		Width = width;
	}
	
	public double area()
	{
		return this.Length * this.Width;
		
	}
}
