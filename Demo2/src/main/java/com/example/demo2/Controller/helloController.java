package helloservice.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class helloController
{
    @GetMapping("")
    public String hello()
    {
        String url="http://name:8081/name";
        RestTemplate restTemplate = new RestTemplate();
        String name = restTemplate.getForObject(url, String.class);
        return "Hello" + name;
    }

}
