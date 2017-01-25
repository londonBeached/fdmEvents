package fdm.ticketbooking.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import fdm.ticketbooking.repository.UserRepository;

@Controller
public class UserController {

	@Autowired 
    private UserRepository userRepository;
	
	 @RequestMapping("/users") 
     public String list(Model model) { 
        model.addAttribute("users", userRepository.getAllUsers()); 
        return "users"; 
     } 
}
