package it.be.epicode.EsercizioQuattro.DAO;

import it.be.epicode.EsercizioQuattro.Entities.Common;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;


@Repository
    public interface RistoranteDAO extends JpaRepository<Common, Long> {
        List<Common> findBySurname(String surname);

        List<Common> findByNameAndSurname(String name, String surname);

        List<Common> findBySurnameStartingWithIgnoreCase(String partialSurname);

        List<Common> findByNameIn(List<String> names);

        List<Common> findByEmailNull();


      }
