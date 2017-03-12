<%@page import="org.json.JSONObject"%>
<%@page import="org.json.JSONArray"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql"%>
<%@ page import="javax.servlet.http.*,javax.servlet.*"%>
<%@ page import="java.io.*,java.util.*,java.sql.*"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<link rel="stylesheet" href="https://cdn.datatables.net/1.10.13/css/jquery.dataTables.min.css">
	
</head>
<body>
	<div class="panel panel-info center-block"
		style="width: 72%; height: 32%; margin-top: 1%">
		<div class="panel-heading">Tìm kiếm</div>
		<div class="panel-body">
			<form class="form-horizontal" id="search"
				action="a" method="POST">
				<div class="form-group">
					<label class="control-label col-sm-3">Tên sản phẩm:</label>
					<div class="col-sm-6">
						<input type="text" class="form-control" id="productName"
							name="productName">
					</div>
				</div>
				<div class="form-group">
					<label class="control-label col-sm-3">Nhóm sản phẩm:</label>
					<div class="col-sm-6">
						<select class="selectpicker form-control" id="productGroupName"
							name="productGroupName">
							
						</select>

					</div>
				</div>
				<div class="form-group">
					<label class="control-label col-sm-3">Giá:</label>
					<div class="col-sm-3">
						<div class="row">
							<div class="col-sm-1">
								<span>Từ</span>
							</div>
							<div class="col-sm-8">
								<input type="text" class="form-control" id="pricefrom"
									name="priceFrom" onkeyup="this.value=FormatNumber(this.value);">
							</div>
							<div class="col-sm-1">
								<span></span>
							</div>
						</div>

					</div>
					<div class="col-sm-3">
						<div class="row">
							<div class="col-sm-1">
								<span>đến</span>
							</div>
							<div class="col-sm-8">
								<input type="text" class="form-control" id="priceto"
									name="priceTo" onkeyup="this.value=FormatNumber(this.value);">
							</div>
							<div class="col-sm-1">
								<span></span>
							</div>
						</div>
					</div>
				</div>
				<div class="form-group">
					<div class="col-sm-5 pull-right">
						<button type="submit" class="btn btn-default">Áp dụng</button>
					</div>
				</div>
			</form>
		</div>
	</div>
	<table id="example" class="display" style="width: 90%; height: 65%;">
		<thead>
			<tr>
				<th>id</th>
				<th>Tên nhân viên</th>
				<th>Giới tính</th>
				<th>Số điện thoại</th>
				<th>Số CMND</th>
				<th>Ngày sinh</th>
				<th>Chức vụ</th>
				<th>Thao tác</th>
			</tr>
		</thead>
	</table>
	<div class="btn-group btn-group-justified center-block"
		style="width: 90%; height: 4%; margin: 1%;">
		<a href="#"	class="btn btn-primary">Xuất excel</a> 
		<a href="#"	class="btn btn-primary" data-toggle="modal" data-target="#addProduct">Thêm nhân viên</a>
		<div id="addform"></div>
	</div>
	
</body>
<script type="text/javascript" src="resources/js/product.js"></script>

</html>