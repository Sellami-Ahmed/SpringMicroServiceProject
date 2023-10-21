package tn.enis.outil.controller;


import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import tn.enis.outil.entities.Outil;
import tn.enis.outil.services.OutilService;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/v1/outils")
@CrossOrigin("*")
@AllArgsConstructor
public class OutilController {
    private final OutilService outilService;

    @GetMapping
    public ResponseEntity<List<Outil>> getAllOutils () {
        List<Outil> outils = outilService.findAll();
        return new ResponseEntity<>(outils, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Optional<Outil>> getOutilById (@PathVariable Long id) {
        Optional<Outil> member = outilService.findOutil(id);
        return new ResponseEntity<>(member, HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<Outil> addOutil (@Validated @RequestBody Outil outil) {
        Outil newClient = outilService.addOutil(outil);
        return new ResponseEntity<>(newClient, HttpStatus.CREATED);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> deleteOutil (@PathVariable("id") Long id) {
        outilService.deleteOutil(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @PutMapping
    public ResponseEntity<Outil> updateOutil (@RequestBody Outil outil) {
        Outil updatedOutil = outilService.updateOutil(outil);
        return new ResponseEntity<>(updatedOutil, HttpStatus.OK);
    }
}