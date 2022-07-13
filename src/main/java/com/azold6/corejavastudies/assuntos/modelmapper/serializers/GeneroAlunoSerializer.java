package com.azold6.corejavastudies.assuntos.modelmapper.serializers;

import com.azold6.corejavastudies.assuntos.modelmapper.domain.GeneroAluno;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;

import java.io.IOException;

public class GeneroAlunoSerializer extends JsonSerializer<GeneroAluno> {

    @Override
    public void serialize(GeneroAluno generoAluno,
                          JsonGenerator jsonGenerator,
                          SerializerProvider serializerProvider)
            throws IOException, JsonProcessingException {
        jsonGenerator.writeObject(generoAluno.getDescricao());
    }
}
