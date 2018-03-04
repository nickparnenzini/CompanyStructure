public class SoftwareEngineer extends TechnicalEmployee {

    private boolean codeAccess;
    private Employee manager;
    private double bonus;

    public SoftwareEngineer(String name) {
        super(name,75000);
        this.codeAccess = false;
        this.manager = null;
        this.bonus = 0.0;
    }

    public boolean getCodeAccess() {
        return codeAccess;
    }

    public void setCodeAccess(boolean access) {
        this.codeAccess = access;
    }

    public void setManager(TechnicalLead t) {
        this.manager = t;
    }

    public Employee getManager() {
        return this.manager;
    }

    public double getBonus() {
        return this.bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    public int getSuccessfulCheckIns() {
        return super.getSuccessfulCheckIns();
    }

    public String employeeStatus() {

    }

    public int getSuccessfulCheckIns() {
        
    }
}
