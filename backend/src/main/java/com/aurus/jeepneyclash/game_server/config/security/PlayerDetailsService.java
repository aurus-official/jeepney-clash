package com.aurus.jeepneyclash.game_server.config.security;

import java.util.Optional;

import com.aurus.jeepneyclash.game_server.model.PlayerAuth;
import com.aurus.jeepneyclash.game_server.repository.PlayerAuthRepository;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

public class PlayerDetailsService implements UserDetailsService {

    private PlayerAuthRepository playerAuthRepository;

    PlayerDetailsService(PlayerAuthRepository playerAuthRepository) {
        this.playerAuthRepository = playerAuthRepository;
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Optional<PlayerAuth> playerAuth = playerAuthRepository.getPlayerByUsername(username);

        if (playerAuth.isPresent()) {
            return new PlayerDetails(playerAuth.get());
        }

        throw new UsernameNotFoundException("Username didn't match to existing players.");
    }
}
