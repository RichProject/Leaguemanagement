<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<title>Ward Form</title>
<body>
	<div class="panel panel-info center-block"
		style="width: 72%; height: 32%; margin-top: 1%">
		<div class="panel-heading">Tìm kiếm</div>
		<div class="panel-body">
			<form class="form-horizontal" id="search" action="aa" method="POST">
				<div class="form-group">
					<label class="control-label col-sm-3">Tên mặt hàng:</label>
					<div class="col-sm-6">
						<input type="text" class="form-control" id="material"
							name="wardName">
					</div>
				</div>
				<div class="form-group">
					<label class="control-label col-sm-3">Loại hàng:</label> 
					<div class="col-sm-6">
					<select
						 class="form-control" id="comboLoaiHang">
						 <option></option>
					</select>
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
				<th>Tên mặt hàng</th>
				<th>Loại hàng</th>
				<th>Giá</th>
				<th>Số lượng</th>
				<th>Thao tác</th>
			</tr>
		</thead>
	</table>
	<div class="btn-group btn-group-justified center-block"
		style="width: 90%; height: 4%; margin: 1%;">
		<a href="#" class="btn btn-primary">Thêm</a>
	</div>
	<script type="text/javascript" src="resources/js/warehouse.js"></script>
</body>
</html>