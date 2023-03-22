package com.esprit.alternance.kaddem.Services;

import com.esprit.alternance.kaddem.entities.*;
import com.esprit.alternance.kaddem.repositories.ContratRepository;
import com.esprit.alternance.kaddem.repositories.DepartmentRepository;
import com.esprit.alternance.kaddem.repositories.EquipeRepository;
import com.esprit.alternance.kaddem.repositories.EtudiantRepository;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
@Service
@Slf4j
@AllArgsConstructor
public class ServiceEtudiantImpl implements EtudiantService{


/*    @Override
    public List<Etudiant> findByEtudiantidEtudiantAndDepartmentnomDepart(Integer idEtudiant, String nomDepart) {
        return etudiantRepository.findAll();    }

    @Override
    public List<Etudiant> findByEtudiantnomEAndEquipeniveau(String nomE, Niveau niveau) {
        return etudiantRepository.findAll();*/

    EtudiantRepository etudiantRepository ;
    ContratRepository contratRepository;
    EquipeRepository equipeRepository;
    DepartmentRepository departementRepository;
    public List<Etudiant> retrieveAllEtudiants(){
        return (List<Etudiant>) etudiantRepository.findAll();
    }

    public Etudiant addEtudiant (Etudiant e){
        return etudiantRepository.save(e);
    }

    public Etudiant updateEtudiant (Etudiant e){
        return etudiantRepository.save(e);
    }

    public Etudiant retrieveEtudiant(Integer  idEtudiant){
        return etudiantRepository.findById(idEtudiant).get();
    }

    public void removeEtudiant(Integer idEtudiant){
        Etudiant e=retrieveEtudiant(idEtudiant);
        etudiantRepository.delete(e);
    }

    public void assignEtudiantToDepartement (Integer etudiantId, Integer departementId){
        Etudiant etudiant = etudiantRepository.findById(etudiantId).orElse(null);
        Department departement = departementRepository.findById(departementId).orElse(null);
        etudiant.setDepartment(departement);
        etudiantRepository.save(etudiant);
    }

    @Transactional
    public Etudiant addAndAssignEtudiantToEquipeAndContract(Etudiant e, Integer idContrat, Integer idEquipe){
        Contrat c=contratRepository.findById(idContrat).orElse(null);
        Equipe eq=equipeRepository.findById(idEquipe).orElse(null);
        c.setEtudiant(e);
        eq.getEtudiants().add(e);
        return e;
    }

    public 	List<Etudiant> getEtudiantsByDepartement (Integer idDepartement){
        return  etudiantRepository.findEtudiantsByDepartement_IdDepart((idDepartement));
    }
}