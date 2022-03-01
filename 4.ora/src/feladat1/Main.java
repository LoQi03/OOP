package feladat1;

public class Main {

    public static void main(String[] args) {
        Employee[] emps = { new Employee("Levente Fazekas", 100), new Employee("Baksa Erika Varga", 150),
                new Employee("Charles Heavy", 450), new Employee("Balage Bolyki", 10),
                new Employee("Laszlo Smid", 120) };
        printEmployees(emps);
        System.out.println("Largest salary: " + largestSalary(emps));
        System.out.println("Nr. of salaries between 100 and 200: " + cntEmpsSalaryInterval(emps, 100, 200));
        System.out.println("Average salary: " + avgSalary(emps));
        System.out.println("Total tax to pay: " + sumTax(emps));

    }

    public static void printEmployees(Employee[] emps) {
        for (Employee emp : emps) {
            System.out.println(emp);
        }
    }

    public static Employee largestSalary(Employee[] emps) {
        Employee max = emps[0];
        for (int i = 1; i < emps.length; i++) {
            if (emps[i].isSalaryGreater(max)) {
                max = emps[i];
            }
        }
        return max;
    }

    public static int cntEmpsSalaryInterval(Employee[] emps, int min, int max) {
        int cnt = 0;
        for (Employee emp : emps) {
            if (emp.isSalaryInRange(min, max)) {
                cnt++;
            }
        }
        return cnt;
    }

    public static double avgSalary(Employee[] emps) {
        double avg = 0;
        for (Employee emp : emps) {
            avg += emp.getSalary();
        }
        return avg / (double) emps.length;
    }

    public static int sumTax(Employee[] emps) {
        int tax = 0;
        for (Employee emp : emps) {
            tax += emp.tax();
        }
        return tax;
    }

}
