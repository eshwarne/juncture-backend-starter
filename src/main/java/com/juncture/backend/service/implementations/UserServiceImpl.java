package com.juncture.backend.service.implementations;

import com.juncture.backend.common.UserUtils;
import com.juncture.backend.models.Player;
import com.juncture.backend.models.request.CreatePlayerRequest;
import com.juncture.backend.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class UserServiceImpl implements UserService {


    Map<String, Player> playersMap;
    UserUtils userUtils;
    public UserServiceImpl(){
        this.playersMap = new HashMap<>();
    }

    @Autowired
    public UserServiceImpl(UserUtils userUtils){
        this.playersMap = new HashMap<>();
        this.userUtils = userUtils;
    }

    @Override
    public ResponseEntity<String> createUser(CreatePlayerRequest createPlayerRequestData) {
        Player player = new Player();
        player.setDateOfBirth(createPlayerRequestData.getDateOfBirth());
        player.setName(createPlayerRequestData.getName());
        player.setId(UUID.randomUUID().toString());
        player.setReputation(1.0);
        playersMap.put(player.getId(), player);
        return new ResponseEntity<String>(HttpStatus.OK);
    }

    @Override
    public ResponseEntity<List<Player>> getAllUsers() {
        List<Player> players = new ArrayList<>();
        for(String playerId: playersMap.keySet()){
            players.add(playersMap.get(playerId));
        }
        return new ResponseEntity<List<Player>>(players, HttpStatus.OK);
    }

    @Override
    public ResponseEntity<Player> getUserById(String playerId) {
        if(playersMap.get(playerId) != null)
            return new ResponseEntity<Player>(playersMap.get(playerId),HttpStatus.OK);
        else
            return ResponseEntity.noContent().build();
    }
}
