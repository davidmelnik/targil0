import java.util.Objects;

public class BasePlusCommissionEmployee extends CommissionEmployee {
    private float baseSalary;

    public BasePlusCommissionEmployee(String firstName, String lastName, int id, float grossSales, int commission, float baseSalary) {
        super(firstName, lastName, id, grossSales, commission);
        this.setBaseSalary(baseSalary);
    }

    public BasePlusCommissionEmployee() {
        this.setBaseSalary(0);
    }

    public float getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(float baseSalary) {
        if(baseSalary<0)
            throw  new IllegalArgumentException("base salary cannot be negative");
        this.baseSalary = baseSalary;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof BasePlusCommissionEmployee)) return false;
        if (!super.equals(o)) return false;
        BasePlusCommissionEmployee that = (BasePlusCommissionEmployee) o;
        return Float.compare(that.baseSalary, baseSalary) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), baseSalary);
    }

    @Override
    public String toString() {
        return
                super.toString()+
                ", "+
                "baseSalary=" + String.format("%.2f",baseSalary);
    }

    @Override
    public float earnings() {
        return this.getBaseSalary()+ super.earnings();
    }
}
