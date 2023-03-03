package com.esprit.alternance.kaddem.entities;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Set;

@Entity
@AllArgsConstructor
/*@Setter
@Getter*/
@NoArgsConstructor
@Table(name = "Etudiant")
public class Etudiant implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idEtudiant")
    private Integer idEtudiant; // Clé primaire
    private String prenomE;
    private String nomE;
    @Enumerated(EnumType.STRING)
    private Option op;


    // relations
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "etudiant")
    private Set<Contrat> contrats;

    @ManyToOne
    private Department department;

    @ManyToMany(cascade = CascadeType.ALL, mappedBy = "etudiants")
    private Set<Equipe> equipes;

}
