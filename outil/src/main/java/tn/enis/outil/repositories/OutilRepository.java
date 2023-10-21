package tn.enis.outil.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.enis.outil.entities.Outil;

import java.util.List;

public interface OutilRepository extends JpaRepository<Outil, Long> {
    void deleteOutilById (Long id);
//    Outil findByCin (String cin);
//
//    List<Outil> findByNomStartingWith (String caractere);
//
//    Outil findByEmail (String email);
//
//    void deleteMemberById (Long id);
//
//    List<Outil> findByNom (String nom);

}
