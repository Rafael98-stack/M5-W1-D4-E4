package it.be.epicode.EsercizioQuattro;

import it.be.epicode.EsercizioQuattro.DAO.RistoranteService;
import it.be.epicode.EsercizioQuattro.Entities.Pizza;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.Random;

@Component
public class Runner implements CommandLineRunner {
    @Autowired
    RistoranteService ristoranteService;
    @Override
    public void run(String... args) throws Exception {
        Random rndm = new Random();
        System.out.println("--------------------------------------------- SAVE -----------------------------------------");
        Pizza pizza = new Pizza("Pizza_Margherita",7,700);
        ristoranteService.saveUser(pizza);

    }
}
