package com.aurus.jeepneyclash.game_server.config.security;

import java.util.Collection;
import java.util.Collections;
import java.util.List;

import com.aurus.jeepneyclash.game_server.model.PlayerAuth;

import org.jspecify.annotations.Nullable;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

public class PlayerDetails implements UserDetails {

    private PlayerAuth playerAuth;

    public PlayerDetails(PlayerAuth playerAuth) {
        this.playerAuth = playerAuth;
    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return Collections.unmodifiableList(List.of(new SimpleGrantedAuthority("Player")));
    }

    @Override
    public @Nullable String getPassword() {
        return playerAuth.getPassword();
    }

    @Override
    public String getUsername() {
        return playerAuth.getUsername();
    }
}
