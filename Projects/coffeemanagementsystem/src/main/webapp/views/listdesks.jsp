<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>

<title>Quản lý Bàn</title>

</head>
<body>
	<div id="content-view">

		<div class="container">

			<div class="panel panel-primary">
				<div class="panel-heading">
					<b>TÌM KIẾM NÂNG CAO</b>
				</div>
				<div class="panel-body">
					<form method="POST" id="search">
						<div class="form-group col-md-10 col-md-offset-1">
							<table class="table table-borderless"
								style="border: 0px; border-bottom: none; padding: 0px">
								<tr>
									<td><label style="align: left">Mã bàn:</label></td>
									<td><input type="text" id="maBan" class="form-control" /></td>
									<td><label>Tên bàn:</label></td>
									<td><input type="text" id="tenNB" class="form-control" /></td>
									<td></td>
								</tr>
								<tr>
									<td><label>Mã thiết bị:</label></td>
									<td><select class="form-group" id="maTB">
									</select></td>
									<td><label>Tên nhóm bàn:</label></td>
									<td><select class="form-group" id="tenNB">
											
									</select></td>
								</tr>
								<tr>
									<td><label>Số lượng ghế:</label></td>
									<td><input type="text" name="slGhe" id="slGhe"
										class="form-control" /></td>
									<td></td>
									<td><button class="btn btn-primary"
											style="margin-left: 125px;" id="btnsearch">Tìm kiếm</button></td>
								</tr>
							</table>
						</div>
					</form>
				</div>

			</div>
		</div>

	</div>
	<div class="col-md-10 col-md-offset-1">
		<table class="table table-striped" id="example">
			<thead>
				<tr>
					<th>Mã bàn</th>
					<th>Tên nhóm bàn</th>
					<th>Mã thiết bị</th>
					<th>Số lượng ghế</th>
					<th>Tên bàn</th>
					<th>Mô tả</th>
					<th>Hoạt động</th>
				</tr>
			</thead>
		</table>
	</div>
	<br>
	<div class="container">

		<button class="btn btn-primary" data-toggle="modal"
			data-target="#myModalHorizontal" style="float: right;"
			id="btnThemMoi">Thêm mới</button>
	</div>

	<!-- Modal -->
	<div class="modal fade" id="myModalHorizontal" tabindex="-1"
		role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
		<div class="modal-dialog">
			<div class="modal-content">
				<!-- Modal Header -->
				<div class="modal-header">
					<button type="button" class="close" data-dismiss="modal">
						<span aria-hidden="true">&times;</span> <span class="sr-only">Close</span>
					</button>
					<h4 class="modal-title" id="myModalLabel">Thêm Và cập nhật
						thông tin bàn</h4>
				</div>

				<!-- Modal Body -->
				<div class="modal-body">

					<form class="form-horizontal" role="form" method="post" action="">
						<div class="form-group">
							<label class="col-sm-2 control-label" for="c">Nhóm bàn</label>
							<div class="row">
								<div class="col-sm-8">
									<select class="form-control" id="grdId">
										<option>
									</select>
								</div>
							</div>
						</div>
						<!-- Text input-->
						<div class="form-group">
							<label class="col-sm-2 control-label" for="textinput">Tên
								Bàn</label>
							<div class="row">
								<div class="col-sm-8">
									<input type="text" class="form-control" id="deskName">
								</div>
							</div>
						</div>
						<!-- Text input-->
						<div class="form-group">
							<label class="col-sm-2 control-label" for="textinput">Mã
								thiết bị</label>
							<div class="row">
								<div class="col-sm-8">
									<input type="text" class="form-control" id="deviceId">
								</div>
							</div>
						</div>
						<!-- Text input-->
						<div class="form-group">
							<label class="col-sm-2 control-label" for="textinput">Số
								lượng ghế</label>

							<div class="row">
								<div class="col-sm-8">
									<input type="text" class="form-control" id="qOSeat">
								</div>
							</div>
						</div>
						<br>
						<!-- Text input-->
						<div class="form-group">
							<label class="col-sm-2 control-label" for="textinput">Mô
								tả</label>

							<div class="row">
								<div class="col-sm-8">
									<textarea class="form-control" rows="5" id="descr"></textarea>
								</div>
							</div>
						</div>

						<div class="form-group">
							<div class="col-sm-offset-2 col-sm-9">
								<div class="pull-right">
									<button class="btn btn-default" id="btnCancel">Cancel</button>
									<button class="btn btn-primary" id="saveDesk">Save</button>
								</div>
							</div>
						</div>
					</form>
				</div>
			</div>
		</div>
	</div>

	<script type="text/javascript" src="resources/js/desk.js"></script>
</body>
</html>