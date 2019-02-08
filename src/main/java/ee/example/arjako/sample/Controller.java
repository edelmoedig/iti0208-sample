package ee.example.arjako.sample;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
@RequestMapping("/api")
public class Controller {

    @GetMapping(value = "/hello", produces = "text/plain")
    public String index() {
        return "Greetings from Spring Boot!";
    }

}
