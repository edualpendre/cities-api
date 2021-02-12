package com.github.edualpendre.citiesapi.countries.repositories;

import com.github.edualpendre.citiesapi.countries.entities.Country;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CountryRepositroy extends JpaRepository<Country, Long> {

}
