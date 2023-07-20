package org.polymorphism;

public class Hamburger {
    private String name;
    private String meat;
    private double price;
    private String breadRollType;

    public Hamburger(String name, String meat, double price, String breadRollType) {
        this.name = name;
        this.meat = meat;
        this.price = price;
        this.breadRollType = breadRollType;
        System.out.println(name + " hamburger on a " + breadRollType + " roll with " + meat + ", price is " + price);
    }

    public Hamburger() {
    }

    private String addition1Name;
    private double additional1Price;
    private String addition2Name;
    private double additional2Price;
    private String addition3Name;
    private double additional3Price;
    private String addition4Name;
    private double additional4Price;

    public void addHamburgerAddition1(String addName, double price) {
        name += addName;
        this.price += price;
        System.out.println("Added " + addName + " for an extra " + price);
    }

    public void addHamburgerAddition2(String addName, double price) {
        name += addName;
        this.price += price;
        System.out.println("Added " + addName + " for an extra " + price);
    }

    public void addHamburgerAddition3(String addName, double price) {
        name += addName;
        this.price += price;
        System.out.println("Added " + addName + " for an extra " + price);
    }

    public void addHamburgerAddition4(String addName, double price) {
        name += addName;
        this.price += price;
        System.out.println("Added " + addName + " for an extra " + price);
    }

    public double itemizeHamburger() {
        return price;
    }
}

