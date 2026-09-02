package com.veterinaria.veterinaria.Entity;


import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Entity
@Table(name = "Propietarios")
@Data
public class Propietario {

@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @NotBlank
    @Size(min = 2,max = 20)
    @Column(name = "nombre", nullable = false)
    private String nombre;

    private String documento;
    private String telefono;
    private String correo;




}
