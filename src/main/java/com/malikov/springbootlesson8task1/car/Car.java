package com.malikov.springbootlesson8task1.car;

public class Car {
    private String id;
    private String name;
    private String model;

    public Car() {
    }

    public Car(String id, String name, String model) {
        this.id = id;
        this.name = name;
        this.model = model;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
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
