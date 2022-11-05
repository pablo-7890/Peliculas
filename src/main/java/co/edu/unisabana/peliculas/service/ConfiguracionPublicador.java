package co.edu.unisabana.peliculas.service;

import org.springframework.amqp.core.Queue;
import org.springframework.context.annotation.Bean;

public class ConfiguracionPublicador {


    @Bean
    public Queue queue(){
        return new Queue("unisabana.peliculas.notificar", true);
    }
}