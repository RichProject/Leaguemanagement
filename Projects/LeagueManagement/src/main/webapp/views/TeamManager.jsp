<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <!-- The above 3 meta tags *must* come first in the head; any other head content must come *after* these tags -->
   
	
    <title>Quản lý đội bóng</title>

    <link rel="stylesheet"  href="css/bootstrap.min.css">
	<link rel="stylesheet"  href="css/bootstrap-theme.min.css">
	<link rel="stylesheet"  href="css/style.css">
	<spring:url value="/resources/css/login_popup.css" var="logincss"/>
	  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
	  <link rel="stylesheet" href="${logincss}">
	  
	  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js"></script>
	  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
  </head>

  <body>
  <jsp:include page="/views/header.jsp"></jsp:include>
	 <div class="container">
      <div class="row">       
		  <div class="main col-md-9">
		  	<table class="table">
				<caption>Team list</caption>
				<thead>
				<tr>
						<th>
							<button type="button" class="btn btn-default btn-lg">ADD</button>
						</th>
						<th>
							<div class="input-group">
								<input type="text" class="form-control" placeholder="Tìm kiếm...">
								<span class="input-group-btn">
								<button class="btn btn-default" type="button"><i class="glyphicon glyphicon-search"></i></button>
								</span>
							</div>
						</th>			
					</tr>
					
				</thead>
				<tbody>
					<tr>
						<th>
						</th>
						<th>Team's name</th>
						<th>Phone number</th>
						<th></th>
					</tr>
					<tr>
						<th scope="row">1</th>
						<td>Mark</td>
						<td>Otto</td>
						<td>
							<button type="button" class="btn btn-default">Delete</button>
							<button type="button" class="btn btn-default">Edit  </button>
						</td>
					</tr>
					<tr>
						<th scope="row">2</th>
						<td>Mark</td>
						<td>Otto</td>
						<td>
							<button type="button" class="btn btn-default">Delete</button>
							<button type="button" class="btn btn-default">Edit  </button>
						</td>
					</tr>
					<tr>
						<th scope="row">3</th>
						<td>Mark</td>
						<td>Otto</td>
						<td>
							<button type="button" class="btn btn-default">Delete</button>
							<button type="button" class="btn btn-default">Edit  </button>
						</td>
					</tr>
					<tr>
						<th scope="row">4</th>
						<td>Mark</td>
						<td>Otto</td>
						<td>
							<button type="button" class="btn btn-default">Delete</button>
							<button type="button" class="btn btn-default">Edit  </button>
						</td>
					</tr>
					<tr>
						<th scope="row">5</th>
						<td>Mark</td>
						<td>Otto</td>
						<td>
							<button type="button" class="btn btn-default">Delete</button>
							<button type="button" class="btn btn-default">Edit  </button>
						</td>
					</tr>
				</tbody>
			</table>
			<div class = "add-new">
				<div class="row">
			      <div class="col-xs-8 col-sm-6">
			        <div class="form-group">
					    <label for="exampleInputName2">Team's name</label>
					    <input type="text" class="form-control" id="InputName" placeholder="Manchester United ...">
					</div>
			      </div>
			      <div class="col-xs-4 col-sm-6">
			        <div class="form-group">
					    <label for="exampleInputName2">Phone number</label>
					    <input type="text" class="form-control" id="InputPhoneNumber" placeholder="09868459922...">
					</div>
			      </div>
			    </div>
			    <div class="row">
			    	<div class="col-sm-2 col-md-offset-10">
			    		<button type="button" class="btn btn-default  "> Save </button>
			    	</div>
			    </div>
			</div>	
		  </div>
		</div>
	</div>
  </body>
</html>
