package com.maquinaparada.maquinaparada.model.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.maquinaparada.maquinaparada.exception.CelulaSalvarException;
import com.maquinaparada.maquinaparada.model.domain.Celula;
import com.maquinaparada.maquinaparada.model.repository.CelulaRepository;

@Service
public class CelulaServiceImpl implements CelulaService {

    @Autowired
    private CelulaRepository celulaRepository;

    @Override
    public Celula salvar(Celula celula) throws CelulaSalvarException {
        return celulaRepository.save(celula);
    }

    @Override
    public void atualizar(Celula celula) {
       celulaRepository.save(celula);
    }

    @Override
    public void deletar(Celula celula) {
        celulaRepository.delete(celula);
    }

    @Override
    public List<Celula> listar() {
        return celulaRepository.findAll();
    }
    
}
