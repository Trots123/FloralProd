package com.flora.entity;


import java.math.BigDecimal;

public class payment {

    private BigDecimal full_cost;
    private boolean paid = false;
    private int order_id;

    public payment() {

    }

    public static payment.Builder builder() {
        return new payment.Builder();
    }


    public static class Builder {

        private BigDecimal full_cost;
        private boolean paid = false;
        private int order_id;


        public payment.Builder full_cost(BigDecimal full_cost) {
            this.full_cost = full_cost;
            return this;
        }


        public payment.Builder paid(boolean paid) {
            this.paid = paid;
            return this;
        }

        public payment.Builder order_id(int order_id) {
            this.order_id = order_id;
            return this;
        }


        public payment build() {

            payment payment = new payment();

            payment.full_cost = this.full_cost;
            payment.paid = this.paid;
            payment.order_id = this.order_id;

            return payment;
        }
    }

    public BigDecimal getFull_cost() {
        return full_cost;
    }

    public void setFull_cost(BigDecimal full_cost) {
        this.full_cost = full_cost;
    }

    public boolean isPaid() {
        return paid;
    }

    public void setPaid(boolean paid) {
        this.paid = paid;
    }

    public int getOrder_id() {
        return order_id;
    }

    public void setOrder_id(int order_id) {
        this.order_id = order_id;
    }
}
