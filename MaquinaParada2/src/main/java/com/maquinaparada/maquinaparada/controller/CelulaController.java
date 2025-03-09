package com.maquinaparada.maquinaparada.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.maquinaparada.maquinaparada.exception.CelulaSalvarException;
import com.maquinaparada.maquinaparada.model.domain.Celula;
import com.maquinaparada.maquinaparada.model.repository.CelulaRepository;
import com.maquinaparada.maquinaparada.model.service.CelulaService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;



@RestController

@RequestMapping("/celula")
public class CelulaController {

    @Autowired
    private CelulaService celulaService;
    
    @Autowired
    private CelulaRepository celulaRepository;

    @PostMapping("/salvar")
    public Celula salvar(@RequestBody Celula celula)
         throws CelulaSalvarException{
        return celulaService.salvar(celula);
    }

    @GetMapping("/mostrar")
    public List<Celula> listar() {
        return celulaRepository.findAll();
    }
    
}
