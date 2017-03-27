<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<!DOCTYPE html>
<html lang="en">
<head>
  <title>Bootstrap Example</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
 
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>




 
<style type="text/css">

body{
//background-image:url("http://www.powerpointhintergrund.com/download/football-background-2458");

}


#bg {
  position: fixed; 
  top: 0; 
  left: 0; 
	
  /* Preserve aspet ratio */
  max-width: 100%;
  min-height: 100%;
}

.abc {color:white;


 }
</style>


</head>
<body background = "resources/home.jpg">
<nav class="navbar navbar-inverse">
  <div class="container-fluid">
    <div class="navbar-header">
      <button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#myNavbar">
        <span class="icon-bar"></span>
        <span class="icon-bar"></span>
        <span class="icon-bar"></span>                        
      </button>
      <a class="navbar-brand" href="#">League Management</a>
    </div>
    <div class="collapse navbar-collapse" id="myNavbar">
      <ul class="nav navbar-nav">
        <li class="active"><a href="#">Home</a></li>
        <li><a href="#">Stadium</a></li>
        <li><a href="#">Team</a></li>
        <li><a href="#">Player</a></li>
      </ul>
      <ul class="nav navbar-nav navbar-right">
        <li><a id="login" href="#"><span class="glyphicon glyphicon-log-in"></span> Login</a></li>
      </ul>
    </div>
  </div>
</nav>
  
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

<div class="container">
	<div class="modal fade" id="loginmodal" role="dialog">
		 <div class="modal-dialog">
			  <!-- Modal content-->
	      <div class="modal-content">
	        <div class="modal-header">
	          <button type="button" class="close" data-dismiss="modal">&times;</button>
	          <h4 class="modal-title">Login</h4>
	        </div>
	        <div class="modal-body">
	          <p>Some text in the modal.</p>
	        </div>
	        <div class="modal-footer">
	          <button type="button" class="btn btn-default" data-dismiss="modal">Close</button>
	        </div>
	      </div>
	</div>
</div>
</div>

 <spring:url value="/resources/js/login.js" var="login" />
 <script type="text/javascript" src="${login}"></script>
</body>
</html>
