<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
</head>
<body>
<nav class="navbar navbar-default" style="background-color: #b5e3cb">
  <div class="container-fluid">
    <div class="navbar-header">
      <button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#myNavbar">
        <span class="icon-bar"></span>
        <span class="icon-bar"></span>
        <span class="icon-bar"></span>                        
      </button>
    <a  href="#" onClick="index()"> <img
			src="http://vectorlogo4u.com/wp-content/uploads/2015/11/Premier-League-Vector-Logo.png"
			alt="fpt" height="100" width="300"></a>
    </div>
    <div class="collapse navbar-collapse" id="myNavbar">
      <ul class="nav navbar-nav" style="margin-bottom: 15px">
        <li class="active"><a href="" onClick="index()">Home</a></li>
        <li><a href="#" onClick="game()">Games</a></li>
        <li><a href="#" onClick="league()">Leagues</a></li>
        <li><a href="#" onClick="stadium()">Stadiums</a></li>
        <li><a href="#" onClick="team()">Teams</a></li>
        <li><a href="#" onClick="player()">Players</a></li>
      </ul>
      <ul class="nav navbar-nav navbar-right">
       	<li id="userfullname" style="display :none" class="dropdown"> 
	       	<a id="profile" href="#" class="dropdown-toggle" data-toggle="dropdown">
	       		<ul class="dropdown-menu " >
			      <li><a href="#" onClick="UserProfile()">My profile</a></li>
			      <li><a href="#">My Stadium</a></li>
			      <li><a href="#">My Team</a></li>
			      <li><a href="#" onClick="Logout();">Log out</a></li>
			    </ul>
	       	</a>
       	</li>
        <li><a id="login" href="#"><span class="glyphicon glyphicon-log-in"></span> Login</a></li>
      </ul>
    </div>
  </div>
</nav>
<div class="bs-example">
	<div id="successMessage" class="container alert alert-success fade in "
		style="display: none; text-align: center; weight: 50%">
		        <a href="" class="close" data-dismiss="alert">&times;</a>
		<strong>Success!</strong> Login successfully. Welcome to our
		services...!
	</div>
	<div id="alreadyLogin" class="container alert alert-warning fade in "
		style="display: none; text-align: center; weight: 50%">
		        <a href="" class="close" data-dismiss="alert">&times;</a>
		<strong>Warning!</strong> You already login...!!
	</div>
	<div id="successMessage_register"
		class="container alert alert-success fade in "
		style="display: none; text-align: center; weight: 50%">
		        <a href="" class="close" data-dismiss="alert" >&times;</a>
		<strong>Success!</strong> Register successfully. You can use that
		account to login!
	</div>
	<div id="logout_success"
		class="container alert alert-info fade in "
		style="display: none; text-align: center; weight: 50%">
		        <a href="" class="close" data-dismiss="alert" >&times;</a>
		<strong>Info!</strong> You have been logout...!!
	</div>
	<div id="createGame_success"
		class="container alert alert-success fade in "
		style="display: none; text-align: center; weight: 50%">
		        <a href="" class="close" data-dismiss="alert" >&times;</a>
		<strong>Success!</strong> Game is created...!!
	</div>
</div>
<jsp:include page="/views/Login_popup.jsp"></jsp:include>	
<jsp:include page="/views/UserProfile_popup.jsp"></jsp:include>	
</body>
</html>