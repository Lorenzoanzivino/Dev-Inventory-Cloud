package com.catalog.developercollectionservice.client;

import feign.Response;
import feign.codec.ErrorDecoder;
import org.springframework.stereotype.Component;

@Component
public class CustomFeignErrorDecoder implements ErrorDecoder {

    private final ErrorDecoder defaultErrorDecoder = new Default();

    @Override
    public Exception decode(String methodKey, Response response) {
        if (response.status() == 404) {
            return new RuntimeException("Risorsa non trovata nel catalogo remoto (404)");
        }
        if (response.status() >= 400 && response.status() <= 499) {
            return new RuntimeException("Errore client durante la chiamata al catalogo (Status: " + response.status() + ")");
        }
        if (response.status() >= 500 && response.status() <= 599) {
            return new RuntimeException("Errore interno del servizio catalogo (Status: " + response.status() + ")");
        }

        return defaultErrorDecoder.decode(methodKey, response);
    }
}