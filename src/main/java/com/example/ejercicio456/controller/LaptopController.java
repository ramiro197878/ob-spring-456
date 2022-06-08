package com.example.ejercicio456.controller;

import com.example.ejercicio456.entities.Laptop;
import com.example.ejercicio456.repository.LaptopRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class LaptopController {

    private LaptopRepository laptopRepository;

    public LaptopController(LaptopRepository laptopRepository) {
        this.laptopRepository = laptopRepository;
    }


    @GetMapping("api/laptops")
    public List<Laptop> findAllLaptop() {
        return laptopRepository.findAll();
    }

    @PostMapping("api/laptops")
    public Laptop create(@RequestBody Laptop laptop){
        return laptopRepository.save(laptop);
    }

}
