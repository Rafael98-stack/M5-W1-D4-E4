package it.be.epicode.EsercizioQuattro.Entities;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "drink")
@Getter
@Setter
@ToString
@NoArgsConstructor
public class Drink  extends Common{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Setter(AccessLevel.NONE)
    private long Id;

    private int calorie;

    public Drink(String name, int price, int calorie) {
        super(name, price);
        this.calorie = calorie;
    }
}
