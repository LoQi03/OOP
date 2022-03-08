package feladat1;

public class Main {

	public static void main(String[] args) {
		Rectangle a = new Rectangle(5,3);
		Rectangle b = new Rectangle(3);
		Rectangle c= a;
		System.out.println("a values:");
		PrintRectangle(a);
		System.out.println("b values:");
		PrintRectangle(b);
		System.out.println("c values:");
		PrintRectangle(c);
		a.setSides(3, 1);
		System.out.println("a values:");
		PrintRectangle(a);
		System.out.println("b values:");
		PrintRectangle(b);
		System.out.println("c values:");
		PrintRectangle(c);
		a=b;
		System.out.println("Az a és a b oldalai megegyeznek:"+((a==b)? "igaz":"hamis"));
		System.out.println("Az a és a c oldalai megegyeznek:"+((a==c)? "igaz":"hamis"));
		System.out.println("Az a és a b oldalai megegyeznek:"+a.sidesEqual(b));
	}
	public static void PrintRectangle(Rectangle x)
	{
		System.out.println(x.toString());
	}
}
