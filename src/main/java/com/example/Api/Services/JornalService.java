package com.example.Api.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Api.Models.JornalModel;
import com.example.Api.Repository.JornalRepository;

@Service
public class JornalService {
    
@Autowired
JornalRepository jornalRepository;


public void cadastrarJornal(JornalModel jornalModel) {
    jornalRepository.save(jornalModel);
}

public List<JornalModel> buscarJornais() {
    return (List<JornalModel>) jornalRepository.findAll();
}


}
