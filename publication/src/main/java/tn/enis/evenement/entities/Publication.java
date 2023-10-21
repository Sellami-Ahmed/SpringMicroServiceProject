package tn.enis.evenement.entities;
import jakarta.persistence.*;
import lombok.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Getter
@Setter
@NoArgsConstructor
@RequiredArgsConstructor
public class Publication implements Serializable {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NonNull
    private String type;
    @NonNull
    private String titre;

    @NonNull
    private String lien;
    @NonNull @Temporal(TemporalType.DATE)
    private Date date;
    @NonNull
    private String sourcePdf;

    @Builder
    public Publication (Long id, @NonNull String type, @NonNull String titre, @NonNull String lien, @NonNull Date date, @NonNull String sourcePdf) {
        this.id = id;
        this.type = type;
        this.titre = titre;
        this.lien = lien;
        this.date = date;
        this.sourcePdf = sourcePdf;
    }
}
