<%@ taglib prefix="c"  uri="http://java.sun.com/jsp/jstl/core"%> 
<!DOCTYPE html> 
<html lang="en"> 
     <head> 
          <meta charset="utf-8"> 
          <meta http-equiv="X-UA-Compatible" 
           content="IE=edge"> 
          <meta name="viewport" content="width=device-width, initial-scale=1"> 
     
          <title>Log in</title> 
     
          <link rel="stylesheet" href="https://bootswatch.com/paper/bootstrap.min.css"> 
     
     </head> 
<body>
	<form action="#" th:action="@{/login}" th:object="${LoginForm}" method="post">
		<p>Username: <input type="text" th:field="*{username}" /></p>
		<p>Password: <input type="password" th:field="*{password}"/> </p>
		<p><input type="submit" value="Submit" /> 
	</form>
	
	<jsp:useBean id="login" class="fdm.ticketbooking.entity.LoginForm">
		<jsp:setProperty name="login" property="username" value="Test" />
	</jsp:useBean>
	

	<!-- <div class="container">
		<div class="well bs-component">
			<form class="form-horizontal">
		 		<fieldset>
					<legend>Log In</legend>
					<div class="form-group">
						<label for="inputUsername" class="col-lg-2 control-label">Username</label>
						<div class="col-lg-10">
							<input type="text" class="form-control" name="username" id="inputUsername" placeholder="Username">
						</div>
					</div>
					<div class="form-group">
						<label for="inputPassword" class="col-lg-2 control-label">Password</label>
						<div class="col-lg-10">
							<input type="password" class="form-control" name="password" id="inputPassword" placeholder="Password">
						</div>
					</div>
					<div class="form-group">
				    	<div class="col-lg-10 col-lg-offset-2">
				        	<button type="submit" class="btn btn-primary">Submit</button>
				    	</div>
				    	put in a forgot password option
				    </div>
				</fieldset>
			</form>
		</div>
	</div> -->
</body>
</html>