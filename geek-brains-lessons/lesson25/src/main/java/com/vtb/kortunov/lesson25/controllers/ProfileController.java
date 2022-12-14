package lesson25.controllers;

import com.vtb.kortunov.lesson25.entities.User;
import com.vtb.kortunov.lesson25.services.UserService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.security.Principal;

@Controller
@RequestMapping("/profile")
@AllArgsConstructor
public class ProfileController {
    private UserService userService;

    @GetMapping
    public String showProfilePage(Model model, Principal principal) {
        User user = userService.findByUsername(principal.getName()).get();
        model.addAttribute("fullName", user.getUsername());
        model.addAttribute("email", user.getEmail());
        return "profile-page";
    }
}
