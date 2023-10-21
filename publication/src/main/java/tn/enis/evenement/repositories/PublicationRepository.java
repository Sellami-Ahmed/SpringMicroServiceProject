package tn.enis.evenement.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.enis.evenement.entities.Publication;

public interface PublicationRepository extends JpaRepository<Publication, Long> {
    void deleteOutilById (Long id);
//    Publication findByCin (String cin);
//
//    List<Publication> findByNomStartingWith (String caractere);
//
//    Publication findByEmail (String email);
//
//    void deleteMemberById (Long id);
//
//    List<Publication> findByNom (String nom);

}
