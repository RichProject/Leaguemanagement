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
  <spring:url value="/resources/css/Footer.css" var="footercss"/>
   <spring:url value="/resources/css/GameManager.css" var="gameManager"/>
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
  <link rel="stylesheet" href="${logincss}">
   <link rel="stylesheet" href="${gameManager}">
  <link rel="stylesheet" href="${footercss}">
  	<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js"></script>
  	<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
</head>
<body>

 	<jsp:include page="/views/header.jsp"></jsp:include>
 	
	<div class="content">
 	<jsp:include page="/views/home.jsp"></jsp:include>	
 	
 	</div>
 	
 	<jsp:include page="/views/footer.jsp"></jsp:include>
 
 <spring:url value="/resources/js/login.js" var="login" />
 <script type="text/javascript" src="${login}"></script>
 <spring:url value="/resources/js/navibar_pageload.js" var="pageload" />
 <script type="text/javascript" src="${pageload}"></script>
 <spring:url value="/resources/js/GameManager.js" var="game" />
 <script type="text/javascript" src="${game}"></script>
  <spring:url value="/resources/js/PlayerManager.js" var="player" />
 <script type="text/javascript" src="${player}"></script>
  <spring:url value="/resources/js/StadiumManager.js" var="stadium" />
 <script type="text/javascript" src="${stadium}"></script>
  <spring:url value="/resources/js/TeamManager.js" var="team" />
 <script type="text/javascript" src="${team}"></script>

</body>
</html>
