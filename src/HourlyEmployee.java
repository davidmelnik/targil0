public class HourlyEmployee extends Employee{
  private int hours;
  private float wage;

    public HourlyEmployee(String firstName, String lastName, int id, int hours, float wage) {
        super(firstName, lastName, id);
        this.setHours(hours);
        this.setWage(wage);
    }

    public HourlyEmployee() {
        this.wage=0;
        this.hours=0;
    }

    @Override
    public float earnings() {
        return this.getHours()*this.getWage();
    }

    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        if(hours<0)
            throw  new IllegalArgumentException("hours cannot be negative");
        this.hours = hours;
    }

    public float getWage() {
        return wage;
    }

    public void setWage(float wage) {
        if(hours<0)
            throw  new IllegalArgumentException("wage cannot be negative");
        this.wage = wage;
    }
@Override
    public String toString() {
        return  "HourlyEmployee{" +
                super.toString()+
                ", "+
                "hours=" + hours +
                ", wage=" + String.format("%.2f",wage) +
                '}';
    }
}
