package com.azold6.corejavastudies.assuntos.modelmapper.repository;

import com.azold6.corejavastudies.assuntos.modelmapper.domain.Disciplina;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DisciplinaRepository extends JpaRepository<Disciplina, Integer> {
}
