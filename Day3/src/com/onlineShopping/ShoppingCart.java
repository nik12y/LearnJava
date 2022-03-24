package com.onlineShopping;

public class ShoppingCart {

    private String cart;
    private  String items;
    public String getCart() {
        return cart;
    }

    public void setCart(String cart) {
        this.cart = cart;
    }

    public String getItems() {
        return items;
    }

    public void setItems(String items) {
        this.items = items;
    }
  void add(String items,String cart){
        this.items=items;
        this.cart=cart;
  }

}
