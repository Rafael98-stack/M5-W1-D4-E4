package it.be.epicode.EsercizioQuattro.Entities;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity
@Table(name = "topping")
@Getter
@Setter
@NoArgsConstructor
@ToString
public class Topping extends Common{

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Setter(AccessLevel.NONE)
    private long Id;

    private String name;
    private int price;
    private int calorie;
    @ManyToMany
    private List<Pizza> pizzas;

    public Topping(String name, int price, int calorie) {
        super(name, price);
        this.price = price;
        this.name = name;
        this.calorie = calorie;
    }

    public Topping(String name, int price, int calorie, List<Pizza> pizzas) {
        super(name, price);
        this.price = price;
        this.name = name;
        this.calorie = calorie;
        this.pizzas = pizzas;
    }
}
