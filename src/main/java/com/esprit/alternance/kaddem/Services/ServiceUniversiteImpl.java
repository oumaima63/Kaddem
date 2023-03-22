package com.esprit.alternance.kaddem.Services;


import com.esprit.alternance.kaddem.repositories.UniversiteRepository;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
@AllArgsConstructor
public class ServiceUniversiteImpl implements UniversiteService{
UniversiteRepository universiteRepository;
}
