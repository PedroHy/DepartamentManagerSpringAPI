package com.desafio.departamentapi.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.desafio.departamentapi.models.Colaborator;
import com.desafio.departamentapi.repositories.ColaboratorRepository;

@RestController
@RequestMapping("/colaborator")
public class ColaboratorController {
    @Autowired
    private ColaboratorRepository repo;

    @GetMapping
    public Optional<Colaborator> getById(@RequestParam long id) {
        return repo.findById(id);
    }

    @GetMapping("departament")
    public List<Colaborator> getByDepartamentId(@RequestParam long departamentId) {
        return repo.findByDepartamentId(departamentId);
    }

    @PostMapping
    public void create(@RequestBody Colaborator colaborator){
        repo.save(colaborator);
    }

    @PutMapping
    public void update(@RequestBody Colaborator colaborator){
        if(colaborator.getId() > 0) repo.save(colaborator);
    }

    @DeleteMapping
    public void delete(@RequestParam Long id){
        repo.deleteById(id);
    }
}
