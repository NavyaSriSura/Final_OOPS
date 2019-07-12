package com.stackroute.BillsBurger;

public class HealthyBurger extends HamBurger
{

    private String addition5Name;
    private double addition5Price;

    private String addition6Name;
    private double addition6Price;

    public HealthyBurger(String meat, double price) {
        super("Healthy Burger", "spelt", meat, price);
    }

    public void addition5(String name, double price) {
        this.addition5Name = name;
        this.addition5Price = price;
    }

    public void addition6(String name, double price) {
        this.addition6Name = name;
        this.addition6Price = price;
    }

}
