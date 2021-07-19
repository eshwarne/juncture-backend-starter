package com.juncture.backend.models;

public class Player {
    private String name;
    private String id;
    private double reputation;
    private String dateOfBirth;

    public Player() {
    }

    public Player(String name, String id, double reputation, String dateOfBirth) {
        this.name = name;
        this.id = id;
        this.reputation = reputation;
        this.dateOfBirth = dateOfBirth;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public double getReputation() {
        return reputation;
    }

    public void setReputation(double reputation) {
        this.reputation = reputation;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }
}
