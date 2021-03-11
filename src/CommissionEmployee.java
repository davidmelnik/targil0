import java.util.Objects;

public class CommissionEmployee  extends Employee{

    private float grossSales;
    private int commission;

    public CommissionEmployee() {
        this.setCommission(0);
        this.setGrossSales(0);
    }

    public CommissionEmployee(String firstName, String lastName, int id, float grossSales, int commission) {
        super(firstName, lastName, id);
        this.setGrossSales(grossSales);
        this.setCommission(commission);
    }

    public float getGrossSales() {
        return grossSales;
    }

    public void setGrossSales(float grossSales) {
        if(grossSales<0)
            throw  new IllegalArgumentException("gross sales cannot be negative");
        this.grossSales = grossSales;
    }

    public int getCommission() {
        return commission;
    }

    public void setCommission(int commission) {
        if(commission<0 || commission>100)
            throw  new IllegalArgumentException("commission must be within the range of 0 to 100");
        this.commission = commission;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof CommissionEmployee)) return false;
        if (!super.equals(o)) return false;
        CommissionEmployee that = (CommissionEmployee) o;
        return Float.compare(that.grossSales, grossSales) == 0 && commission == that.commission;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), grossSales, commission);
    }

    @Override
    public float earnings() {
        return this.getGrossSales()*(this.getCommission()/100);
    }

    @Override
    public String toString() {
        return "CommissionEmployee{" +
                super.toString()+
                ", "+
                "grossSales=" + grossSales +
                ", commission=" + commission +
                '}';
    }
}
