<%@ taglib prefix="c"  uri="http://java.sun.com/jsp/jstl/core"%> 
 
      <!DOCTYPE html> 
      <html lang="en"> 
           <head> 
                <meta charset="utf-8"> 
                <meta http-equiv="X-UA-Compatible" 
                 content="IE=edge"> 
                <meta name="viewport" content="width=device-width, 
                 initial-scale=1"> 
           
                <title>Sign Up</title> 
           
                <link rel="stylesheet" 
                 href="https://bootswatch.com/paper/bootstrap.min.css"> 
           
           </head> 
      
           <body> 
           <div class="container">
           <div class="page-header" id="banner">
                <div class="col-lg-6">
            <div class="well bs-component">
              <form class="form-horizontal">
                <fieldset>
                  <legend>Register</legend>
                  <div class="form-group">
                    <label for="inputEmail" class="col-lg-2 control-label">Email</label>
                    <div class="col-lg-10">
                      <input type="text" class="form-control" id="inputEmail" placeholder="Email">
                    </div>
                  </div>
                  <div class="form-group">
                    <label for="inputPassword" class="col-lg-2 control-label">Password</label>
                    <div class="col-lg-10">
                      <input type="password" class="form-control" id="inputPassword" placeholder="Password">
                    </div>
                  </div>
                  <div class="form-group">
                    <label for="inputFirstName" class="col-lg-2 control-label">First Name</label>
                    <div class="col-lg-10">
                      <input type="text" class="form-control" id="inputFirstName" placeholder="First Name">
                    </div>
                  </div>
                  <div class="form-group">
                    <label for="inputLastName" class="col-lg-2 control-label">Last Name</label>
                    <div class="col-lg-10">
                      <input type="text" class="form-control" id="inputLastName" placeholder="Last Name">
                    </div>
                  </div>
                  <div class="form-group">
                    <label for="inputDob" class="col-lg-2 control-label">Date of Birth</label>
                    <div class="col-lg-10">
                      <input type="date" class="form-control" id="inputDob" placeholder="Last Name">
                    </div>
                  </div>
                  <div class="form-group">
                    <div class="col-lg-10 col-lg-offset-2">
                      <button type="reset" class="btn btn-default">Cancel</button>
                      <button type="submit" class="btn btn-primary">Submit</button>
                    </div>
                  </div>
                </fieldset>
              </form>
            <div id="source-button" class="btn btn-primary btn-xs" style="display: none;">&lt; &gt;</div></div>
          </div>
          </div>
                </div>
           </body> 
      </html> 