package ru.ozzyfrost.rover.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import static org.springframework.util.MimeTypeUtils.TEXT_PLAIN_VALUE;

@RestController
public class HealthController {
    @GetMapping(value = "/isAlive", produces = TEXT_PLAIN_VALUE)
    public String isAlive() {
        return "Hello, Rover is alive";
    }
}
