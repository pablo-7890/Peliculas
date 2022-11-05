package co.edu.unisabana.peliculas.service;

import org.springframework.stereotype.Service;
import org.springframework.amqp.core.Queue;
import org.springframework.amqp.rabbit.annotation.EnableRabbit;
import org.springframework.amqp.rabbit.core.RabbitTemplate;


@EnableRabbit
@Service
public class Publicador {

    private RabbitTemplate rabbitTemplate;
    private Queue queue;

    public Publicador(RabbitTemplate rabbitTemplate, Queue queue) {
        this.rabbitTemplate = rabbitTemplate;
        this.queue = queue;
    }

    public void enviarMensaje(Object mensaje) {

        rabbitTemplate.convertAndSend(queue.getName(), mensaje);
    }
/*
    public void enviarMensaje2(Object mensaje) {
        rabbitTemplate.convertAndSend("unisabana.test.direct", "admin", mensaje);
    }

    public void enviarMensajeTopico(Object mensaje) {
        rabbitTemplate.convertAndSend("unisabana.pagos.topic", "unisabana.pagos.*", mensaje);
    }
*/
}
