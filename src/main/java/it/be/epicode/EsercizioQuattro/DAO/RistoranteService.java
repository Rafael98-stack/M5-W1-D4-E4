package it.be.epicode.EsercizioQuattro.DAO;

import it.be.epicode.EsercizioQuattro.Entities.Common;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.annotation.Id;
import org.springframework.stereotype.Service;

import java.util.List;

@Service // Specializzazione di @Component
// Il service ci serve per poter aggiungere eventuale logica addizionale custom, prima dei metodi del DAO
@Slf4j
public class RistoranteService {
    @Autowired
    private RistoranteDAO ristoranteDAO;

    public void saveUser(User newUser) {
        // Nel caso della save, eventuale logica addizionale custom potrebbe essere ad esempio aggiunta di campi extra allo user
        // oppure controlli vari
        if (this.existsByEmail(newUser.getEmail())) {
            throw new RuntimeException("L'email " + newUser.getEmail() + " è già in uso!");
        } else {
            if (newUser.getName().length() < 2)
                throw new RuntimeException("Il nome non può essere più corto di 2 caratteri!");
            newUser.setAvatarURL("https://picsum.photos/200/300");
            usersDAO.save(newUser);
            log.info("Utente salvato correttamente!");
        }

    }

    public Common findById(long id) throws ItemNotFoundException {
	/*	Optional<User> found = usersDAO.findById(userId);
		if (found.isPresent()) {
			// ritorno utente
			return found.get(); // Se ho la certezza che lo user non sia null, con la get converto l'optional in user
		} else {
			// utente non trovato
			throw new ItemNotFoundException(userId);
		}*/

        return RistoranteDAO.findById(id).orElseThrow(() -> new ItemNotFoundException(Id)); // Alternativa molto più compatta al codice di sopra
    }








}
