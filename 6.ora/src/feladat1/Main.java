package feladat1;

import java.time.LocalDate;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        Employee[] emps = { new Employee("Linux Lenke", LocalDate.of(1957, 12, 02), 120000),
                new Employee("BSD Bela", 1999, 01, 31, 32000), new Employee("Processz Petike", "2001-05-20", 250000),
                new Employee("Juniksz Janos", 1952, 2, 28, 123000), new Employee("Bitkolyin Bela", 1974, 4, 04, 95500),
                new Employee("Processz Panna", "1972-04-20", 220000),
                new Employee("Szemafor Szandra", 2001, 1, 12, 21000), new Employee("SSD Sanyi", 1950, 8, 14, 120000),
                new Employee("Gigabit Geza", 2004, 7, 12, 75000), new Employee("Torrent Gyuszi", 1923, 5, 24, 400000) };
        printEmployees(emps);
        System.out.println("\nEmployees close to retirement: ");
        printEmployeesCloseToRetirement(emps, 10);
        System.out.println("\nEmployees with more years than the average (" + averageYearsUntilRetirement(emps)
                + ") until retirement: ");
        printEmployeesWithMoreYearsTillRetirement(emps, averageYearsUntilRetirement(emps));

        System.out.println("\nSorting by years until retirement (increasing): ");
        Arrays.sort(emps, (a, b) -> a.yearsUntilRetirement() - b.yearsUntilRetirement());
        printEmployees(emps);

        System.out.println("\nSorting by years until retirement (descending): ");
        Arrays.sort(emps, (a, b) -> b.yearsUntilRetirement() - a.yearsUntilRetirement());
        printEmployees(emps);

        System.out.println("\nSorting by names: ");
        Arrays.sort(emps, (a, b) -> a.getName().compareTo(b.getName()));
        printEmployees(emps);
    }

    public static void printEmployees(Employee[] emps) {
        for (Employee emp : emps) {
            System.out.println(emp);
        }
    }

    public static void printEmployeesCloseToRetirement(Employee[] emps, int threshold) {
        for (Employee emp : emps) {
            int years = emp.yearsUntilRetirement();
            if (years > 0 && years <= threshold) {
                System.out.println(emp);
            }
        }
    }

    public static void printEmployeesWithMoreYearsTillRetirement(Employee[] emps, int threshold) {
        for (Employee emp : emps) {
            int years = emp.yearsUntilRetirement();
            if (years > threshold) {
                System.out.println(emp);
            }
        }
    }

    public static int averageYearsUntilRetirement(Employee[] emps) {
        int avg = 0;
        for (Employee emp : emps) {
            avg += emp.yearsUntilRetirement();
        }
        return avg / emps.length;
    }
}