package tn.esprit.exercice.entities;

import lombok.*;

import javax.persistence.*;
import java.util.Date;
import java.util.Set;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "OPERATEUR")
public class Operateur {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Setter(AccessLevel.NONE)
    private Long idOperateur;
    private String nom;
    private String prenom;
    private String password;
    @OneToMany
    private Set<Facture> factures;

}
