package com.example.Api.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.Api.Models.JornalModel;
import com.example.Api.Services.JornalService;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/Jornais")
public class JornalController {
    

 @Autowired
    JornalService jornalService;

    @PostMapping
    public void cadastrarCliente(@RequestBody JornalModel jornalModel) {
        jornalService.cadastrarJornal(jornalModel);

    }

    @GetMapping
    public List<JornalModel> buscarJornais() {
        return jornalService.buscarJornais();
    }


}
