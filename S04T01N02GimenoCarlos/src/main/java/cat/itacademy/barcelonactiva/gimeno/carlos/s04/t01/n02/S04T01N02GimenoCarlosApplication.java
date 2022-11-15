package cat.itacademy.barcelonactiva.gimeno.carlos.s04.t01.n02;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class S04T01N02GimenoCarlosApplication {

	public static void main(String[] args) {
		SpringApplication.run(S04T01N02GimenoCarlosApplication.class, args);
	}
	@GetMapping("/HelloWorld")
	public static String StringSaluda(@RequestParam(value ="nom", defaultValue = "UNKNOWN")String nom){
		return "Hola "+nom+". Estàs executant un projecte Grable.";
	}
	
	@GetMapping({"/HelloWorld2", "/HelloWorld2/{nom}"})
	public static String StringSaluda2(@PathVariable (required = false) String nom){
		if (nom != null) {
			return "Hola "+nom+". Estàs executant un projecte Grable.";
	    } else {
	        return "No hi ha nom";
	    }
	}

}
