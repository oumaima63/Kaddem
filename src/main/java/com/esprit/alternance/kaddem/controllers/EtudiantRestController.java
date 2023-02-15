package com.esprit.alternance.kaddem.controllers;

import com.esprit.alternance.kaddem.Services.EtudiantService;
import com.esprit.alternance.kaddem.entities.Etudiant;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
//@NoArgsConstructor
@RequestMapping("/etudiant")
public class EtudiantRestController {
/*
    @Autowired
    EtudiantService etudiantService;

    // http://localhost:8089/etudiant/1/info
    @GetMapping("/{department-id}/{department-name}")
    public List<Etudiant> getEtudiants(@RequestParam("etudiant-id") Integer etudiantId, @RequestParam("department-name") String departmentName) {
        List<Etudiant> listEtudiants = etudiantService.findByEtudiantidEtudiantAndDepartmentnomDepart(etudiantId, departmentName);
        return listEtudiants;
*/

    }