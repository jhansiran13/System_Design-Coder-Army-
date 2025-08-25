class Employee {
    public String name;
    public double baseSalary;
    public Employee(String name, double baseSalary) {
this.name = name;
        this.baseSalary = baseSalary;
    }
}
 
class Payroll {
    private Employee emp;
    public Payroll(Employee emp) {
        this.emp = emp;
    }
    public double calculateSalary() {
        return emp.baseSalary + 2000; // Fixed bonus
    }
}
 
class PayrollPrinter {
    private Payroll payroll;
    public PayrollPrinter(Payroll payroll) {
        this.payroll = payroll;
    }
    public void printSlip() {
        System.out.println("Salary: Rs " + payroll.calculateSalary());
    }
}
 
class PayrollStorage {
    private Payroll payroll;
    public PayrollStorage(Payroll payroll) {
        this.payroll = payroll;
    }
    public void save() {
        System.out.println("Saving payroll to database...");
    }
}