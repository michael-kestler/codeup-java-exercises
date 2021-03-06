package carShop;

public class Customer implements Describable {
    //private instance fields
    private String firstName;
    private String lastName;

    //constructor
    public Customer(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }


    //getters and setters
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }


    @Override
    public String describe(String details) {
        return "Hey there " + this.firstName + " " + this.lastName +
                ", it looks like your " + details + " is ready to go!";
    }

}