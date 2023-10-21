package tn.enis.evenement.controller;


import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import tn.enis.evenement.entities.Publication;
import tn.enis.evenement.services.PublicationService;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/v1/publications")
@CrossOrigin("*")
@AllArgsConstructor
public class PublicationController {
    private final PublicationService publicationService;

    @GetMapping
    public ResponseEntity<List<Publication>> getAllPublications () {
        List<Publication> publications = publicationService.findAll();
        return new ResponseEntity<>(publications, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Optional<Publication>> getPublicationById (@PathVariable Long id) {
        Optional<Publication> member = publicationService.findPublication(id);
        return new ResponseEntity<>(member, HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<Publication> addPublication(@Validated @RequestBody Publication publication) {
        Publication addPublication = publicationService.addPublication(publication);
        return new ResponseEntity<>(addPublication, HttpStatus.CREATED);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> deletePublication (@PathVariable("id") Long id) {
        publicationService.deletePublication(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @PutMapping
    public ResponseEntity<Publication> updatePublication (@RequestBody Publication publication) {
        Publication updatedPublication = publicationService.updatePublication(publication);
        return new ResponseEntity<>(updatedPublication, HttpStatus.OK);
    }
}