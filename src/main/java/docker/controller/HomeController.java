package docker.controller;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
public class HomeController {


	@GetMapping("/home")
	public String home() {
		log.info("Inside home controller!!!!!!!!!");
		return "Home Controller!!!!!!!!!";
	}

	@GetMapping("/exception/{id}")
	public String exceptionOnCall(@PathVariable String id) {
		if (id == "5") {
			throw new ResponseStatusException(HttpStatus.INTERNAL_SERVER_ERROR,
					"Home controller exception returned!!!!!!!");
		} else {
			return "ID is : " + id;
		}
	}


}
