package com.onlineShopping;

public class CustomerRunner {
    public static void main(String[] args) {
        Customer customer = new Customer("Mohan","SakiNaka");
        System.out.println(customer.getName());
        System.out.println(customer.getAddress());

        customer.login("Rohan","Rameswari");
        System.out.println("Customer Name is Successfully add : "+ customer.getName());
        System.out.println("Customer Address is Successfully add : "+ customer.getAddress());

        customer.logOut("Rohan","Rameshwari");
        System.out.println("\n Customer Name logOut is Successfully add : "+ customer.getName());
        System.out.println(" Customer Address logOut is Successfully add : "+ customer.getAddress());

        ShoppingCart shopping=new ShoppingCart();
        shopping.add("Pizza","RuPay");
        System.out.println("\n Customer added his cart Successfully : "+ shopping.getCart());
        System.out.println(" Customer purchesed items Successfully  : "+ shopping.getItems());
    }
}
