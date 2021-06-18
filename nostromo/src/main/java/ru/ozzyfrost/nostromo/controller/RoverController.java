package ru.ozzyfrost.nostromo.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import ru.ozzyfrost.nostromo.dto.Planet;
import ru.ozzyfrost.nostromo.entity.Rover;
import ru.ozzyfrost.nostromo.service.RoverClient;
import ru.ozzyfrost.nostromo.service.RoverDiscoveryPlanet;
import ru.ozzyfrost.nostromo.service.RoverService;

import java.util.List;

import static org.springframework.util.MimeTypeUtils.APPLICATION_JSON_VALUE;

@RestController
@Slf4j
public class RoverController {
    @Autowired
    private RoverService roverService;

    @Autowired
    private RoverClient roverClient;

    @Autowired
    private RoverDiscoveryPlanet roverDiscovery;

    @RequestMapping(value = "/rover/all", method = RequestMethod.GET, produces = APPLICATION_JSON_VALUE)
//    @GetMapping(value = "/rover/all", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Rover> getAllRovers() {
        return roverService.getAllRovers();
    }

    @RequestMapping(value = "/rover/discover", method = RequestMethod.GET, produces = APPLICATION_JSON_VALUE)
    public List<Planet> discoveryPlanet() {
        log.info("nostromo GET /rover/discover");
        return roverDiscovery.getDiscoveryListPlanet();
    }
}
