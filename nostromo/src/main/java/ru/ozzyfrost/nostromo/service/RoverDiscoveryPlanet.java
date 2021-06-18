package ru.ozzyfrost.nostromo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.ozzyfrost.nostromo.dto.Planet;

import java.util.Collections;
import java.util.List;

@Service
public class RoverDiscoveryPlanet {

    @Autowired
    private RoverClient roverClient;

    public List<Planet> getDiscoveryListPlanet() {
        return Collections.emptyList();
    }
}
