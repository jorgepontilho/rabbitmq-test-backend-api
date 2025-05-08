package com.example.backend_api.facade;

import com.example.backend_api.dto.PagamentoDTO;
import com.example.backend_api.producer.PagamentoRequestProducer;
import com.fasterxml.jackson.core.JsonProcessingException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PagamentoFacade {
    @Autowired
    private PagamentoRequestProducer producer;

    public String solicitarPagamento(PagamentoDTO request) {
        try {
            producer.integrar(request);
        } catch (JsonProcessingException e) {
            return "Ocorreu um erro ao solicitar pagamento .. " + e.getMessage();
        }
        System.out.println("Pagamento enviado com sucesso..." + request.getNumeroPedido());
        return "Pagamento enviado com sucesso... "+ request.getNumeroPedido();
    }
}