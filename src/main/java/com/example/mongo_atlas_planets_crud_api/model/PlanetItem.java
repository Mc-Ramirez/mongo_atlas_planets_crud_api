package com.example.mongo_atlas_planets_crud_api.model;


import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document("PlanetsCollection")
public class PlanetItem {

    @Id
    private String id;

    private String planetName;
    private int planetDistanceMio;
    private int planetEquatorialRadius;
    private int planetRotationPeriod;
    private long planetMassKg;
    private int planetDensity;
    private String category;
    private String planetUrlImage;

    public PlanetItem(String id, String planetName, int planetDistanceMio, int planetEquatorialRadius, int planetRotationPeriod, long planetMassKg, int planetDensity, String category, String planetUrlImage) {
        this.id = id;
        this.planetName = planetName;
        this.planetDistanceMio = planetDistanceMio;
        this.planetEquatorialRadius = planetEquatorialRadius;
        this.planetRotationPeriod = planetRotationPeriod;
        this.planetMassKg = planetMassKg;
        this.planetDensity = planetDensity;
        this.category = category;
        this.planetUrlImage = planetUrlImage;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPlanetName() {
        return planetName;
    }

    public void setPlanetName(String planetName) {
        this.planetName = planetName;
    }

    public int getPlanetDistanceMio() {
        return planetDistanceMio;
    }

    public void setPlanetDistanceMio(int planetDistanceMio) {
        this.planetDistanceMio = planetDistanceMio;
    }

    public int getPlanetEquatorialRadius() {
        return planetEquatorialRadius;
    }

    public void setPlanetEquatorialRadius(int planetEquatorialRadius) {
        this.planetEquatorialRadius = planetEquatorialRadius;
    }

    public int getPlanetRotationPeriod() {
        return planetRotationPeriod;
    }

    public void setPlanetRotationPeriod(int planetRotationPeriod) {
        this.planetRotationPeriod = planetRotationPeriod;
    }

    public long getPlanetMassKg() {
        return planetMassKg;
    }

    public void setPlanetMassKg(long planetMassKg) {
        this.planetMassKg = planetMassKg;
    }

    public int getPlanetDensity() {
        return planetDensity;
    }

    public void setPlanetDensity(int planetDensity) {
        this.planetDensity = planetDensity;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getPlanetUrlImage() {
        return planetUrlImage;
    }

    public void setPlanetUrlImage(String planetUrlImage) {
        this.planetUrlImage = planetUrlImage;
    }
}
