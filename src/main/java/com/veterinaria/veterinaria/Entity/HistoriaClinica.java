package com.veterinaria.veterinaria.Entity;


import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

import java.time.LocalDate;

@Entity
@Table(name = "Historia Clinica")
@Data
public class HistoriaClinica {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull(message = "La fecha de apertura es obligatoria")
    private LocalDate fechaApertura;

    @NotBlank(message = "Los antecedentes son obligatorios")
    @Column(length = 2000)
    private String antecedentes;

    @Column(length = 2000)
    private String observaciones;

    // Una historia clínica pertenece a una sola mascota
    @OneToOne
    @JoinColumn(name = "mascota_id", nullable = false, unique = true)
    private Mascota mascota;


}
