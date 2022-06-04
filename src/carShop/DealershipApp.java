package carShop;

public class DealershipApp {
    public static void main(String[] args) {

    Car car = new Car("Accord", "Honda", "black", 1999, "Larry", "Wile");


        System.out.println(car.describe(String.format("%s, %s, %s, %s", car.getColor(), car.getYear(),
                car.getMake(),
                car.getModel())));
    }
}




