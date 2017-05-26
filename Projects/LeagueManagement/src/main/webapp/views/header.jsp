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
      <a class="navbar-brand" href="#" onClick="index()">League Management</a>
    </div>
    <div class="collapse navbar-collapse" id="myNavbar">
      <ul class="nav navbar-nav">
        <li class="active"><a href="" onClick="index()">Home</a></li>
        <li><a href="#" onClick="game()">Games</a></li>
        <li><a href="#" onClick="league()">Leagues</a></li>
        <li><a href="#"  onClick="stadium()">Stadiums</a></li>
        <li><a href="#" onClick="team()">Teams</a></li>
        <li><a href="#" onClick="player()">Players</a></li>
      </ul>
      <ul class="nav navbar-nav navbar-right">
       	<li id="userfullname" style="display :none" class="dropdown"> 
	       	<a id="profile" href="#" class="dropdown-toggle" data-toggle="dropdown">
	       		<ul class="dropdown-menu " >
			      <li><a href="#" onClick="UserProfile()">My profile</a></li>
			      <li><a href="#">CSS</a></li>
			      <li><a href="#">Log out</a></li>
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
		<!--         <a href="" class="close" data-dismiss="alert">&times;</a> -->
		<strong>Success!</strong> Login successfully. Welcome to our
		services...!
	</div>
	<div id="successMessage_register"
		class="container alert alert-success fade in "
		style="display: none; text-align: center; weight: 50%">
		<!--         <a href="" class="close" data-dismiss="alert">&times;</a> -->
		<strong>Success!</strong> Register successfully. You can use that
		account to login!
	</div>
</div>
<jsp:include page="/views/Login_popup.jsp"></jsp:include>	
<jsp:include page="/views/UserProfile_popup.jsp"></jsp:include>	
</body>
</html>