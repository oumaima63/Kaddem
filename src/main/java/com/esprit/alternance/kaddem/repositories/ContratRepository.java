package com.esprit.alternance.kaddem.repositories;

import com.esprit.alternance.kaddem.entities.Contrat;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.Date;
import java.util.List;

public interface ContratRepository extends JpaRepository<Contrat,Integer> {

    @Query("SELECT count(c) FROM Contrat c where ((c.archive=true) and  ((c.dateDebutContrat BETWEEN :startDate AND :endDate)) or(c.dateFinContrat BETWEEN :startDate AND :endDate))")
    public Integer getnbContratsValides(@Param("startDate") Date startDate, @Param("endDate") Date endDate);

    public List<Contrat> findAll();
    public Contrat findByIdContrat(Integer idContrat);
}

