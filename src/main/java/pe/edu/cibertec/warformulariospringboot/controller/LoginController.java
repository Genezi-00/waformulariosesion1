package pe.edu.cibertec.warformulariospringboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import pe.edu.cibertec.warformulariospringboot.model.LoginModel;

@Controller
public class LoginController {

    @GetMapping("/login")
    public String login(Model model){
        model.addAttribute("loginModel", new LoginModel());
        return "login";
    }

}
