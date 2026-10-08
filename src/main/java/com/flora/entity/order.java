package com.flora.entity;

import java.math.BigDecimal;


public class order {

    private int id;

    private int cart_id;
    private BigDecimal total_price;

    public order() {

    }

    public static order.Builder builder() {
        return new order.Builder();
    }


    public static class Builder {

        private int cart_id;
        private BigDecimal total_price;


        public order.Builder cart_id(int cart_id) {
            this.cart_id = cart_id;
            return this;
        }


        public order.Builder total_price(BigDecimal total_price) {
            this.total_price = total_price;
            return this;
        }


        public order build() {

            order order = new order();

            order.cart_id = this.cart_id;
            order.total_price = this.total_price;

            return order;
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

    public BigDecimal getTotal_price() {
        return total_price;
    }

    public void setTotal_price(BigDecimal total_price) {
        this.total_price = total_price;
    }
}
