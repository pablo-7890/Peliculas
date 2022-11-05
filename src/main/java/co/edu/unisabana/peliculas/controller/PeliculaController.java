package co.edu.unisabana.peliculas.controller;

import co.edu.unisabana.peliculas.service.Publicador;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("api/")


public class PeliculaController {

    @Value("${propiedad1}")
    private String valor;

    private Publicador publicador;

    public PeliculaController(Publicador publicador) {
        this.publicador = publicador;
    }

    @PostMapping("/pay")
    public String pagar() {
        Pelicula mensaje = new Pelicula("Aquaman", "21-diciembre-2018", "Warne Bros");
        publicador.enviarMensaje("Estoy añadiendo una pelicula");
        return "Hola Mundo VOLVI MAS FUERTE " + valor;
    }
}
