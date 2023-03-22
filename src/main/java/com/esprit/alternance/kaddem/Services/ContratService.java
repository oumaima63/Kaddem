package com.esprit.alternance.kaddem.Services;

import com.esprit.alternance.kaddem.entities.Contrat;

import java.util.Date;
import java.util.List;

public interface ContratService {
    public List<Contrat> retrieveAllContrats();

    public Contrat updateContrat (Contrat  ce);

    public  Contrat addContrat (Contrat ce);

    public Contrat retrieveContrat (Integer  idContrat);

    public  void removeContrat(Integer idContrat);

    public Contrat affectContratToEtudiant (Integer idContrat, String nomE, String prenomE);

    public 	Integer nbContratsValides(Date startDate, Date endDate);


    public float getChiffreAffaireEntreDeuxDates(Date startDate, Date endDate);

    public void retrieveAndUpdateStatusContrat();
}
