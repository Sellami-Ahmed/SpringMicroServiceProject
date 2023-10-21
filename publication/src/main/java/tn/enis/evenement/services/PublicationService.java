package tn.enis.evenement.services;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.enis.evenement.entities.Publication;
import tn.enis.evenement.repositories.PublicationRepository;

import java.util.List;
import java.util.Optional;
@Service
@AllArgsConstructor
public class PublicationService implements IPublicationService {
    private final PublicationRepository publicationRepository;


    @Override
    public Publication addPublication (Publication publication) {
        return publicationRepository.save(publication);
    }

    @Override
    public void deletePublication (Long id) {
        publicationRepository.deleteOutilById(id);
    }

    @Override
    public Publication updatePublication (Publication publication) {
        return publicationRepository.save(publication);
    }

    @Override
    public Optional<Publication> findPublication (Long id) {
        return publicationRepository.findById(id);
    }

    @Override
    public List<Publication> findAll () {
        return publicationRepository.findAll();
    }
}
