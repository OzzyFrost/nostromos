package ru.ozzyfrost.nostromo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import ru.ozzyfrost.nostromo.dto.Planet;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Service
public class RoverDiscoveryPlanet {

    @Autowired
    private RoverClient roverClient;

    @Autowired
    private RestTemplate restTemplate;


    public List<Planet> getDiscoveryListPlanet() {
        List<Planet> planetList = new ArrayList<>();
        final List<String> roverUrls = roverClient.getRoverUrls();
        for (String roverUrl : roverUrls) {
            planetList.add(restTemplate.getForObject(roverUrl + "/discover/planet", Planet.class));
        }
        return planetList;
    }

}
