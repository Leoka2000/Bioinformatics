package myspring_app_group.bioinformatics_thesis.controller;

import myspring_app_group.bioinformatics_thesis.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/")
    public String home(Model model) {
        // Create a sample user
        User user = new User(1L, "John Doe", "john.doe@example.com");

        // Add the user object to the model
        model.addAttribute("user", user);

        // Return the Thymeleaf template name (home.html)
        return "home";
    }
}