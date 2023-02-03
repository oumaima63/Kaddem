package com.esprit.alternance.kaddem.entities;

import javax.persistence.*;
import java.io.Serializable;
@Entity
public class Department implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idDepartment", nullable = false)
    private Long idDepartment;

    private String nameDepartment;


}
