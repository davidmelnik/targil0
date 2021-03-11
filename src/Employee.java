import java.util.Objects;

public abstract class Employee {
private String firstName;
private  String lastName;
private int id;

    public Employee() {

        this.firstName= "plony";
        this.lastName="almony";
        this.id=0;
    }

    public Employee(String firstName, String lastName, int id) {
        this.setFirstName(firstName);
        this.setLastName(lastName);
        this.setId(id);
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getId() {
        return id;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setId(int id) {
        if(id<0 || id>999999999)
            throw  new IllegalArgumentException("id cannot be negative or more than 9 digits");
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Employee)) return false;
        Employee employee = (Employee) o;
        return id == employee.id && firstName.equals(employee.firstName) && lastName.equals(employee.lastName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName, id);
    }

    public abstract float earnings();

    @Override
    public String toString() {
        return "Employee{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", id=" + id +
                '}';
    }
}
