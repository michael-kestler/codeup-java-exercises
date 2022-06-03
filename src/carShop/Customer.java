package carShop;

public class Customer implements Describable {
    //private instance fields
    private String firstName;
    private String lastName;

    //constructor
//    public Customer(String firstName, String lastName){
//        this.firstName = firstName;
//        this.lastName = lastName;
//    }

//    public Customer(){
//        this.firstName = firstName;
//        this.lastName = lastName;
//    }

//    @Override
    public void describe(String details) {
        System.out.println("Hey there " + firstName + lastName +
                ", it looks like your car is ready to go");
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

}


