<%@ taglib prefix="c"  uri="http://java.sun.com/jsp/jstl/core"%> 
<!DOCTYPE html> 
<html lang="en"> 
<head> 
	<meta charset="utf-8"> 
	<meta http-equiv="X-UA-Compatible" content="IE=edge"> 
	<meta name="viewport" content="width=device-width, initial-scale=1"> 
          
	<title>Welcome</title> 
	           
	<link rel="stylesheet" href="https://bootswatch.com/paper/bootstrap.min.css"> 
           
</head>      
<body> 
	<div class="container">
		<div class="page-header" id="banner">
			<div class="jumbotron"> 
				<h1> ${greeting} </h1> 
				<p> ${tagline} </p> 
				<a href="signup" class="btn btn-primary btn-lg">Sign Up</a>
			</div> 
		</div>
		<section class="container"> 
              <div class="row"> 
                 <c:forEach items="${users}" var="users"> 
                    <div class="col-sm-6 col-md-3"> 
                       <div class="thumbnail"> 
                          <div class="caption"> 
                             <h3>${user.firstName} ${user.lastName}</h3> 
                             <p>${user.dob}</p> 
                             <p>${user.gender}</p>
                             <p>${user.email}</p> 
                             <p>${user.password}</p>
                          </div> 
                       </div> 
                    </div> 
                 </c:forEach> 
              </div> 
           </section> 
	</div>
</body> 
</html> 