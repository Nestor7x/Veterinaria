package com.veterinaria.veterinaria.Entity;


import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;

import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "Veterinario")
@Data
public class Veterinario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank(message = "El nombre es obligatorio")
    private String nombre;

    @NotBlank(message = "La tarjeta profesional es obligatoria")
    @Column(unique = true)
    private String tarjetaProfesional;

    @NotBlank(message = "La especialidad es obligatoria")
    private String especialidad;

    @Email(message = "El correo no es válido")
    @NotBlank(message = "El correo es obligatorio")
    private String correo;

    // Un veterinario puede atender varias mascotas (lado inverso de la relación)
    @ManyToMany(mappedBy = "veterinarios")
    @JsonIgnore
    private Set<Mascota> mascotas = new HashSet<>();

}
