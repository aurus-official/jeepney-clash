package com.aurus.jeepneyclash.game_server.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/v1/player")
public class PlayerController {

    @PostMapping(path = "/login")
    public void playerLogin() {
        System.out.println("PLAYER LOGIN");
    }
}
