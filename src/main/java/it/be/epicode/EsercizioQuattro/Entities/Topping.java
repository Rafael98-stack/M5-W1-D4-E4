package it.be.epicode.EsercizioQuattro.Entities;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity
@Table(name = "users")
@Getter
@Setter
@ToString
public class Topping extends Common{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Setter(AccessLevel.NONE)
    private long Id;

    private int calorie;
    @ManyToMany
    private List<Pizza> pizzas;

    public Topping() {
    }

    public Topping(String name, int price, int calorie, List<Pizza> pizzas) {
        super(name, price);
        this.calorie = calorie;
        this.pizzas = pizzas;
    }
}
