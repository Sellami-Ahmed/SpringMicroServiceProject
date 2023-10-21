package tn.enis.evenement.services;

import tn.enis.evenement.entities.Publication;

import java.util.List;
import java.util.Optional;

public interface IPublicationService {
    //Crud sur les membres
    Publication addPublication(Publication publication);
    void deletePublication(Long id) ;
    Publication updatePublication(Publication publication) ;
    Optional<Publication> findPublication(Long id) ;
    List<Publication> findAll();

}
