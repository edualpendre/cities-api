package com.github.edualpendre.citiesapi.staties.repositories;

import com.github.edualpendre.citiesapi.staties.entities.State;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StateRepository extends JpaRepository<State, Long> {
}
