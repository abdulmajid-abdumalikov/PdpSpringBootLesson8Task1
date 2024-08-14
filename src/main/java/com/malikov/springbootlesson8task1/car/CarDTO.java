package com.malikov.springbootlesson8task1.car;

public class CarDTO {
    private String name;
    private String model;

    public CarDTO() {
    }

    public CarDTO(String name, String model) {
        this.name = name;
        this.model = model;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }
}
