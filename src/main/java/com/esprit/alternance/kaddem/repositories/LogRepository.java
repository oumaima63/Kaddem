package com.esprit.alternance.kaddem.repositories;

import com.esprit.alternance.kaddem.entities.Log;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LogRepository extends CrudRepository<Log,Integer> {



}