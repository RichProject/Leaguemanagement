<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML >
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Customer Management</title>


<spring:url value="resources/css/customer-style.css" var="customerStyle" />
<link href="${customerStyle}" rel="stylesheet">

</head>
<body>

	<div class="container-fluid" id="main">
		<div class="row">
			<form id="search" method="post">
				<div class="form-group col-md-10 col-md-offset-1">
					<table class="table table-bordered">
						<tr>
							<td><label>Họ và tên:</label></td>
							<td><input type="text" id="name" name="fullName"
								class="form-control" /></td>
							<td><label>Số điện thoại:</label></td>
							<td><input type="text" id="phone" class="form-control" /></td>
							<td></td>
						</tr>
						<tr>
							<td><label>Giới tính:</label></td>
							<td><select class="form-control" id="gender">
									<option value=0>Nam</option>
									<option value=1>Nữ</option>
							</select></td>
							<td><label>Điểm thành viên:</label></td>
							<td><input type="text" id="point" class="form-control" /></td>
							<td><button type="button" id="Submitsearch"
									class="btn btn-primary">Search</button></td>
						</tr>
					</table>
				</div>
			</form>

			<div class="col-md-10 col-md-offset-1">
				<table class="table table-striped" id="table">
					<thead>
						<tr>
							<th>ID</th>
							<th>Họ và tên</th>
							<th>Số điện thoại</th>
							<th>Điểm thành viên</th>
							<th></th>
						</tr>
					</thead>
				</table>
			</div>

			<div class="col-md-3 col-md-offset-9">
				<button type="button" class="btn btn-primary"
					onClick="addCustomer()">Thêm khách hàng</button>
			</div>
		</div>
	</div>

	<div id="edit-modal" class="modal fade" tabindex="-1" role="dialog"
		aria-hidden="true">
		<div class="modal-dialog">
			<div class="modal-content">
				<div class="modal-header">
					<button type="button" class="close" data-dismiss="modal"
						aria-hidden="true">&times;</button>
					<h4 class="modal-title" id="editModal">Cập nhật thông tin
						khách hàng</h4>
				</div>
				<div class="modal-body">
					<form action="" method="post" id="updateCustomerForm">
						<table>
							<tr>
								<td><label>ID</label></td>
								<td><input type="text" id="id" class="form-control"
									disabled /></td>
							</tr>
							<tr>
								<td><label>Họ và tên</label></td>
								<td><input type="text" id="name" name="name"
									class="form-control" /></td>
							</tr>
							<tr>
								<td><label>Số điện thoại</label></td>
								<td><input type="tel" name="phone" id="phone"
									class="form-control" /></td>
							</tr>
							<tr>
								<td><label>Email</label></td>
								<td><input type="email" name="email" id="email"
									class="form-control" /></td>
							</tr>
							<tr>
								<td><label>Ngày sinh</label></td>
								<td>
									<div class="form-group">
										<div class='input-group date' id='datepicker'>
											<input type='date' class="form-control" id="birth" />
										</div>
									</div>
								</td>
							</tr>
							<tr>
								<td><label>Giới tính</label></td>
								<td><input type="radio" id="gender" value="male">Nam
									<input type="radio" id="gender" value="female">Nữ</td>
							</tr>
							<tr>
								<td><label>Điểm thành viên</label></td>
								<td><input type="text" id="point" class="form-control"
									disabled /></td>
							</tr>
							<tr>
								<td colspan=2 align="right">
									<button type="button" class="btn btn-primary"
										onclick="submitSave()" data-dismiss="modal">Save</button>
									<button type="button" class="btn btn-primary"
										data-dismiss="modal">Hủy</button>
								</td>
							</tr>
						</table>
					</form>
				</div>
			</div>
		</div>
	</div>

	<div id="delete-modal" class="modal fade" tabindex="-1" role="dialog"
		aria-hidden="true">
		<div class="modal-dialog">
			<div class="modal-content">
				<div class="modal-header">
					<button type="button" class="close" data-dismiss="modal"
						aria-hidden="true">&times;</button>
					<h4 class="modal-title" id="deleteModal">Xóa Khách hàng</h4>
				</div>
				<div class="modal-body">
					<label style="align: center">Bạn có chắc muốn xóa khách
						hàng này khỏi danh sách không?</label>
				</div>
				<div class="modal-footer">
					<button type="button" class="btn btn-primary" data-dismiss="modal"
						onclick="submitDel()">OK</button>
					<button type="button" class="btn btn-primary" data-dismiss="modal">Hủy</button>
				</div>
			</div>
		</div>
	</div>

	<div id="view-modal" class="modal fade" tabindex="-1" role="dialog"
		aria-hidden="true">
		<div class="modal-dialog">
			<div class="modal-content">
				<div class="modal-header">
					<button type="button" class="close" data-dismiss="modal"
						aria-hidden="true">&times;</button>
					<h4 class="modal-title" id="deleteModal">Thông tin khách hàng</h4>
				</div>
				<div class="modal-body">
					<table>
						<tr>
							<td><label>ID</label></td>
							<td><input type="text" id="id" class="form-control" disabled /></td>
						</tr>
						<tr>
							<td><label>Họ và tên</label></td>
							<td><input type="text" id="name" class="form-control"
								disabled /></td>
						</tr>
						<tr>
							<td><label>Số điện thoại</label></td>
							<td><input type="text" id="phone" class="form-control"
								disabled /></td>
						</tr>
						<tr>
							<td><label>Email</label></td>
							<td><input type="text" id="email" class="form-control"
								disabled /></td>
						</tr>
						<tr>
							<td><label>Ngày sinh</label></td>
							<td>
								<div class="form-group">
									<div class='input-group date' id='datepicker'>
										<input type='date' class="form-control" id="birth" disabled />
									</div>
								</div>
							</td>
						</tr>
						<tr>
							<td><label>Giới tính</label></td>
							<td><input type="radio" id="gender" value="0" disabled>Nam
								<input type="radio" id="gender" value="1" disabled>Nữ</td>
						</tr>
						<tr>
							<td><label>Điểm thành viên</label></td>
							<td><input type="text" id="point" class="form-control"
								disabled /></td>
						</tr>
					</table>
				</div>
				<div class="modal-footer">
					<button type="button" class="btn btn-primary" data-dismiss="modal">Hủy</button>
				</div>
			</div>
		</div>
	</div>


	<!-- Script File  -->
	<spring:url value="resources/js/customermanagement.js" var="appJS" />
	<script type="text/javascript" src="${appJS}"></script>
</body>
</html>