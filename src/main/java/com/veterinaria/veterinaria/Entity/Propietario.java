package com.veterinaria.veterinaria.Entity;


import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Entity
@Table(name = "Propietarios")
@Data
public class Propietario {

@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String nombre;
    private String documento;
    private String telefono;
    private String correo;




}
