package fdm.ticketbooking.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LoginController {

	@RequestMapping("/login")
	public void loginPage(Model model){
		
	}
	
	
	public boolean login(String username, String password){
		return false;
	}
	//need to build a login page using hardcoding to test for now
	//connect to the database and check credentials
	//encryption and anything else
}
