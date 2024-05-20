package com.desafio.departamentapi.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.desafio.departamentapi.models.Colaborator;

public interface ColaboratorRepository extends JpaRepository<Colaborator, Long>{
    List<Colaborator> findByDepartamentId(long departamentId);
}
