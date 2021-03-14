import java.util.Objects;

public class HourlyEmployee extends Employee{
  private int hours;
  private float wage;

    /**
     * constructor
     * @param firstName
     * @param lastName
     * @param id
     * @param hours
     * @param wage
     */
    public HourlyEmployee(String firstName, String lastName, int id, int hours, float wage) {
        super(firstName, lastName, id);
        this.setHours(hours);
        this.setWage(wage);
    }

    /**
     * default constructor
     */
    public HourlyEmployee() {
        this.wage=0;
        this.hours=0;
    }

    //region Getters
    public int getHours() {
        return hours;
    }
    public float getWage() {
        return wage;
    }

    //endregion

    //region Setters
    public void setWage(float wage) {
        if(hours<0)
            throw  new IllegalArgumentException("wage cannot be negative");
        this.wage = wage;
    }

    public void setHours(int hours) {
        if(hours<0)
            throw  new IllegalArgumentException("hours cannot be negative");
        this.hours = hours;
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
        if (!(o instanceof HourlyEmployee)) return false;
        if (!super.equals(o)) return false;
        HourlyEmployee that = (HourlyEmployee) o;
        return hours == that.hours && Float.compare(that.wage, wage) == 0;
    }

    /**
     *employee's earnings
     * @return the total earnings of the employee
     */
    @Override
    public float earnings() {
        return this.getHours()*this.getWage();
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
                "hours=" + hours +
                ", wage=" + String.format("%.2f",wage) ;
    }
}
