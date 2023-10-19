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
public class Evenement implements Serializable {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NonNull
    private String titre;
    @NonNull @Temporal(TemporalType.DATE)
    private Date date;
    @NonNull
    private String lieu;

    @Builder
    public Evenement (Long id, @NonNull String titre, @NonNull Date date, @NonNull String lieu) {
        this.id = id;
        this.titre = titre;
        this.date = date;
        this.lieu = lieu;
    }
}
