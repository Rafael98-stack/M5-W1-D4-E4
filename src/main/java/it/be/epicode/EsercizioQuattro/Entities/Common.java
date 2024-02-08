package it.be.epicode.EsercizioQuattro.Entities;

import jakarta.persistence.*;
import lombok.*;


@Setter
@Getter
@NoArgsConstructor
@ToString
@Embeddable
@Entity
public abstract class Common {

@Id
    @GeneratedValue
    protected long Id;
    protected String name;

    protected int price;

    public Common(String name, int price) {
    }


}
