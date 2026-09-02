package com.veterinaria.veterinaria.Entity;


import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Data;

import java.time.LocalDate;

@Entity
@Table(name = "Historia Clinica")
@Data
public class HistoriaClinica {

    private Long id;
    private LocalDate fechaApertura;
    private String antecedentes;
    private String observaciones;


}
