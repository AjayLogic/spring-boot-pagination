package pagination.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import pagination.entities.Country;

public interface CountryRepository extends JpaRepository<Country, Integer> {

}
