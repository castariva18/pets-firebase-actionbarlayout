package com.example.android.pets;

public class Pet {
    private String name;
    private String breed;

    // Firebase Realtime Database needs empty constructor
    public Pet() { }

    public Pet(String name, String breed) {
        this.name = name;
        this.breed = breed;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public String getName() {
        return name;
    }

    public String getBreed() {
        return breed;
    }

    @Override
    public String toString() {
        return name + " - " + breed;
    }
}
