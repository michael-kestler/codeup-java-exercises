package com.in28minutes.oops;

public class CustomerRunner {
    public static void main(String[] args) {
        Address homeAddress = new Address("line 1", "Las Vegas", "89156");
        Customer customer = new Customer("Mike Jones", homeAddress);

        Address workAddress = new Address("line 1 for work", "Las Vegas", "89156");

        customer.setWorkAddress(workAddress);

        System.out.println(customer);
    }


}
