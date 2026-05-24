import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.HashMap;
import java.util.Map;

@RestController
public class HelloController {

    @GetMapping("/hello")
    public Map<String, String> getMessage() {
        Map<String, String> response = new HashMap<>();
        response.put("message", "Hello, this is a REST API!");
        response.put("name", "Akshara Gupta");
        response.put("class", "CS 2A(ELITE)");
        response.put("rollNo", "2401640100125");
        return response;
    }
}