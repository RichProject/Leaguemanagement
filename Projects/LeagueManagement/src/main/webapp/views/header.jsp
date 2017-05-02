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
      <a class="navbar-brand" href="#">League Management</a>
    </div>
    <div class="collapse navbar-collapse" id="myNavbar">
      <ul class="nav navbar-nav">
        <li class="active"><a href="#">Home</a></li>
        <li><a href="#">League</a></li>
        <li><a href="#">Stadium</a></li>
        <li><a href="#">Team</a></li>
        <li><a href="#">Player</a></li>
      </ul>
      <ul class="nav navbar-nav navbar-right">
       	<li id="userfullname" style="display :none" class="dropdown"> 
	       	<a id="profile" href="#" class="dropdown-toggle" data-toggle="dropdown">
	       		<ul class="dropdown-menu " >
			      <li><a href="#" onClick="test()">My profile</a></li>
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
</body>
</html>