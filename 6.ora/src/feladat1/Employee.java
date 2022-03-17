package feladat1;

import java.time.LocalDate;
import java.time.Period;

public class Employee {
    private String name;
    private LocalDate birthdate;
    private int salary;
    private final static int retirementAge = 65;

    public Employee(String name, LocalDate birthdate, int salary) {
        this.name = name;
        this.birthdate = birthdate;
        this.salary = salary;
    }

    public Employee(String name, int year, int month, int day, int salary) {
        this.name = name;
        this.birthdate = LocalDate.of(year, month, day);
        this.salary = salary;
    }

    public Employee(String name, String birthdate, int salary) {
        this.name = name;
        this.birthdate = LocalDate.parse(birthdate);
        this.salary = salary;
    }

    public int yearsUntilRetirement() {
        // Already retired
        if (birthdate.isBefore(LocalDate.now().minusYears(retirementAge)))
            return 0;

        return retirementAge - Period.between(birthdate, LocalDate.now()).getYears();
    }

    @Override
    public String toString() {
        return "Employee [name=" + name + ", birthdate=" + birthdate + ", salary=" + salary
                + ", years until retirement=" + yearsUntilRetirement() + "]";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public LocalDate getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(LocalDate birthdate) {
        this.birthdate = birthdate;
    }

    public void setBirthdate(int year, int month, int day) {
        this.birthdate = LocalDate.of(year, month, day);
    }

    public void setBirthdate(String birthdate) {
        this.birthdate = LocalDate.parse(birthdate);
    }

    public static int getRetirementage() {
        return retirementAge;
    }

}

