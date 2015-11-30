package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api")

public class MainController {

    @RequestMapping(value = "/")
    public String[] index() {
        return new String[] {"first", "second"};
    }

}
