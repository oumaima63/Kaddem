package com.esprit.alternance.kaddem.repositories;

import com.esprit.alternance.kaddem.entities.Etudiant;
import com.esprit.alternance.kaddem.entities.Niveau;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface EtudiantRepository extends JpaRepository<Etudiant,Integer> {
    List<Etudiant> findByDepartmentIdDepartment(long idDepartment);

    List<Etudiant> findByEquipesNiveau(Niveau niveau);

}

