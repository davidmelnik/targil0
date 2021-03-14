import java.util.Objects;

public class CommissionEmployee  extends Employee{

    private float grossSales;
    private int commission;

    /**
     * default constructor
     */
    public CommissionEmployee() {
        this.setCommission(0);
        this.setGrossSales(0);
    }

    /**
     * constructor
     * @param firstName
     * @param lastName
     * @param id
     * @param grossSales
     * @param commission
     */
    public CommissionEmployee(String firstName, String lastName, int id, float grossSales, int commission) {
        super(firstName, lastName, id);
        this.setGrossSales(grossSales);
        this.setCommission(commission);
    }

    //region Getters
    public float getGrossSales() {
        return grossSales;
    }

    public int getCommission() {
        return commission;
    }
    //endregion

    //region Setters
    public void setGrossSales(float grossSales) {
        if(grossSales<0)
            throw  new IllegalArgumentException("gross sales cannot be negative");
        this.grossSales = grossSales;
    }

    public void setCommission(int commission) {
        if(commission<0 || commission>100)
            throw  new IllegalArgumentException("commission must be within the range of 0 to 100");
        this.commission = commission;
    }
   //endregion

    /**
     *
     * @param o another object
     * @return tests if they are equal
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof CommissionEmployee)) return false;
        if (!super.equals(o)) return false;
        CommissionEmployee that = (CommissionEmployee) o;
        return Float.compare(that.grossSales, grossSales) == 0 && commission == that.commission;
    }

    /**
     *employee's earnings
     * @return the total earnings of the employee
     */
    @Override
    public float earnings() {
        return this.getGrossSales()*(this.getCommission()/100f); //added an 'f' to do a float division
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
                "grossSales=" + String.format("%.2f",grossSales) +
                ", commission=" + commission ;
    }
}
