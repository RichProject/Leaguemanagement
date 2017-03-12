<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />

<!-- Latest compiled and minified CSS -->
<spring:url value="resources/css/bootstrap.min.css" var="bootstrapCSS" />
<link href="${bootstrapCSS}" rel="stylesheet">

<spring:url value="resources/css/bootstrap-theme.min.css"
	var="bootstrapThemeCSS" />
<link href="${bootstrapThemeCSS}" rel="stylesheet">

<title>Thêm tài khoản</title>
</head>

<body>
	<div class="container">
		<!--Begin Modal -->
		<div class="modal fade" id="accountModal" role="dialog">
			<div class="modal-dialog">

				<!--Begin Modal content-->
				<div class="modal-content">

					<!-- Begin Modal Header-->
					<div class="modal-header">
						<button type="button" class="close" data-dismiss="modal">&times;</button>
						<h4 class="modal-title">Thêm Tài Khoản</h4>
					</div>
					<!-- End Modal Header-->

					<!-- Begin Modal Body-->
					<div class="modal-body">
						<div class="panel panel-default">

							<!-- First panel -->
							<div class="panel-heading">Thông tin cá nhân</div>
							<div class="panel-body">
								<div class="form-group">
									<label class="control-label col-md-4 required">Họ và
										tên:</label>
									<div class="col-md-8">
										<input id="hovaten" type="text" class="form-control">
										<span id="name_error" style="color: red;"></span>
									</div>
								</div>

								<div class="form-group">
									<label class="control-label col-md-4 required">Số Điện
										thoại:</label>
									<div class="col-md-8">
										<input id="sodienthoai" type="text" class="form-control">
										<span id="name_error" style="color: red;"></span>
									</div>
								</div>

								<div class="form-group">
									<label class="control-label col-md-4 required">Ngày
										sinh:</label>
									<div class="col-md-8">
										<input id="ngaysinh" type="date" class="form-control">
										<span id="name_error" style="color: red;"></span>
									</div>
								</div>

								<div class="form-group">
									<label class="control-label col-md-4">Giới tính:</label>
									<div class="col-md-8" style="margin-top: 1%">
										<div class="col-md-6">
											<input type="radio" name="gender" value="male" checked>
											Nam <br>
										</div>
										<div class="col-md-6">
											<input type="radio" name="gender" value="female"> Nữ
											<br>
										</div>
									</div>
								</div>

								<div class="form-group">
									<label class="control-label col-md-4 required">Số CMND:</label>
									<div class="col-md-8">
										<input id="socnmnd" type="text" class="form-control">
										<span id="name_error" style="color: red;"></span>
									</div>
								</div>
							</div>

							<!-- Second panel -->
							<div class="panel-heading">Địa Chỉ</div>
							<div class="panel-body">
								<div class="form-group">
									<label class="control-label col-md-4 required">Số nhà:</label>
									<div class="col-md-8">
										<input id="sonha" type="text" class="form-control"> <span
											id="name_error" style="color: red;"></span>
									</div>
								</div>

								<div class="form-group">
									<label class="control-label col-md-4 required">Tỉnh/Thành:</label>
									<div class="col-md-8">
										<input id="tinhthanh" type="text" class="form-control">
										<span id="name_error" style="color: red;"></span>
									</div>
								</div>

								<div class="form-group">
									<label class="control-label col-md-4 required">Quận:</label>
									<div class="col-md-8">
										<input id="quan" type="text" class="form-control"> <span
											id="name_error" style="color: red;"></span>
									</div>
								</div>

								<div class="form-group">
									<label class="control-label col-md-4 required">Phường:</label>
									<div class="col-md-8">
										<input id="phuong" type="text" class="form-control"> <span
											id="name_error" style="color: red;"></span>
									</div>
								</div>
							</div>


							<!-- Third panel -->
							<div class="panel-heading">Thông tin tài khoản</div>
							<div class="panel-body">
								<div class="form-group">
									<label class="control-label col-md-4 required">Tên tài
										khoản:</label>
									<div class="col-md-8">
										<input id="tentaikhoan" type="text" class="form-control">
										<span id="name_error" style="color: red;"></span>
									</div>
								</div>
								<div class="form-group">
									<label class="control-label col-md-4 required">Email:</label>
									<div class="col-md-8">
										<input id="email" type="text" class="form-control"> <span
											id="name_error" style="color: red;"></span>
									</div>
								</div>
								<div class="form-group">
									<label class="control-label col-md-4 required">Tài
										khoản chủ:</label>
									<div class="col-md-8">
										<input id="taikhoanchu" type="text" class="form-control">
										<span id="name_error" style="color: red;"></span>
									</div>
								</div>
								<div class="form-group">
									<label class="control-label col-md-4 required">Loại tài
										khoản:</label>
									<div class="col-md-8" style="margin-top: 1%">
										<div class="col-md-6">
											<input type="radio" name="gender" value="male" checked>
											Tài khoản thường <br>
										</div>
										<div class="col-md-6">
											<input type="radio" name="gender" value="female">
											Admin <br>
										</div>
									</div>
								</div>
							</div>

							<!-- Last panel -->
							<div class="panel-heading">
								Danh sách cửa hàng<a href="#storeModal"
									style="float: right; font-size: 13px; padding-left: 50px;"
									data-toggle="modal" data-target="#storeModal"
									data-dismiss="modal">Thêm cửa hàng </a>
							</div>
							<div class="panel-body">
								<table class="display" style="width: 90%; height: 65%;">
									<thead>
										<tr>
											<th>Tên cửa hàng</th>
											<th>Mô tả</th>
											<th>Xóa</th>
										</tr>
									</thead>
									<tbody id="liststore">
									</tbody>
								</table>
							</div>
						</div>
						<!-- End panel-default-->
					</div>
					<!-- End Modal Body-->

					<!-- Begin Modal Footer-->
					<div class="modal-footer">
						<button type="button" class="btn btn-info save-btn"
							data-dismiss="modal" onClick="btnLuu()">Lưu</button>
						<button type="button" class="btn btn-default" data-dismiss="modal" onClick="btnLuu()">Hủy</button>
					</div>
					<!-- End Modal Footer-->
				</div>
				<!--End Modal content-->

			</div>
		</div>
		<!--End Modal -->
		<!-- Modal -->
		<div class="modal fade" id="storeModal" role="dialog">
			<div class="modal-dialog">

				<!-- Modal content-->
				<div class="modal-content">

					<div class="modal-header">
						<button type="button" class="close" data-dismiss="modal">&times;</button>
						<h4 class="modal-title">Thông tin cửa hàng</h4>
					</div>

					<div class="modal-body">
						<div class="panel-heading"></div>
						<div class="panel-body">
							<div class="form-group">
								<label class="control-label col-md-4 required">Tên cửa
									hàng</label>
								<div class="col-md-8">
									<input id="storename" type="text" class="form-control">
									<span id="name_error" style="color: red;"></span>
								</div>
							</div>

							<div class="form-group">
								<label class="control-label col-md-4 required">Mô tả</label>
								<div class="col-md-8">
									<textarea id="storedis" class="form-control" rows="6" cols="40"></textarea>
								</div>
							</div>

						</div>


					</div>

					<div class="modal-footer">
						<button type="button" class="btn btn-info save-btn"
							data-toggle="modal" data-dismiss="modal"
							data-target="#accountModal" onclick="addstore()">Lưu</button>
						<button type="button" class="btn btn-default" data-toggle="modal"
							data-dismiss="modal" data-target="#accountModal">Hủy</button>

					</div>
				</div>

			</div>
		</div>
	</div>


	<spring:url value="resources/js/jquery-1.12.4.js" var="jQuery" />
	<spring:url value="resources/js/bootstrap.min.js" var="bootstrapJS" />
	<spring:url value="resources/js/account.js" var="accountJS" />
	<script type="text/javascript" charset="utf8" src="${jQuery}"></script>
	<script type="text/javascript" src="${bootstrapJS}"></script>
	<script type="text/javascript" src="${accountJS}"></script>
</body>
</html>