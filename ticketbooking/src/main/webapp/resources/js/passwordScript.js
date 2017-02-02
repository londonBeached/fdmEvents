function addEventListeners(){
	if(!confirm_password){
		var confirm_password = document.getElementById("password2");
		confirm_password.addEventListener("blur", validatePassword());
	}
}

function validatePassword(){	
		
		if(!password){
		var password = document.getElementById("password");
		}
		
		if(!confirm_password){
			var confirm_password = document.getElementById("password2");
		}
		
		if(confirm_password && confirm_password.value){
			// Used to check if password contains a capital letter
			// longer than 8 chars, contains a number and contains a special char 
			var upperCaseRegex = new RegExp("^(?=.*[A-Z])");
			var numberRegex = new RegExp("^(?=.*[0-9])");
			var specialCharRegex = new RegExp("^(?=.*[!@#\$%\^&\*])");
			var lengthRegex = new RegExp("(?=.{8,})");
			var fullRegex = new RegExp("^(?=.*[a-z])(?=.*[A-Z])(?=.*[0-9])(?=.*[!@#\$%\^&\*])(?=.{8,})");
	
			if (password.value != confirm_password.value) {
				confirm_password.setCustomValidity("Passwords don't match");
			} else if (!fullRegex.test(password.value)) {
				if (!upperCaseRegex.test(password.value)) {
					confirm_password.setCustomValidity("Passwords need to contain a capital");
				} else if (!numberRegex.test(password.value)) {
					confirm_password.setCustomValidity("Passwords need to contain a number");
				} else if (!specialCharRegex.test(password.value)) {
					confirm_password.setCustomValidity("Passwords need to contain a special char");
				} else if (!lengthRegex.test(password.value)) {
					confirm_password.setCustomValidity("Passwords need to be longer than 8 chars");
				}
			} else {
				confirm_password.setCustomValidity("");
				window.location.href = "http://localhost:8088/ticketbooking/";
			}
		}		
}

