package com.blockbuster.gestordepeliculas.utileria;

import lombok.*;

import javax.annotation.Generated;
import javax.persistence.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Pelicula {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int IdPelicula;

    private String nombre;
    private int duracion;
    private String clasificacion;
    private String genero;

}
