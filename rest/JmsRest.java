package com.dagama.cine.rest;

import com.dagama.cine.entidades.Reserva;
import com.dagama.cine.jms.JmsProducer;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "http://localhost:63342")
@RequestMapping("/api/reserva")
public class JmsRest {
    @Autowired
    private JmsProducer jmsProducer;

    @PostMapping("/enviar")
    public Reserva enviar(@RequestBody Reserva reserva) {
        ObjectMapper mapper = new ObjectMapper();
        //Object a JSON en String
        String jsonString=null;
        try {
            jsonString = mapper.writeValueAsString(reserva);
            //se envía a la cola en String
            jmsProducer.enviar(jsonString);
            reserva.setRespuesta("Reserva enviada a cola");
        } catch (JsonProcessingException e) {
            e.printStackTrace();
            reserva.setRespuesta("Error en trama, no se envía!");
        }
        return reserva;
    }
}
