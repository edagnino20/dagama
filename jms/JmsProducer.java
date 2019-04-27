package com.dagama.cine.jms;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.stereotype.Component;

import java.util.UUID;

@Component
public class JmsProducer {

    @Autowired
    private JmsTemplate jmsTemplate;

    @Value("${jms.cola.envio}")
    String destinationQueue;

    @Value("${jms.cola.respuesta}")
    String responseQueue;

    public void enviar(String msg) {
        //jmsTemplate.convertAndSend(destinationQueue, (msg));
        String id = UUID.randomUUID().toString();
        jmsTemplate.convertAndSend(destinationQueue, msg, m -> {
            m.setJMSCorrelationID(id);
            return m;
        });
        System.out.println("Enviando " + msg);
        System.out.println("Enviando con CorrId: " + id);
        //espera respuesta solo de un mensaje cuyo corrId es el mismo del que envió
        //jmsTemplate.setReceiveTimeout(1000);
        String responseMessage = (String) jmsTemplate
                .receiveSelectedAndConvert(responseQueue,
                        "JMSCorrelationID='" + id + "'");
        System.out.println("RESPUESTA:" + responseMessage);
        System.out.println("RESPUESTA CORR ID:" + id);
    }
}
