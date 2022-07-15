package com.azold6.corejavastudies.assuntos.modelmapper.mappers;

import com.azold6.corejavastudies.assuntos.modelmapper.domain.GeneroAluno;
import org.modelmapper.AbstractConverter;
import org.modelmapper.Converter;

import java.time.LocalDate;
import java.time.Period;
import java.time.ZoneId;
import java.util.Date;

/*
    BaseMapper. Toda classe que necessita de um mapper deve extender dela, como boa prática.
 */
public abstract class BaseMapper {

    /*
        Exemplo de converter.
     */
    protected Converter<Date, Integer> idadeConverter(){
        return new AbstractConverter<Date, Integer>() {
            @Override
            protected Integer convert(Date date) {
                return Period.between(date.toInstant()
                        .atZone(ZoneId.systemDefault())
                        .toLocalDate(), LocalDate.now()).getYears();
            }
        };
    }

    protected Converter<GeneroAluno, String> generoConverter(){
        return new AbstractConverter<GeneroAluno, String>() {
            @Override
            protected String convert(GeneroAluno generoAluno) {
                return generoAluno.getDescricao();
            }
        };
    }
}
