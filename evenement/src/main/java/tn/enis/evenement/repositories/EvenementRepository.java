package tn.enis.evenement.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.enis.evenement.entities.Evenement;

public interface EvenementRepository extends JpaRepository<Evenement, Long> {
    void deleteOutilById (Long id);
//    Evenement findByCin (String cin);
//
//    List<Evenement> findByNomStartingWith (String caractere);
//
//    Evenement findByEmail (String email);
//
//    void deleteMemberById (Long id);
//
//    List<Evenement> findByNom (String nom);

}
