package com.flora.entity;


import java.math.BigDecimal;

public class client_florr {

    private int id;


    private String name;
    private String phone_number;
    private BigDecimal balance;


    public client_florr() {

    }

    public static Builder builder() {
        return new Builder();
    }


    public static class Builder {

        private String name;
        private String phone_number;
        private BigDecimal balance;


        public Builder name(String name) {
            this.name = name;
            return this;
        }


        public Builder phone_number(String phone_number) {
            this.phone_number = phone_number;
            return this;
        }


        public Builder balance(BigDecimal balance) {
            this.balance = balance;
            return this;
        }


        public client_florr build() {

            client_florr client = new client_florr();

            client.name = this.name;
            client.phone_number = this.phone_number;
            client.balance = this.balance;

            return client;
        }
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNane() {
        return name;
    }

    public void setNane(String nane) {
        this.name = nane;
    }

    public String getPhone_number() {
        return phone_number;
    }

    public void setPhone_number(String phone_number) {
        this.phone_number = phone_number;
    }

    public BigDecimal getBalance() {
        return balance;
    }

    public void setBalance(BigDecimal balance) {
        this.balance = balance;
    }
}
