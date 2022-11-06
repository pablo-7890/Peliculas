package co.edu.unisabana.peliculas.service;

import org.springframework.amqp.rabbit.annotation.EnableRabbit;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.stereotype.Service;


@EnableRabbit
@Service
public class Publicador {

    private RabbitTemplate rabbitTemplate;


    public Publicador(RabbitTemplate rabbitTemplate) {
        this.rabbitTemplate = rabbitTemplate;

    }
    public void publicarPelicula(Object pelicula){

        this.rabbitTemplate.convertAndSend("unisabana.peliculas.fanout","",pelicula);


    }
}
