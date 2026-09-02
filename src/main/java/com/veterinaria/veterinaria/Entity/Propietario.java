package com.veterinaria.veterinaria.Entity;


import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "Propietarios")
@Data
public class Propietario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank(message = "El nombre es obligatorio")
    private String nombre;

    @NotBlank(message = "El documento es obligatorio")
    @Column(unique = true)
    private String documento;

    @NotBlank(message = "El teléfono es obligatorio")
    private String telefono;

    @Email(message = "El correo no es válido")
    @NotBlank(message = "El correo es obligatorio")
    private String correo;

    // Un propietario puede tener muchas mascotas
    @OneToMany(mappedBy = "propietario", cascade = CascadeType.ALL, orphanRemoval = true)
    @JsonIgnore
    private List<Mascota> mascotas = new ArrayList<>();


}
