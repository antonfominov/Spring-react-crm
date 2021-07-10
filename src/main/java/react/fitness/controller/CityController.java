package react.fitness.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import react.fitness.entity.City;
import react.fitness.repository.CityRepository;

@RestController
public class CityController {
	
@Autowired
private CityRepository cityRepository;	

	@CrossOrigin(origins = "http://localhost:8080")
	@GetMapping ("/api/cities")
		public Iterable<City> getAll(){
			return cityRepository.findAll();
		}
}
