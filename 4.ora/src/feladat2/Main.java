package feladat2;

public class Main {

	public static void main(String[] args) {
		Book test=new Book();
		test.setAuthor("Alfonz Bakelit");
		test.setPrice(2000);
		test.setTitle("Az élet értelme");
		test.setYop(2000);
		test.incvalue(20);
		System.out.println(test.toString());
	}

}
