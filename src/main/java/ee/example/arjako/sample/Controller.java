package ee.example.arjako.sample;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin
@RestController
public class Controller {

    @GetMapping(value = "/", produces = "text/plain")
    public String index() {
        return "Greetings from Spring Boot!";
    }

}
