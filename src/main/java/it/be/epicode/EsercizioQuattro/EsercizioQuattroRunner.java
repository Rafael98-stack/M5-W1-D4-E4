package it.be.epicode.EsercizioQuattro;

import it.be.epicode.EsercizioQuattro.DAO.RistoranteDAO;
import it.be.epicode.EsercizioQuattro.DAO.RistoranteService;
import it.be.epicode.EsercizioQuattro.Entities.Pizza;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class EsercizioQuattroRunner implements CommandLineRunner {
@Autowired
   private RistoranteDAO ristoranteDAO;
@Autowired
private RistoranteService ristoranteService;
    @Override
    public void run(String... args) throws Exception {
        System.out.println("--------------------------------------------- SAVE -----------------------------------------");
        Pizza pizza = new Pizza("PizzaMargherita",7,500);
        ristoranteService.saveOggetto(pizza);
    }
}
