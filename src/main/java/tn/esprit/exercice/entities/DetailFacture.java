package tn.esprit.exercice.entities;

import lombok.*;

import javax.persistence.*;
import java.util.Set;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "DETAILFACTURE")
public class DetailFacture {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Setter(AccessLevel.NONE)
    private Long idFacture;
    private int qteCommandee;
    private float prixTotalDetail;
    private int pourcentageRemise;
    private float montantRemise;
    @ManyToOne
    private Facture facture;
    @ManyToOne
    private Produit produit;


}
