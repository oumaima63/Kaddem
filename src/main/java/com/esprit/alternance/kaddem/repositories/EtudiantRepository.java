package com.esprit.alternance.kaddem.repositories;

import com.esprit.alternance.kaddem.entities.Etudiant;
import com.esprit.alternance.kaddem.entities.Niveau;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface EtudiantRepository extends JpaRepository<Etudiant,Integer> {



    public List<Etudiant> findEtudiantsByDepartement_IdDepart(Integer idDepart);
    List<Etudiant> findByEquipesNiveau(Niveau niveau);

    @Query("Select e From Etudiant e where e.nomE= :nomE and e.prenomE= :prenomE")
    public Etudiant findByNomEAndPrenomE(@Param("nomE") String nomE, @Param("prenomE") String prenomE);


}

