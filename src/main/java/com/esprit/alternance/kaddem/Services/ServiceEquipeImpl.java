package com.esprit.alternance.kaddem.Services;

import com.esprit.alternance.kaddem.entities.Equipe;
import com.esprit.alternance.kaddem.repositories.EquipeRepository;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@AllArgsConstructor
@Service
@NoArgsConstructor
public class ServiceEquipeImpl implements EquipeService {

    EquipeRepository equipeRepository;

    @Override
    public List<Equipe> retrieveAllEquipes() {
        return equipeRepository.findAll();
    }

    @Override
    public Equipe addEquipe(Equipe e) {
        return equipeRepository.save(e);
    }

    @Override

    public Equipe updateEquipe(Equipe equipe) {
        return equipeRepository.save(equipe);
    }

    @Override
    public Equipe retrieveEquipe(Integer idEquipe) {
        return equipeRepository.findById(idEquipe).get();
    }

    @Override
    public  void deleteEquipe(Integer idEquipe){
        Equipe e=retrieveEquipe(idEquipe);
        equipeRepository.delete(e);
    }
}