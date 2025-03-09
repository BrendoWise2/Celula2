package com.maquinaparada.maquinaparada.model.service;

import java.util.List;

import com.maquinaparada.maquinaparada.exception.CelulaSalvarException;
import com.maquinaparada.maquinaparada.model.domain.Celula;

public interface CelulaService {

    Celula salvar(Celula celula) throws CelulaSalvarException;
    void atualizar(Celula celula);
    void deletar(Celula celula);
    List<Celula> listar();
    void deletarTodos();

}
