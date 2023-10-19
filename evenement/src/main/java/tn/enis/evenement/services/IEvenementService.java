package tn.enis.evenement.services;

import tn.enis.evenement.entities.Evenement;

import java.util.List;
import java.util.Optional;

public interface IEvenementService {
    //Crud sur les membres
    Evenement addEvenement(Evenement evenement);
    void deleteEvenement(Long id) ;
    Evenement updateEvenement(Evenement evenement) ;
    Optional<Evenement> findEvenement(Long id) ;
    List<Evenement> findAll();

}
