import java.util.LinkedList;

public class TechnicalLead extends TechnicalEmployee {

    private int defaultHeadCount;
    private int currentReport;
    private LinkedList<SoftwareEngineer> swees;
    private Accountant supportedAccountant;

    public TechnicalLead(String name) {
        super(name,97500.0);
        swees = new LinkedList<SoftwareEngineer>();
        this.defaultHeadCount = 4;
        this.currentReport = 0;
        super.setManager(null);
        this.supportedAccountant = null;
        super.isManager(true);
    }

    public boolean hasHeadCount() {
        return currentReport >= defaultHeadCount;
    }

    public boolean addReport(SoftwareEngineer e) {
        if (swees.size() < 4) {
            swees.add(e);
            e.setManager(this);
            return true;
        }
        return false;
    }

    public Employee getManager() {
        return super.getManager();
    }

    public void setSupportedAccountant(Accountant a) {
        this.supportedAccountant = a;
    }

    public Accountant getSupportedAccountant() {
        return this.supportedAccountant;
    }

    public boolean approveCheckIn(SoftwareEngineer e) {
        if (swees.contains(e) && e.getCodeAccess()) {
            return true;
        }
        return false;
    }

    public boolean requestBonus(Employee e, double bonus) {
        if (this.supportedAccountant.approveBonus(bonus)) {
            SoftwareEngineer swe = (SoftwareEngineer)e;
            swe.setBonus(bonus);
            return true;
        }
        return false;
    }

    public String getTeamStatus() {
        if (swees.isEmpty()) {
            return this.employeeStatus() + " and no direct reports yet";
        }
        StringBuilder result = new StringBuilder(this.employeeStatus() + " and is managing:\n");
        for (SoftwareEngineer s : swees) {
            result.append(s.employeeStatus() + "\n");
        }
        return result.toString();
    }

    public LinkedList<SoftwareEngineer> getSwees() {
        return swees;
    }

    public String employeeStatus() {
        return super.employeeStatus();
    }
}
