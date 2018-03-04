public abstract class BusinessEmployee extends Employee {

    public BusinessEmployee(String name, double salary) {
        super(name,salary);
    }

    public abstract double getBonusBadget();

    public abstract String employeeStatus();

    public int getEmployeeID() {
        return super.getEmployeeID();
    }

    public String toString() {
        return super.toString();
    }
}
