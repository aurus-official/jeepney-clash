package com.aurus.jeepneyclash.game_server.repository;

import java.util.Optional;

import com.aurus.jeepneyclash.game_server.model.PlayerAuth;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PlayerAuthRepository extends CrudRepository<PlayerAuth, Long> {

    @Query("SELECT p_auth FROM player_auth p_auth WHERE (p_auth.username = ?1)")
    public Optional<PlayerAuth> getPlayerByUsername(String username);

}
