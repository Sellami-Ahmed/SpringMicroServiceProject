package tn.enis.evenement.controller;


import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import tn.enis.evenement.entities.Evenement;
import tn.enis.evenement.services.EvenementService;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/v1/evenements")
@CrossOrigin("*")
@AllArgsConstructor
public class EvenementController {
    private final EvenementService evenementService;

    @GetMapping
    public ResponseEntity<List<Evenement>> getAllEvenements () {
        List<Evenement> evenements = evenementService.findAll();
        return new ResponseEntity<>(evenements, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Optional<Evenement>> getEvenementById (@PathVariable Long id) {
        Optional<Evenement> member = evenementService.findEvenement(id);
        return new ResponseEntity<>(member, HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<Evenement> addEvenement(@Validated @RequestBody Evenement evenement) {
        Evenement newClient = evenementService.addEvenement(evenement);
        return new ResponseEntity<>(newClient, HttpStatus.CREATED);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> deleteEvenement (@PathVariable("id") Long id) {
        evenementService.deleteEvenement(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @PutMapping
    public ResponseEntity<Evenement> updateEvenement (@RequestBody Evenement evenement) {
        Evenement updatedEvenement = evenementService.updateEvenement(evenement);
        return new ResponseEntity<>(updatedEvenement, HttpStatus.OK);
    }
}