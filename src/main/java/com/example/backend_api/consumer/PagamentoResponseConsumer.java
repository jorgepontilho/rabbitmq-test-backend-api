package com.example.backend_api.consumer;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.messaging.Message;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Component;

@Component
public class PagamentoResponseConsumer {

    @RabbitListener(queues = {"pagamento-response-queue"})
    public void receive(@Payload Message message) {
        String payload = String.valueOf(message.getPayload());
        System.out.println(payload);
    }
}
