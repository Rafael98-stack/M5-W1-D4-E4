package it.be.epicode.EsercizioQuattro.Entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "drink")
@NoArgsConstructor
@Setter
@ToString
@Getter
public class Drink extends Common{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long Id;
    private String name;
    private int price;
    private int calorie;

    public Drink(String name, int price, int calorie) {
        super(name, price);
        this.calorie = calorie;
    }
}
