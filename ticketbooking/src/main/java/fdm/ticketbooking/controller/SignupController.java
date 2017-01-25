package fdm.ticketbooking.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class SignupController {
	
	@RequestMapping("/signup")
	public String signup(Model model){
		return "signup";
	}

}
