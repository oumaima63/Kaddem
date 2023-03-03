package com.esprit.alternance.kaddem.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
/*@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter*/
public class Contrat implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_contract", nullable = false)
    private Long idContract;

  @Temporal(TemporalType.DATE)
    private Date dateDebut;
    @Temporal(TemporalType.DATE)
    private Date dateFin;
    @Enumerated(EnumType.STRING)
    private Specialite specialite;
    private Boolean archive;
    private Integer montantContrat;

// relations

    @ManyToOne
    Etudiant etudiant;
}
