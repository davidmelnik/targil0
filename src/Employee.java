import java.util.Objects;

public abstract class Employee {
private String firstName;
private  String lastName;
private int id;

    /**
     * default constructor
     */
    public Employee() {

        this.firstName= "plony";
        this.lastName="almony";
        this.id=0;
    }

    /**
     * constructor
     * @param firstName
     * @param lastName
     * @param id
     */
    public Employee(String firstName, String lastName, int id) {
        this.setFirstName(firstName);
        this.setLastName(lastName);
        this.setId(id);
    }

    //region Getters
    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getId() {
        return id;
    }
    //endregion

    //region Setters
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setId(int id) {
        if(id<0 || id>999999999) //if id is out of the range throw an exception
            throw  new IllegalArgumentException("id cannot be negative or more than 9 digits");
        this.id = id;
    }
    //endregion

    /**
     *
     * @param o other object
     * @return tests if they are equal
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Employee)) return false;
        Employee employee = (Employee) o;
        return id == employee.id && firstName.equals(employee.firstName) && lastName.equals(employee.lastName);
    }

    /**
     *employee's earnings
     * @return the total earnings of the employee
     */
    public abstract float earnings();

    /**
     * employee's string
     * @return the employee's fields as a string
     */
    @Override
    public String toString() {
        return
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", id=" + id +
                ", earning=" +this.earnings();

    }
}
