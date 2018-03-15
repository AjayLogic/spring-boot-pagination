package pagination;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import pagination.entities.Country;
import pagination.repositories.CountryRepository;

@SpringBootApplication
public class SpringPaginationApplication implements CommandLineRunner {

	@Autowired
	private CountryRepository countryRepository;
	
	public static void main(String[] args) {
		SpringApplication.run(SpringPaginationApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		countryRepository.save(new Country("Earth", "World"));
		countryRepository.save(new Country("China", "Bejing"));
		countryRepository.save(new Country("Germany", "Berlin"));
		countryRepository.save(new Country("USA", "Washington DC"));
		countryRepository.save(new Country("Russia", "Moscow"));
		countryRepository.save(new Country("India", "New Delhi"));
		countryRepository.save(new Country("Kenya", "Nairobi"));
		countryRepository.save(new Country("Canada", "Ottawa"));
		countryRepository.save(new Country("Brazil", "Brasilia"));
		countryRepository.save(new Country("Belgium", "Brussel"));
		countryRepository.save(new Country("Philippines", "Manila"));
		countryRepository.save(new Country("Japan", "Tokio"));
		countryRepository.save(new Country("Egypt", "Kairo"));
		countryRepository.save(new Country("Jamaica", "Kingston"));
		countryRepository.save(new Country("Israel", "Jerusalem"));
		countryRepository.save(new Country("Poland", "Warsaw"));
		
	}
}













