package com.desafio.departamentapi.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.desafio.departamentapi.models.Departament;

public interface DepartamentRepository extends JpaRepository<Departament, Long>{
}
