package com.azold6.corejavastudies.domain.repository;

import com.azold6.corejavastudies.domain.Carro;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CarroRepository extends JpaRepository<Carro, Integer> {
}
