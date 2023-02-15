package com.esprit.alternance.kaddem.Services;


import com.esprit.alternance.kaddem.entities.Equipe;

import java.util.List;

public interface EquipeService {    List<Equipe> retrieveAllEquipes();

     Equipe addEquipe(Equipe e);

     Equipe updateEquipe (Equipe e);

     Equipe retrieveEquipe (Integer idEquipe);

     void deleteEquipe(Equipe equipe);
}