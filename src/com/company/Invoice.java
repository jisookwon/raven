package com.company;

import java.util.HashMap;

public class Invoice {
    private HashMap<String, String> customer = new HashMap<>();

    public Invoice() {
    }

    public Invoice(HashMap<String, String> customer) {
        this.customer = customer;
    }

    public HashMap<String, String> getCustomer() {
        return customer;
    }

    public void setCustomer(HashMap<String, String> customer) {
        this.customer = customer;
        customer.put("Dave Wolf","12 S.Summit Ave Gaithersburg, MD 20877");
    }

    /*public double calculate(int  question){
        this.question=question;
        double result=0;
        result=100+(question*0.35);
        return result;
    }*/
}
