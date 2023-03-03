package com.esprit.alternance.kaddem.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@Entity

public class DetailEquipe implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_detail_equipe", nullable = false)
    private Long idDetailEquipe;

    private String salle;
    private String thematique;
    //relations
    @OneToOne(mappedBy = "detailEquipe")
    @JsonIgnore
    private Equipe equipe;
}
