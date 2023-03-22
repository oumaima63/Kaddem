package com.esprit.alternance.kaddem.Services;


import com.esprit.alternance.kaddem.entities.Etudiant;
import com.esprit.alternance.kaddem.entities.Niveau;

import java.util.List;

public interface EtudiantService {
  /*
  List<Etudiant>findByEtudiantidEtudiantAndDepartmentnomDepart(Integer idEtudiant, String nomDepart);
  List<Etudiant> findByEtudiantnomEAndEquipeniveau(String nomE , Niveau niveau);*/


    public List<Etudiant> retrieveAllEtudiants();

    public Etudiant addEtudiant (Etudiant e);

    public Etudiant updateEtudiant (Etudiant e);

    public Etudiant retrieveEtudiant(Integer  idEtudiant);

    public void removeEtudiant(Integer idEtudiant);

    public void assignEtudiantToDepartement (Integer etudiantId, Integer departementId);

    public Etudiant addAndAssignEtudiantToEquipeAndContract(Etudiant e, Integer idContrat, Integer idEquipe);

    public 	List<Etudiant> getEtudiantsByDepartement (Integer idDepartement);
}
