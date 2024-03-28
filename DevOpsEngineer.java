
// DevOpsEngineer class extending Employee
class DevOpsEngineer extends Employee {
    private double bonus;

    // Constructor
    public DevOpsEngineer(String name, int employeeId, double salary, double bonus) {
        super(name, employeeId, salary);
        this.bonus = bonus;
    }

    // Calculate total salary (salary + bonus)
    public double calculateTotalSalary() {
        return getSalary() + bonus;
    }

    // Display employee details including bonus and total salary
    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Bonus: $" + bonus);
        System.out.println("Total Salary: $" + calculateTotalSalary());
    }


// Main class for testing
//public class Main {
    public static void main(String[] args) {
        // Create a DevOpsEngineer object
        DevOpsEngineer devOpsEngineer = new DevOpsEngineer("John Doe", 101, 50000.0, 5000.0);

        // Display employee details
        System.out.println("Employee Details:");
        devOpsEngineer.displayDetails();
    }
}
