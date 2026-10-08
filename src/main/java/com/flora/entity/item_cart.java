package com.flora.entity;

public class item_cart {


    private int id;

    private int cart_id;
    private int prod_id;
    private int quantity;

    public item_cart() {

    }

    public static item_cart.Builder builder() {
        return new item_cart.Builder();
    }


    public static class Builder {

        private int cart_id;
        private int prod_id;
        private int quantity;


        public item_cart.Builder cart_id(int cart_id) {
            this.cart_id = cart_id;
            return this;
        }


        public item_cart.Builder prod_id(int prod_id) {
            this.prod_id = prod_id;
            return this;
        }


        public item_cart.Builder quantity(int quantity) {
            this.quantity = quantity;
            return this;

        }

        public item_cart build() {

            item_cart itemCart = new item_cart();

            itemCart.cart_id = this.cart_id;
            itemCart.prod_id = this.prod_id;
            itemCart.quantity = this.quantity;

            return itemCart;
        }

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCart_id() {
        return cart_id;
    }

    public void setCart_id(int cart_id) {
        this.cart_id = cart_id;
    }

    public int getProd_id() {
        return prod_id;
    }

    public void setProd_id(int prod_id) {
        this.prod_id = prod_id;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
