package it.be.epicode.EsercizioQuattro.Entities;

import lombok.*;


@ToString
public abstract class Common {
    protected String name;

    protected int price;

    public Common() {
    }

    public Common(String name, int price) {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
