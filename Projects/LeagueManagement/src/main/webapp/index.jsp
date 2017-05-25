<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<!DOCTYPE html>
<html lang="en">
<head>
  <title>League Management</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <spring:url value="/resources/css/login_popup.css" var="logincss"/>
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <link rel="stylesheet" href="${logincss}">
  
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>

</head>
<body id= "bg" >

 <jsp:include page="/views/header.jsp"></jsp:include>
 <div class="bs-example">
    <div id ="successMessage"class="container alert alert-success fade in " style="display :none;text-align: center;weight: 50%" >
        <a href="#" class="close" data-dismiss="alert">&times;</a>
        <strong>Success!</strong> Login successfully. Welcome to our services...!
    </div>
    <div id ="successMessage_register"class="container alert alert-success fade in " style="display :none;text-align: center;weight: 50%" >
        <a href="#" class="close" data-dismiss="alert">&times;</a>
        <strong>Success!</strong> Register successfully. You can use that account to login!
    </div>
</div>


<div class ="container abc">
	<div class="text-center">
	  	<h1>Our website - League Management</h1>
	  	<p>Let we connect you together !</p> 
	</div>
	
	<div>
	    <div class="col-sm-4">
	      <h3>Description</h3>
	      <p>This website help you to create a league of sport, you can manage all of things of any league. We will support you with enthusiastic...</p>
	      <p>Event more, we can help you get match when you busy or have a difficulty. We connect you to another player and give all of you having a great time.</p>
	    </div>
	    <div class="col-sm-4">
	      <h3>Technologies</h3>
	      <p>This website be created base on Spring MVC framework with programming language Java. It also use anothers technologies such as : Hiberniate, JPA, Maven,...</p>
	      <p>Because this is a subject project, so it cannot avoid some mistakes or some wrong understand about any framework/defination. We hope you will have some advices to get the website be better in the furture.</p>
	    </div>
	    <div class="col-sm-4">
	      <h3>About us</h3>        
	      <p>We are a team of UIT </p>
	      <p>We make this project for the subject at University. Our team have 5 members, these are :</p>
	      <p>1. Dang Thanh Duy</p>
	      <p>2. huynh Phuoc An</p>
	      <p>3. Phan Nhat Dang </p>
	      <p>4. Nguyen Thanh Dat</p>
	      <p>5. Le Tan Dat</p>
	    </div>
	</div>
