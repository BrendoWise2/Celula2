package com.maquinaparada.maquinaparada.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.maquinaparada.maquinaparada.model.domain.Celula;

public interface CelulaRepository extends JpaRepository<Celula, Long> {

}
