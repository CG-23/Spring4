package cat.itacademy.barcelonactiva.cognoms.nom.s04.t01.n01.S04T01N01CarlosGimeno;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class S04T01N01CarlosGimenoApplication {

	public static void main(String[] args) {
		SpringApplication.run(S04T01N01CarlosGimenoApplication.class, args);
	}
	
	@GetMapping("/HelloWorld")
	public static String StringSaluda(@RequestParam(value ="nom", defaultValue = "UNKNOWN")String nom){
		return "Hola "+nom+". Estàs executant un projecte Maven.";
	}
	
	@GetMapping({"/HelloWorld2", "/HelloWorld2/{nom}"})
	public static String StringSaluda2(@PathVariable (required = false) String nom){
		if (nom != null) {
			return "Hola "+nom+". Estàs executant un projecte Maven.";
	    } else {
	        return "No hi ha nom";
	    }
	}

}
