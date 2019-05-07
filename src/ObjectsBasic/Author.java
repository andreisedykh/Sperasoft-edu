package ObjectsBasic;

public class Author {

    String firstName;
    String lastName;

    public void setFirstName( String firstName) {
        this.firstName = firstName;
    }

    public void setLastName( String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public void printFullName() {
        System.out.println("My name is " + firstName + " " + lastName);
    }

    public String getFullName() {
        return (getFirstName() +" " + getLastName());
    }

}
