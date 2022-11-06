package co.edu.unisabana.peliculas.controller;

import co.edu.unisabana.peliculas.service.Publicador;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/pelicula")


public class PeliculaController {

    private Publicador publicador;

    public PeliculaController(Publicador publicador) {
        this.publicador = publicador;
    }

    @GetMapping("/publicar")
    public String publicar() {
        Pelicula mensaje = new Pelicula("Aquaman", "21-diciembre-2018", "Warne Bros");
        publicador.publicarPelicula(mensaje);
        return "pelicula publicada " + mensaje.getNombrePelicula();
    }
}
