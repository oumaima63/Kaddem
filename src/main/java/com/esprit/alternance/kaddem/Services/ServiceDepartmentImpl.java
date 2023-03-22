package com.esprit.alternance.kaddem.Services;


import com.esprit.alternance.kaddem.entities.Department;
import com.esprit.alternance.kaddem.repositories.DepartmentRepository;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
@Slf4j
public class ServiceDepartmentImpl implements DepartmentService{
DepartmentRepository departmentRepository;


    public List<Department> retrieveAllDepartements(){
        return (List<Department>) departmentRepository.findAll();
    }

    public Department addDepartement (Department d){
        return departmentRepository.save(d);
    }

    public   Department updateDepartement (Department d){
        return departmentRepository.save(d);
    }

    public  Department retrieveDepartement (Integer idDepart){
        return departmentRepository.findById(idDepart).get();
    }
    public  void deleteDepartement(Integer idDepartement){
        Department d=retrieveDepartement(idDepartement);
        departmentRepository.delete(d);
    }}
