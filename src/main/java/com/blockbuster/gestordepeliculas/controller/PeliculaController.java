package com.blockbuster.gestordepeliculas.controller;

import com.blockbuster.gestordepeliculas.services.PeliculaDao;
import com.blockbuster.gestordepeliculas.utileria.Pelicula;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


import java.util.List;

@RestController
public class PeliculaController {

    @Autowired
    PeliculaDao peliculaDao;

    @GetMapping("/pelicula")
    public List<Pelicula> getAllPelicula(){
        return peliculaDao.encuentraTodo();
    }

    @PostMapping("/pelicula")
    public boolean postPelicula(@RequestBody Pelicula pelicula){
        return peliculaDao.postPelicula(pelicula);
    }
}
