package fdm.ticketbooking.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import fdm.ticketbooking.entity.LoginForm;

@Controller
public class LoginController {

	@GetMapping("/login")
	public String loginPage(Model model){
		model.addAttribute("login", new LoginForm());
		return "login";
	}
	
	
	
	//Test that this  is actually receiving the data when you submit it!
	@PostMapping("/login")
	public String greetingSubmit(@ModelAttribute LoginForm login){
		return "result";
	}
	
	public boolean login(String username, String password){
		return false;
	}
	//need to build a login page using hardcoding to test for now
	//connect to the database and check credentials
	//encryption and anything else
}
