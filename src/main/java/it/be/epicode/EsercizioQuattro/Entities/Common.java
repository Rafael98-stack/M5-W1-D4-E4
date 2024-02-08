package it.be.epicode.EsercizioQuattro.Entities;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public abstract class Common {
    protected String name;

    protected int price;

    public Common() {
    }

    public Common(String name, int price) {
    }
}
