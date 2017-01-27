package fdm.ticketbooking.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class UserController {

	
	
	 @RequestMapping("/users") 
     public String list(Model model) { 
        model.addAttribute("users", "Hello John"); 
        return "users"; 
     } 
}
