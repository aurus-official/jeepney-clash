package com.aurus.jeepneyclash.game_server.repository;

import com.aurus.jeepneyclash.game_server.model.PlayerStats;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PlayerStatsRepository extends CrudRepository<PlayerStats, Long> {
}
