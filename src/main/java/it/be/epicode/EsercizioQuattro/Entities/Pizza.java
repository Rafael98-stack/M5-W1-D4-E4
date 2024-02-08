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
@ToString
@NoArgsConstructor
public class Pizza extends Common{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Setter(AccessLevel.NONE)
    private long Id;

    private int calorie;

    @OneToMany
    private List<Topping> toppings;

    public Pizza() {
    }

    public Pizza(String name, int price, int calorie, List<Topping> toppings) {
        super(name, price);
        this.calorie = calorie;
        this.toppings = toppings;
    }
}
