package it.be.epicode.EsercizioQuattro.DAO;

import it.be.epicode.EsercizioQuattro.Entities.Common;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RistoranteService {
    @Autowired
    private RistoranteDAO ristoranteDAO;

    public void saveOggetto(Common common) {
ristoranteDAO.save(common);
    }

//    public Common findById(long id) {
//
//    }
//
//    public void findByIdAndUpdate(long userId, Common updatedUser) {
//
//    }
//
//    public void findByIdAndDelete(long userId) {
//        Common found = this.findById(userId);
//        ristoranteDAO.delete(found);
//        log.info("L'utente con l'id " + userId + " è stato cancellato correttamente!");
//    }

}
