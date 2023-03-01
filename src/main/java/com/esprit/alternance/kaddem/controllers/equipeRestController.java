package com.esprit.alternance.kaddem.controllers;

import com.esprit.alternance.kaddem.Services.EquipeService;
import com.esprit.alternance.kaddem.entities.Equipe;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/equipe")
public class equipeRestController {
    EquipeService equipeService;

    // http://localhost:8089/kaddem/equipe/retrieve-all-equipes
    @GetMapping("/retrieve-all-equipes")
    public List<Equipe> getEquipes() {
        List<Equipe> listEquipes = equipeService.retrieveAllEquipes();
        return listEquipes;
    }
        // http://localhost:8089/kaddem/equipe/retrieve-equipe/8
        @GetMapping("/retrieve-equipe/{equipe-id}")
        public Equipe retrieveEquipe(@PathVariable("equipe-id") Integer equipeId) {
            return equipeService.retrieveEquipe(equipeId);
        }

        // http://localhost:8089/kaddem/equipe/add-equipe
        @PostMapping("/add-equipe")
        public Equipe addEquipe(@RequestBody Equipe e) {
            Equipe equipe = equipeService.addEquipe(e);
            return equipe;
        }
        // http://localhost:8089/kaddem/equipe/remove-equipe/1
        @DeleteMapping("/remove-equipe/{equipe-id}")
        public void removeEquipe(@PathVariable("equipe-id") Integer equipeId) {
            equipeService.deleteEquipe(equipeId);
        }

        // http://localhost:8089/kaddem/equipe/update-equipe
        @PutMapping("/update-equipe")
        public Equipe updateEtudiant(@RequestBody Equipe e) {
            Equipe equipe= equipeService.updateEquipe(e);
            return equipe;
        }

}
