package pkgMain;

public class cMain {

	public static void main(String[] args) {
		// my change
		Rectangle rec1 = new Rectangle(10,20);
		
		System.out.println(rec1.area());
		
		rec1.setWidth(100);
		System.out.println(rec1.area());
		
		System.out.println(rec1.getWidth());

	}

}
