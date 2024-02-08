package it.be.epicode.EsercizioQuattro.DAO;

import it.be.epicode.EsercizioQuattro.Entities.Common;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RistoranteDAO extends JpaRepository<Common, Long> {
}
