package com.github.edualpendre.citiesapi.cities.repositories;

import com.github.edualpendre.citiesapi.cities.entities.City;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CityRepository extends JpaRepository<City, Long> {

}
