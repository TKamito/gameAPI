package br.com.thiagocosta.gameAPI.repository;

import br.com.thiagocosta.gameAPI.model.Player;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface playerRepository extends MongoRepository <Player, String>{


}
