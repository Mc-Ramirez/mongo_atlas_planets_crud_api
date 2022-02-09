package com.example.mongo_atlas_planets_crud_api;


import com.example.mongo_atlas_planets_crud_api.model.PlanetItem;
import com.example.mongo_atlas_planets_crud_api.repository.ItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ItemPlanetController {

    @Autowired
    private ItemRepository repository;

    @PostMapping("/addPlanet")
    public String saveEmployee(@RequestBody PlanetItem planetItem){
        repository.save(planetItem);
        return "Added Employe with id: " + planetItem.getPlanetName();
    }

    @GetMapping("/findAllEmployees")
    public List<PlanetItem> getAllPlanetsListed(){
        return repository.findAll();
    }

}
