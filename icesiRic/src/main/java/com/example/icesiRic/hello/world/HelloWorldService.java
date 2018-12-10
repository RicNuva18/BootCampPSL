package com.example.icesiRic.hello.world;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.net.URI;

@Service
public class HelloWorldService {

    private static final String URL = "https://free.currencyconverterapi.com/api/v5/converter?q=USD_COP&compact=y";


    private RestTemplate restTemplate = new RestTemplate();

    public HelloWorldDto getDtoWithTRM(String greeting){
        return new HelloWorldDto(greeting, 1L, getTRM());
    }

    private double getTRM() {
        try {
            TrmDto trm = restTemplate.getForEntity(new URI(URL),TrmDto.class).getBody();
            return trm.getUSD_COP();

        } catch (Exception e) {
            e.printStackTrace();

        }
        return 0.0;
    }

}
