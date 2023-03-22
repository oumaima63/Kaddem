package com.esprit.alternance.kaddem.Services;

import com.esprit.alternance.kaddem.entities.Department;

import java.util.List;

public interface DepartmentService {
    public List<Department> retrieveAllDepartements();

    public Department addDepartement (Department d);

    public   Department updateDepartement (Department d);

    public  Department retrieveDepartement (Integer idDepart);

    public  void deleteDepartement(Integer idDepartement);
}
