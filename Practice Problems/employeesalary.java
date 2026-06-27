class Employee {
    private String name;
    private double salary;

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public double calculateTax() {
        double yearlyIncome = salary * 12;

        if (yearlyIncome <= 200000) {
            return 0;
        } else if (yearlyIncome <= 500000) {
            return yearlyIncome * 0.10;
        } else if (yearlyIncome <= 1000000) {
            return yearlyIncome * 0.15;
        } else {
            return yearlyIncome * 0.15;
        }
    }

    public double calculateBonus() {
        return 0;
    }

    public void showDetails() {
        System.out.println("Name: " + getName());
        System.out.println("Monthly Salary: " + getSalary());
        System.out.println("Yearly Tax: " + calculateTax());
        System.out.println("Bonus: " + calculateBonus());
    }
}

class Manager extends Employee {

    public Manager(String name, double salary) {
        super(name, salary);
    }

    @Override
    public double calculateBonus() {
        return getSalary() * 0.10;
    }
}

class Officer extends Employee {

    public Officer(String name, double salary) {
        super(name, salary);
    }

    @Override
    public double calculateBonus() {
        return getSalary() * 0.05;
    }
}

class Staff extends Employee {

    public Staff(String name, double salary) {
        super(name, salary);
    }

    @Override
    public double calculateBonus() {
        return getSalary() * 0.02;
    }
}

public class employeesalary {

    public static void main(String[] args) {

        Employee e1 = new Manager("Mahadi", 50000);
        Employee e2 = new Officer("Rahim", 30000);
        Employee e3 = new Staff("Karim", 15000);

        e1.showDetails();
        System.out.println();

        e2.showDetails();
        System.out.println();

        e3.showDetails();
    }
}