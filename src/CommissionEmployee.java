import java.util.Objects;

public class CommissionEmployee  extends Employee{

    private float grossSales;
    private int commision;

    public CommissionEmployee() {
        this.setCommision(0);
        this.setGrossSales(0);
    }

    public CommissionEmployee(String firstName, String lastName, int id, float grossSales, int commision) {
        super(firstName, lastName, id);
        this.setGrossSales(grossSales);
        this.setCommision(commision);
    }

    public float getGrossSales() {
        return grossSales;
    }

    public void setGrossSales(float grossSales) {
        this.grossSales = grossSales;
    }

    public int getCommision() {
        return commision;
    }

    public void setCommision(int commision) {
        this.commision = commision;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof CommissionEmployee)) return false;
        if (!super.equals(o)) return false;
        CommissionEmployee that = (CommissionEmployee) o;
        return Float.compare(that.grossSales, grossSales) == 0 && commision == that.commision;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), grossSales, commision);
    }

    @Override
    public float earnings() {
        return this.getGrossSales()*(this.getCommision()/100);
    }

    @Override
    public String toString() {
        return "CommissionEmployee{" +
                super.toString()+
                ", "+
                "grossSales=" + grossSales +
                ", commision=" + commision +
                '}';
    }
}
