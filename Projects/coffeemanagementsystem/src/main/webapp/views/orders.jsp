<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<title>Ward Form</title>
<link rel="stylesheet" href="resources/css/order-style.css">
</head>
<body>
	<div class="panel panel-info center-block"
		style="width: 72%; height: 32%; margin-top: 1%">
		<div class="panel-heading">Tìm kiếm</div>
		<div class="panel-body">
			<form class="form-horizontal" id="search" method="GET">
				<div class="form-group">
					<label class="control-label col-sm-3">Tên Khách:</label>
					<div class="col-sm-6">
						<input type="text" class="form-control" id="userName"
							name="userName">
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
	<table id="example" class="display" style="width: 100%; height: 65%;">
		<thead>
			<tr>
				<th>Mã HĐ</th>
				<th>Tên khách hàng</th>
				<th>Tên bàn</th>
				<th>Số lượng SP</th>
				<th>Tổng tiền</th>
				<th>Thao tác</th>
			</tr>
		</thead>
	</table>
	<div class="modal fade" id="myModalView" role="dialog">
		<div class="modal-dialog">

			<!-- Modal content-->
			<div class="modal-content">
				<!-- Modal Header -->
				<div class="modal-header" style="text-align: center;">
					<button type="button" class="close" data-dismiss="modal">
						<span aria-hidden="true">&times;</span> <span class="sr-only">Close</span>
					</button>
					<h4 class="modal-title" id="myModalLabel">Xem chi tiết</h4>
				</div>
				<div class="modal-body">
					<div class="table-responsive">
						<table class="header-Detail" style="width: 100%">
							<thead>
								<tr>
									<th>Tài Khoản:</th>
									<th></th>
									<th class="value" id="nameCustomer"></th>
								</tr>
								<tr>
									<th>Tổng Tiền:</th>
									<th></th>
									<th class="value" id="totalBill"></th>
								</tr>
								<tr>
									<th>Tổng Sản Phẩm</th>
									<th></th>
									<th class="value" id="quantity"></th>
								</tr>
								<tr>
									<th>Điểm tích lũy</th>
									<th></th>
									<th class="value" id="point"></th>
								</tr>
							</thead>
							<tbody class="body-detail detail-Product-content"
								id="detailProduct">
							</tbody>
						</table>
						<div class="outText">
							<button class="btn btn-default">
								<img id="image" src="resources/img/outText.jpg">
							</button>
						</div>
					</div>
				</div>
			</div>

		</div>
	</div>
</body>
<script type="text/javascript" src="resources/js/orders.js"></script>
</html>