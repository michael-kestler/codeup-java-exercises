package carShop;

public class Car extends Customer{
    //fields that cannot be accessed outside of Car
    private String model;
    private String make;
    private String color;
    private int year;

    //constructor that sets model, make, color, and year
    public Car(String model, String make, String color, int year, String firstName, String lastName) {
        super(firstName, lastName);
        this.model = model;
        this.make = make;
        this.color = color;
        this.year = year;
    }

    //write getters and setters for each property
        public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }







}
