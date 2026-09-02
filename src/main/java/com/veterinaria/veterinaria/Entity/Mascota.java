package com.veterinaria.veterinaria.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "Mascota")
@Data
public class Mascota {

    private Long id;
    private String nombre;
    private String especie;
    private String raza;
    private Integer edad;
    private double peso;
}
