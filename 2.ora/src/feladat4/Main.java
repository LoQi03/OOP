package feladat4;
import java.util.Scanner;

public class Main {

    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("How many dudes?");
        int dudes = read(1, 25);
        String[] names = new String[dudes];
        String[][] emails = new String[dudes][];
        readEmails(names, emails);
        printEmails(names, emails);
    }

    public static int read(int min, int max) {
        int number = 0;
        do {
            System.out.println("Give me a number between " + min + " and " + max + "!");
            while (!input.hasNextInt()) {
                System.out.println("Bad input format!");
                input.next();
            }
            number = input.nextInt();
            input.nextLine();
        } while (number < min || number > max);
        return number;
    }

    public static void readEmails(String[] names, String[][] emails) {
        for (int i = 0; i < names.length; i++) {
            System.out.print("Name: ");
            names[i] = input.nextLine();
            System.out.println("How many email addresses does " + names[i] + " have? (0-3)");
            int addresses = read(0, 3);
            emails[i] = new String[addresses];
            for (int address = 0; address < addresses; address++) {
                System.out.println("Email #" + (address + 1) + ":");
                emails[i][address] = input.nextLine();
            }
        }
    }

    public static void printEmails(String[] names, String[][] emails) {
        for (int i = 0; i < names.length; i++) {
            System.out.print(names[i] + ": ");
            for (int address = 0; address < emails[i].length; address++) {
                System.out.print(emails[i][address] + " ");
            }
            System.out.println();
        }
    }
}