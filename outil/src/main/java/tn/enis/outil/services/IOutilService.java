package tn.enis.outil.services;

import tn.enis.outil.entities.Outil;

import java.util.List;
import java.util.Optional;

public interface IOutilService {
    //Crud sur les membres
    Outil addOutil(Outil m);
    void deleteOutil(Long id) ;
    Outil updateOutil(Outil p) ;
    Optional<Outil> findOutil(Long id) ;
    List<Outil> findAll();

}
