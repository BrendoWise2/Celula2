package com.maquinaparada.maquinaparada.model.domain;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

import org.springframework.format.annotation.DateTimeFormat;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "celulas")
public class Celula {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    public String operatorName;
    public String celulaSelecionada;
    public LocalTime startHour;
    public LocalTime endHour;
    public LocalTime totalTime;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    public LocalDate startDate;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    public LocalDate endDate;

}
