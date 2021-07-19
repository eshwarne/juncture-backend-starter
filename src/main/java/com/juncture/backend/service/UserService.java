package com.juncture.backend.service;

import com.juncture.backend.models.Player;
import com.juncture.backend.models.request.CreatePlayerRequest;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface UserService {
    ResponseEntity<String> createUser(CreatePlayerRequest createPlayerRequestData);
    ResponseEntity<List<Player>> getAllUsers();
    ResponseEntity<Player> getUserById(String playerId);
}
