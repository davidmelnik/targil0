import java.util.Objects;

public class BasePlusCommissionEmployee extends CommissionEmployee {
    private float baseSalary;

    /**
     * constructor
     * @param firstName
     * @param lastName
     * @param id
     * @param grossSales
     * @param commission
     * @param baseSalary
     */
    public BasePlusCommissionEmployee(String firstName, String lastName, int id, float grossSales, int commission, float baseSalary) {
        super(firstName, lastName, id, grossSales, commission);
        this.setBaseSalary(baseSalary);
    }

    /**
     * default constructor
     */
    public BasePlusCommissionEmployee() {
        this.setBaseSalary(0);
    }

    //getter
    public float getBaseSalary() {
        return baseSalary;
    }

    //setter
    public void setBaseSalary(float baseSalary) {
        if(baseSalary<0)
            throw  new IllegalArgumentException("base salary cannot be negative");
        this.baseSalary = baseSalary;
    }

    /**
     *
     * @param o another object
     * @return tests if they are equal
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof BasePlusCommissionEmployee)) return false;
        if (!super.equals(o)) return false;
        BasePlusCommissionEmployee that = (BasePlusCommissionEmployee) o;
        return Float.compare(that.baseSalary, baseSalary) == 0;
    }

    /**
     *employee's earnings
     * @return the total earnings of the employee
     */
    @Override
    public float earnings() {
        return this.getBaseSalary()+ super.earnings();
    }

    /**
     * employee's string
     * @return the employee's fields as a string
     */
    @Override
    public String toString() {
        return
                super.toString()+
                ", "+
                "baseSalary=" + String.format("%.2f",baseSalary);
    }


}
