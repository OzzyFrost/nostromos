package ru.ozzyfrost.rover.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import ru.ozzyfrost.rover.dto.Planet;
import ru.ozzyfrost.rover.service.PlanetDiscoverService;

import static org.springframework.util.MimeTypeUtils.APPLICATION_JSON_VALUE;
import static org.springframework.util.MimeTypeUtils.TEXT_PLAIN_VALUE;

@RestController
@Slf4j
public class DiscoveryController {

    private final PlanetDiscoverService planetDiscoverService;

    public DiscoveryController(PlanetDiscoverService planetDiscoverService) {
        this.planetDiscoverService = planetDiscoverService;
    }


    @RequestMapping(value = "/discover/planet",method = RequestMethod.GET, produces = APPLICATION_JSON_VALUE)
    public Planet discoverPlanet() {
        log.info("rover GET /discover/planet");
        return planetDiscoverService.getPlanetForDiscovery();
    }
}
