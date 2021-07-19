package com.juncture.backend.controllers;

import com.juncture.backend.models.Player;
import com.juncture.backend.models.request.CreatePlayerRequest;
import com.juncture.backend.models.request.UpdatePlayerRequest;
import com.juncture.backend.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@RestController
@RequestMapping("players")
public class UserController {


    @Autowired
    UserService userService;
    @GetMapping
    public ResponseEntity<List<Player>> getAllPlayers(){
        ResponseEntity<List<Player>> getAllPlayersResponse = userService.getAllUsers();
        return getAllPlayersResponse;
    }

    @GetMapping("/{playerId}")
    public ResponseEntity<Player> getPlayer(@PathVariable String playerId){
        ResponseEntity<Player> currentPlayerResponse = userService.getUserById(playerId);
        return currentPlayerResponse;
    }

    @PostMapping
    public ResponseEntity<String> createPlayer(@RequestBody CreatePlayerRequest createPlayerRequestData ){
       ResponseEntity<String> createdPlayerResponse = userService.createUser(createPlayerRequestData);
        return createdPlayerResponse;
    }
}