</div>
<!-- Large modal -->
	<div class="modal fade" id="loginmodal" tabindex="-1" role="dialog" aria-labelledby="myLargeModalLabel"
	    aria-hidden="true">
	    <div class="modal-dialog modal-lg">
	        <div class="modal-content">
	            <div class="modal-header">
	                <button type="button" class="close" data-dismiss="modal" aria-hidden="true">
	                    ×</button>
	                <h4 class="modal-title" id="myModalLabel">
	                    Login-Registration</h4> 
	            </div>
	            
	            <div class="modal-body">
	                <div class="row">
	                    <div class="col-md-8" style="border-right: 1px dotted #C2C2C2;padding-right: 30px;">
	                        <!-- Nav tabs -->
	                        <ul class="nav nav-tabs">
	                            <li class="active"><a href="#Login" data-toggle="tab">Login</a></li>
	                            <li><a href="#Registration" data-toggle="tab">Registration</a></li>
	                        </ul>
	                        <!-- Tab panes -->
	                        <div class="tab-content">
	                            <div class="tab-pane active" id="Login">
	                                <form id="loginsubmit" role="form" class="form-horizontal">
	                                <div class="form-group">
	                                    <label for="email" class="col-sm-2 control-label">
	                                        Username</label>
	                                    <div class="col-sm-10">
	                                        <input type="text" class="form-control" id="loginusername" placeholder="Email or phonenumber" />
	                                    </div>
	                                </div>
	                                <div class="form-group">
	                                    <label for="exampleInputPassword1" class="col-sm-2 control-label">
	                                        Password</label>
	                                    <div class="col-sm-10">
	                                        <input type="password" class="form-control" id="loginpassword" placeholder="Password" />
	                                    </div>
	                                </div>
	                                <div class="row">
	                                    <div class="col-sm-2">
	                                    </div>
	                                    <div class="col-sm-10">
	                                        <button type="submit" class="btn btn-primary btn-sm">
	                                            Login</button>
	                                        <a href="javascript:;">Forgot your password?</a>
	                                    </div>
	                                </div>
	                                <div id ="errorMessage" class="alert alert-danger fade in" style="display :none; margin-top :10px">
									    <a href="#" class="close" data-dismiss="alert">&times;</a>
									    <strong>Login failed !</strong> Username or password is incorrect. Try again...!
									</div>
	                                </form>
	                            </div>
	                            <div class="tab-pane" id="Registration">
	                                <form id="registration-submit" role="form" class="form-horizontal">
	                                <div class="form-group">
	                                    <label for="email" class="col-sm-2 control-label">
	                                        Fullname</label>
	                                    <div class="col-sm-10">
	                                        <div class="row">
	                                            <div class="col-md-9">
	                                                <input id="regis-fullname" type="text" class="form-control" placeholder="Fullname" />
	                                            </div>
	                                        </div>
	                                    </div>
	                                </div>
	                                <div class="form-group">
	                                    <label for="mobile" class="col-sm-2 control-label">
	                                        Mobile</label>
	                                    <div class="col-sm-10">
	                                        <input type="number" class="form-control" id="regis-phoneNumber" placeholder="Mobile" />
	                                    </div>
	                                </div>
	                                 <div class="form-group">
	                                    <label for="username" class="col-sm-2 control-label">
	                                        Username</label>
	                                    <div class="col-sm-10">
	                                        <input type="text" class="form-control" id="regis-username" placeholder="Username" />
	                                    </div>
	                                </div>
	                                <div class="form-group">
	                                    <label for="password" class="col-sm-2 control-label">
	                                        Password</label>
	                                    <div class="col-sm-10">
	                                        <input type="password" class="form-control" id="regis-password" placeholder="Password" />
	                                    </div>
	                                </div>
	                                 <div class="form-group">
	                                    <label for="password" class="col-sm-2 control-label">
	                                        Confirm</label>
	                                    <div class="col-sm-10">
	                                        <input type="password" class="form-control" id="regis-repassword" placeholder="re-enter password" />
	                                    </div>
	                                </div>
	                                <div class="row">
	                                    <div class="col-sm-2">
	                                    </div>
	                                    <div class="col-sm-10">
	                                        <button id="regis-btnsave" type="submit" class="btn btn-primary btn-sm">
	                                            Save & Continue</button>
	                                        <button id="regis-btncancel"type="button" class="btn btn-default btn-sm">
	                                            Cancel</button>
	                                    </div>
	                                </div>
	                                <div id ="registysuccess" class="alert alert-success fade in" style="display :none; margin-top :10px">
									    <a href="#" class="close" data-dismiss="alert">&times;</a>
									    <strong> Registy success.</strong>Please login with your account!
									</div>
									<div id ="registyerror" class="alert alert-danger fade in" style="display :none; margin-top :10px">
									    <a href="#" class="close" data-dismiss="alert">&times;</a>
									    <strong> Registy Error.</strong>Please check your info!
									</div>
	                                </form>
	                            </div>
	                        </div>
	                        <div id="OR" class="hidden-xs">
	                            OR</div>
	                    </div>
	                    <div class="col-md-4">
	                        <div class="row text-center sign-with">
	                            <div class="col-md-12">
	                                <h3>
	                                    Sign in with</h3>
	                            </div>
	                            <div class="col-md-12">
	                                <div class="btn-group btn-group-justified">
	                                    <a href="#" class="btn btn-primary">Facebook</a> <a href="#" class="btn btn-danger">
	                                        Google</a>
	                                </div>
	                            </div>
	                        </div>
	                    </div>
	                </div>
	            </div>
	        </div>
	    </div>
	</div>
 <jsp:include page="/views/footer.jsp"></jsp:include>
 <spring:url value="/resources/js/login.js" var="login" />
 <script type="text/javascript" src="${login}"></script>
</body>
</html>
