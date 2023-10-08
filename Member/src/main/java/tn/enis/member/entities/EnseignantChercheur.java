package tn.enis.member.entities;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import lombok.*;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
@DiscriminatorValue("ens")
public class EnseignantChercheur extends Member {
    @NonNull
    private String grade;
    @NonNull
    private String etablissement;
    @OneToMany(mappedBy = "encadrant")
    private List<Etudiant> etudiants=new ArrayList<>();
    @Builder
    public EnseignantChercheur (Long id, @NonNull String cin, @NonNull String nom, @NonNull String prenom, @NonNull Date dateNaissance, Byte photo, String cv, @NonNull String email, @NonNull String password, @NonNull String grade, @NonNull String etablissement) {
        super(id, cin, nom, prenom, dateNaissance, photo, cv, email, password);
        this.grade = grade;
        this.etablissement = etablissement;
    }
}
