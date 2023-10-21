package tn.enis.outil.entities;
import jakarta.persistence.*;
import lombok.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Getter
@Setter
@NoArgsConstructor
@RequiredArgsConstructor
public class Outil implements Serializable {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NonNull @Temporal(TemporalType.DATE)
    private Date date;
    @NonNull
    private String source;

    @Builder
    public Outil (Long id, @NonNull Date date, @NonNull String source) {
        this.id = id;
        this.date = date;
        this.source = source;
    }
}
