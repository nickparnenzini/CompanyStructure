public abstract class TechnicalEmployee extends Employee {

    private int successfulCheckIns;

    public TechnicalEmployee(String name, double salary) {
        super(name,salary);
        this.successfulCheckIns = 0;
    }

    public String employeeStatus() {
        String result = this.toString() + " has " + Integer.toString(this.successfulCheckIns) + " successful check ins.";
        return result;
    }

    public int getSuccessfulCheckIns() {
        return this.successfulCheckIns;
    }

    public int getEmployeeID() {
        return super.getEmployeeID();
    }

    public String toString() {
        return super.toString();
    }
}
