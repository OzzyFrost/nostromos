package ru.ozzyfrost.nostromo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import ru.ozzyfrost.nostromo.entity.Rover;
import ru.ozzyfrost.nostromo.service.RoverService;

import java.util.List;

@RestController
public class RoverController {

    private RoverService roverService;

    @Autowired
    public RoverController(RoverService roverService) {
        this.roverService = roverService;
    }

    @RequestMapping(value = "/rover/all", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
//    @GetMapping(value = "/rover/all", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Rover> getAllRovers() {
        return roverService.getAllRovers();
    }
}
