package com.example.mongo_atlas_planets_crud_api.repository;

import com.example.mongo_atlas_planets_crud_api.model.PlanetItem;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import java.util.List;

public interface ItemRepository extends MongoRepository<PlanetItem, String> {

}
