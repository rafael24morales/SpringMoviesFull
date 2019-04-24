package com.blockbuster.gestordepeliculas.repository;

import com.blockbuster.gestordepeliculas.utileria.Pelicula;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IPeliculaRepository extends JpaRepository<Pelicula, Integer> {
}
