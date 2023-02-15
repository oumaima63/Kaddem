package com.esprit.alternance.kaddem.Services;

import com.esprit.alternance.kaddem.entities.Etudiant;
import com.esprit.alternance.kaddem.entities.Niveau;
import com.esprit.alternance.kaddem.repositories.EtudiantRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
@AllArgsConstructor
@Service
public class ServiceEtudiantImpl implements EtudiantService{
EtudiantRepository etudiantRepository;


/*    @Override
    public List<Etudiant> findByEtudiantidEtudiantAndDepartmentnomDepart(Integer idEtudiant, String nomDepart) {
        return etudiantRepository.findAll();    }

    @Override
    public List<Etudiant> findByEtudiantnomEAndEquipeniveau(String nomE, Niveau niveau) {
        return etudiantRepository.findAll();*/
    }