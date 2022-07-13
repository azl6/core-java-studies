package com.azold6.corejavastudies;

import com.azold6.corejavastudies.assuntos.modelmapper.domain.Aluno;
import com.azold6.corejavastudies.assuntos.modelmapper.domain.Disciplina;
import com.azold6.corejavastudies.assuntos.modelmapper.repository.AlunoRepository;
import com.azold6.corejavastudies.assuntos.modelmapper.repository.DisciplinaRepository;
import lombok.AllArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import static com.fasterxml.jackson.databind.type.LogicalType.DateTime;

@AllArgsConstructor
@SpringBootApplication
public class CoreJavaStudiesApplication implements CommandLineRunner {

	AlunoRepository alunoRepository;
	DisciplinaRepository disciplinaRepository;

	public static void main(String[] args) {
		SpringApplication.run(CoreJavaStudiesApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		DateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
		String date1 = "22-01-2001";
		Date dataNascAlex = sdf.parse(date1);

		Disciplina disciplina1 = Disciplina.builder().id(1).sigla("SIN130").build();
		Disciplina disciplina2 = Disciplina.builder().id(2).sigla("COM220").build();

		disciplinaRepository.saveAll(List.of(disciplina1, disciplina2));

		alunoRepository.save(Aluno.builder()
						.nome("Alex")
						.n1(10d)
						.n2(5d)
						.n3(8d)
						.dataNasc(dataNascAlex)
						.disciplinas(List.of(disciplina1))
						.build());
	}
}
