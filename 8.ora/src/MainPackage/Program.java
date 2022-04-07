package MainPackage;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

import myproduct.*;

public class Program {
	static Scanner input = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("Please give me the size of the array!");
		int size = readInt();
		Product array[] = new Product[size];
		fill(array);
		Arrays.sort(array, new Comparator<Product>() {

			public int compare(Product o1, Product o2) {
				return o1.getPrice() - o2.getPrice();
			}
		});
		System.out.println("\n The array after sorting!");
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
		publisherWithMoreExpensiveBooks(array);

	}

	public static int readInt() {
		int inp = -1;
		do {
			while (!input.hasNextInt()) {
				System.out.println("Wrong input!");
				input.next();
			}
			inp = input.nextInt();
		} while (inp < 0);

		input.nextLine();
		return inp;
	}

	public static String readString() {
		String inp = input.nextLine();
		return inp;
	}

	public static double readDouble() {
		double inp = -1;
		do {
			while (!input.hasNextDouble()) {
				System.out.println("Wrong input!");
				input.next();
			}
			inp = input.nextDouble();
		} while (inp < 0);

		input.nextLine();
		return inp;
	}

	public static void fill(Product array[]) {
		for (int i = 0; i < array.length; i++) {
			System.out.println("Please give me the " + (i + 1) + " product serialNumber!(1 if book 2 if bread)");
			int inp = readInt();
			if (inp == 1) {
				System.out.println("Please give the " + (i + 1) + " author!");
				String author = readString();
				System.out.println("Please give the " + (i + 1) + " title!");
				String title = readString();
				System.out.println("Please give the " + (i + 1) + " price!");
				int price = readInt();
				System.out.println("Please give the " + (i + 1) + " pages!");
				int pages = readInt();
				System.out.println("Please give the " + (i + 1) + " style!");
				String style = readString();
				array[i] = new Book(author, title, price, pages, style);
			} else {
				System.out.println("Please give the " + (i + 1) + " price!");
				int price = readInt();
				System.out.println("Please give the " + (i + 1) + " vat!");
				int vat = readInt();
				System.out.println("Please give the " + (i + 1) + " unit!");
				double unit = readDouble();
				System.out.println("Please give the " + (i + 1) + " BreadName!");
				String name = readString();
				array[i] = new Bread(name, price, vat, unit);
			}
		}
	}

	public static void publisherWithMoreExpensiveBooks(Product array[]) {

		Book[] books = new Book[array.length];
		int index = 0;
		for (int i = 0; i < array.length; i++) {
			if (array[i] instanceof Book) {
				books[index] = (Book) array[i];
				index++;
			}
		}
		System.out.println("Authors with grater than 20Ft/page unit price:");
		String[] authors = new String[books.length];
		int wealthyAuthor = 0;
		for (int i = 0; i < books.length; i++) {
			if (books[i] != null) {
				boolean contain = containe(books[i], authors);
				if (!contain && books[i].getUnitPrice() > 20) {
					System.out.println(books[i].getAuthor());
					authors[wealthyAuthor] = books[i].getAuthor();
					wealthyAuthor++;
				}
			} 
			else {
				break;
			}
		}
		if (wealthyAuthor == 0) {
			System.out.println("There were no authors that has books that cost 20Ft/page!");
		}
	}

	public static boolean containe(Book book, String[] books) {
		boolean contain = false;
		for (int i = 0; i < books.length; i++) {
			if (books[i] != null && books[i].equalsIgnoreCase(book.getAuthor())) {
				contain = true;
			}
		}
		return contain;
	}

}