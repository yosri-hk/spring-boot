package tn.esprit.exercice.entities;

import lombok.*;
import org.springframework.stereotype.Service;

import javax.persistence.*;
import java.util.Set;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "FOURNISSEUR")
public class Fournisseur {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Setter(AccessLevel.NONE)
    private Long idFournisseur;
    private String codeFournisseur;
    private String libelleFournisseur;
    private CategorieFournisseur categorieFournisseur;
    @OneToMany(mappedBy = "fournisseur")
    private Set<Facture> factures;
    @ManyToMany
    private Set<SecteurActivite> secteurActivites;
    @OneToOne
    private DetailFournisseur detailFournisseur;
}
