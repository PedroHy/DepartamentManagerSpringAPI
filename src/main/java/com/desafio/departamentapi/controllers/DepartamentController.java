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

import com.desafio.departamentapi.models.Departament;
import com.desafio.departamentapi.repositories.DepartamentRepository;

@RestController
@RequestMapping("/departament")
public class DepartamentController {
    
    @Autowired
    private DepartamentRepository repo;

    @GetMapping
    public Optional<Departament> getById(@RequestParam long id){
        return repo.findById(id);
    }

    @GetMapping("/all")
    public List<Departament> getAll(){
        return repo.findAll();
    }

    @PostMapping
    public void create(@RequestBody Departament departament){
        repo.save(departament);
    }

    @PutMapping
    public void update(@RequestBody Departament departament){
        repo.save(departament);
    }

    @DeleteMapping
    public void delete(@RequestParam long id){
        repo.deleteById(id);
    }
}
