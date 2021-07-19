package com.juncture.backend.models.request;

public class UpdatePlayerRequest {
    private String playerId;
    private String playerName;
    private String dateOfBirth;
    private double reputation;

    public UpdatePlayerRequest() {
    }

    public UpdatePlayerRequest(String playerId, String playerName, String dateOfBirth, double reputation) {
        this.playerId = playerId;
        this.playerName = playerName;
        this.dateOfBirth = dateOfBirth;
        this.reputation = reputation;
    }

    public String getPlayerId() {
        return playerId;
    }

    public void setPlayerId(String playerId) {
        this.playerId = playerId;
    }

    public String getPlayerName() {
        return playerName;
    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public double getReputation() {
        return reputation;
    }

    public void setReputation(double reputation) {
        this.reputation = reputation;
    }
}
