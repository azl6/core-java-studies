package com.azold6.corejavastudies.domain.serializers;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;

import java.io.IOException;

/*
    JsonSerializer para converter:
        10000 para 10 MIL
        100000 para 100 MIL
        1000000 para 1 MILHÃO
 */
public class PrecoSerializer extends JsonSerializer<Double> {
    @Override
    public void serialize(Double aDouble, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) throws IOException {
        String str = String.valueOf(aDouble);
        str = str.replace(".0", "");

        if (str.length() == 5){
            jsonGenerator.writeObject(str.substring(0, 2) + " MIL");
        }else if(str.length() == 6){
            jsonGenerator.writeObject(str.substring(0, 3) + " MIL");
        }else if(str.length() == 7){
            jsonGenerator.writeObject(str.substring(0, 1) + " MILHÃO");
        }
    }
}
