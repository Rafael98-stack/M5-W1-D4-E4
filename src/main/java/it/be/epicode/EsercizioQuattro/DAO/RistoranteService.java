package it.be.epicode.EsercizioQuattro.DAO;

import it.be.epicode.EsercizioQuattro.Entities.Common;
import it.be.epicode.EsercizioQuattro.Entities.Pizza;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.annotation.Id;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
public class RistoranteService {
    @Autowired
    private RistoranteDAO ristoranteDAO;

    public void saveUser(Pizza newUser) {

            if (newUser.getName().length() < 2)
                throw new RuntimeException("Il nome non può essere più corto di 2 caratteri!");

            ristoranteDAO.save(newUser);
        System.out.println("Oggetto Salvato");


    }









}
