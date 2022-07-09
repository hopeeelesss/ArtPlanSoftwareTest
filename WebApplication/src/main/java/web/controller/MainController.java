package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import web.dto.UserRegistrationDTO;


@Controller
public class MainController {

    @GetMapping()
    public String showHomePage(){
        return "home";
    }

    @GetMapping("/login")
    public String loadLoginPage(){
        return "login";
    }
}
