package br.com.thiagocosta.gameAPI.controller;

import br.com.thiagocosta.gameAPI.model.Player;
import br.com.thiagocosta.gameAPI.repository.playerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class playerController {

    @Autowired
    playerRepository PlayerRepository;

    @GetMapping(value = "/")
    public List<Player> findAll(){
        return PlayerRepository.findAll();

    }

    @PostMapping(value = "/")
    public void valvar(@RequestBody Player player){
        PlayerRepository.save(player);
    }

}
