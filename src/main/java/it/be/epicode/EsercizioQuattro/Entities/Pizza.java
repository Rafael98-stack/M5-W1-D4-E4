package it.be.epicode.EsercizioQuattro.Entities;



import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity
@Table(name = "pizza")
@Getter
@Setter
@NoArgsConstructor
@ToString
public class Pizza extends Common{

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Setter(AccessLevel.NONE)
    private long Id;
private String name;
    private int price;
    private int calorie;

    @OneToMany
    private List<Topping> toppings;


    public Pizza(String name, int price, int calorie) {
        super(name, price);
        this.price = price;
        this.name = name;
        this.calorie = calorie;
    }

    public Pizza(String name, int price, int calorie, List<Topping> toppings) {
        super(name, price);
        this.price = price;
        this.name = name;
        this.calorie = calorie;
        this.toppings = toppings;
    }
}
