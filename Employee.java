public abstract class Employee {

    private String name;
    private double baseSalary;
    private int employeeID;
    private static int employees = 0;

    public Employee(String name, double baseSalary) {
        this.name = name;
        this.baseSalary = baseSalary;
        this.employeeID = employees;
        employees++;
    }

    public double getBaseSalary() {
        return this.baseSalary;
    }

    public String getName() {
        return this.name;
    }

    public int getEmployeeID() {
        return this.employeeID;
    }

    public abstract Employee getManager();

    public boolean equals(Employee other) {
        return this.employeeID == other.getEmployeeID();
    }

    public String toString() {
        String result = Integer.toString(this.employeeID) + " " + this.name;
        return result;
    }

    public abstract String employeeStatus();
}
