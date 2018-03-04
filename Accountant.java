import java.util.LinkedList;

public class Accountant extends BusinessEmployee {

    private TechnicalLead teamSupported;
    private double bonusBadget;
    private Employee manager;

    public Accountant(String name) {
        super(name,50000);
        this.teamSupported = null;
        this.bonusBadget = 0.0;
        this.manager = null;
    }

    public TechnicalLead getTeamSupported() {
        return teamSupported;
    }

    public double getBonusBadget() {
        return this.bonusBadget;
    }

    public Employee getManager() {
        return this.manager;
    }

    public void supportTeam(TechnicalLead lead) {
        LinkedList<SoftwareEngineer> swees = lead.getSwees();
        double bonusBadget = 0.0;
        for (SoftwareEngineer s : swees) {
            bonusBadget += s.getBaseSalary();
        }
        bonusBadget += (bonusBadget)*0.1;
        this.bonusBadget = bonusBadget;
    }

    public boolean approveBonus(double bonus) {
        if ( (teamSupported == null) || (bonus > this.bonusBadget)) {
            return false;
        }
        this.bonusBadget -= bonus;
        return true;
    }

    public String employeeStatus() {
        String result = super.toString() + " with a budget of " + Double.toString(this.bonusBadget) + " is supporting " + teamSupported.getName();
        return result;
    }
}
