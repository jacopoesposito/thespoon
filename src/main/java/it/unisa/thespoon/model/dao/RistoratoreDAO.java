package it.unisa.thespoon.model.dao;

import it.unisa.thespoon.model.entity.Ristoratore;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

/* Interfaccia che rappresenta il DAO di un Ristoratore */

public interface RistoratoreDAO extends JpaRepository<Ristoratore, Integer> {

    /* Query per recuperare un ristoratore data una mail */
    @Query(value = "SELECT * FROM Ristoratore r where r.Email=?", nativeQuery = true)
    Ristoratore findByEmail(String Email);
}
