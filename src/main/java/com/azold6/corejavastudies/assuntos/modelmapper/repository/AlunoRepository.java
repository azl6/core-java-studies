package com.azold6.corejavastudies.assuntos.modelmapper.repository;

import com.azold6.corejavastudies.assuntos.modelmapper.domain.Aluno;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AlunoRepository extends JpaRepository<Aluno, Integer> {
}
