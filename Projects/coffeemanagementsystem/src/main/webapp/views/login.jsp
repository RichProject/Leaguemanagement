<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>Đăng nhập</title>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">

<spring:url value="resources/css/bootstrap.min.css" var="bootstrapCSS" />
<spring:url value="resources/css/bootstrap-theme.min.css"
	var="bootstrapThemeCSS" />
<spring:url value="resources/css/template_login.css"
	var="templateloginStyle" />
<spring:url value="resources/css/font-awesome.min.css" var="fontAwesome" />

<link href="${bootstrapCSS}" rel="stylesheet">
<link href="${bootstrapThemeCSS}" rel="stylesheet">
<link href="${templateloginStyle}" rel="stylesheet">
<link href="${fontAwesome}" rel="stylesheet">

</head>
<body>
	<div class="vertical-center container-fluid">
		<div class=" container-login">
			<div class="form-login">
				<div id="login-header"></div>
				<div class="clear10"></div>
				<div id="login-body">
					<p>
						<input type="text" name="username" id="username"
							placeholder="Nhập tên đăng nhập..." required="" />
					</p>
					<p>
						<input type="password" name="password" id="password"
							placeholder="Nhập mật khẩu..." required="" />
					</p>
					<p>
						<input type="checkbox" checked="checked"> Nhớ thông tin
						đăng nhập
					</p>
					<p>
						<button type="button">Đăng nhập</button>
					</p>
				</div>
			</div>
			<div id="login-footer">
				<p>
					<button type="button" id="aforgotpassword">Quên mật khẩu?</button>
				</p>
			</div>
			<div class="bgcontainerlogin vertical-center an">
				<i class="btnexit fa fa-times-circle-o"></i>
				<div class="container-forgotpassword">
					<p>
						<input type="text" name="forgotpassword" id="forgotpassword"
							placeholder="Nhập tên tài khoản..." />
						<button type="button" id="btnfindpassword" data-toggle="modal">
							Tìm</button>
					</p>
				</div>
			</div>
		</div>
	</div>

	<!-- Modal -->
	<div id="myModal" class="modal fade" role="dialog">
		<div class="modal-dialog">
			<!-- Modal content-->
			<div class="modal-content">
				<div class="modal-header">
					<button type="button" class="close" data-dismiss="modal">&times;</button>
					<h4 class="modal-title">Chọn phương thức xác nhận</h4>
				</div>
				<div class="modal-body">
					<p>
						<input type="radio" id="phuongthucxacthucemail"
							name="phuongthucxacthuc" value="email" /><label
							for="phuongthucxacthucemail">Thông qua địa chỉ email: <b
							id="myemail">nguye******.com</b></label>
					</p>
					<p>
						<input type="radio" id="phuongthucxacthucphone"
							name="phuongthucxacthuc" value="numberphone" /><label
							for="phuongthucxacthucphone">Thông qua số điện thoại: <b
							id="myphone">093***245</b></label>
					</p>
				</div>
				<div class="modal-footer">
					<button type="button" style="background-color: #31b0d5;"
						class="btn btn-primary">Gửi</button>
					<button type="button" class="btn btn-default" data-dismiss="modal">Hủy
						bỏ</button>
				</div>
			</div>
		</div>
	</div>
	<spring:url value="resources/js/jquery-1.12.4.js" var="jQuery" />
	<spring:url value="resources/js/bootstrap.min.js" var="bootstrapJS" />
	<spring:url value="resources/js/script_login.js" var="scriptlogin" />
	<script type="text/javascript" charset="utf8" src="${jQuery}"></script>
	<script type="text/javascript" src="${bootstrapJS}"></script>
	<script type="text/javascript" src="${scriptlogin}"></script>
	<script>
		showcontainerforgotpassword();
		 // $('#myModal').modal('show');   //show myModal
	</script>
</body>
</html>