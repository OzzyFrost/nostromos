package ru.ozzyfrost.nostromo.entity.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.ozzyfrost.nostromo.entity.Rover;

public interface RoverRepository extends JpaRepository<Rover,Long> {
}
