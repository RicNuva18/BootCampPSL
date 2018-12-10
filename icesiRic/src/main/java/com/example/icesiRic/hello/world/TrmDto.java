package com.example.icesiRic.hello.world;

import com.fasterxml.jackson.annotation.JsonProperty;

public class TrmDto {

    @JsonProperty("USD_COP")
    private double USD_COP;

    public double getUSD_COP() {
        return USD_COP;
    }

    public void setUSD_COP(double USD_COP) {
        this.USD_COP = USD_COP;
    }

    public TrmDto(double USD_COP) {
        this.USD_COP = USD_COP;
    }
}
