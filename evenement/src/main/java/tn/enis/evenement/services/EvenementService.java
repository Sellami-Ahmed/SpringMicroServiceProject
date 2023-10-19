package tn.enis.evenement.services;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.enis.evenement.entities.Evenement;
import tn.enis.evenement.repositories.EvenementRepository;

import java.util.List;
import java.util.Optional;
@Service
@AllArgsConstructor
public class EvenementService implements IEvenementService {
    private final EvenementRepository evenementRepository;


    @Override
    public Evenement addEvenement (Evenement evenement) {
        return evenementRepository.save(evenement);
    }

    @Override
    public void deleteEvenement (Long id) {
        evenementRepository.deleteOutilById(id);
    }

    @Override
    public Evenement updateEvenement (Evenement evenement) {
        return evenementRepository.save(evenement);
    }

    @Override
    public Optional<Evenement> findEvenement (Long id) {
        return evenementRepository.findById(id);
    }

    @Override
    public List<Evenement> findAll () {
        return evenementRepository.findAll();
    }
}
