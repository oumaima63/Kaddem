package com.esprit.alternance.kaddem.entities;


import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import javax.persistence.*;
import java.io.Serializable;
import java.util.Set;

@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Equipe implements Serializable
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idEquipe", nullable = false)
    private Integer idEquipe;

    private String nameEquipe;
    @Enumerated(EnumType.STRING)
    private Niveau niveau;

    //relations
    @ManyToMany(cascade = CascadeType.ALL)
    private Set<Etudiant> etudiants;
    @OneToOne
    private DetailEquipe detailEquipe;
}
