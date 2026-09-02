package com.veterinaria.veterinaria.Entity;


import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "Veterinario")
@Data
public class Veterinario {

    private Long id;
    private String nombre;
    private String targetaProfesional;
    private String especialidad;
    private String correo;



}
