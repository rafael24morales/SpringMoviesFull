package com.blockbuster.gestordepeliculas.services;

import com.blockbuster.gestordepeliculas.repository.IPeliculaRepository;
import com.blockbuster.gestordepeliculas.utileria.Pelicula;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PeliculaDao {

    @Autowired
    IPeliculaRepository iPeliculaRepository;

    public List<Pelicula> encuentraTodo(){
        return iPeliculaRepository.findAll();
    }
}
