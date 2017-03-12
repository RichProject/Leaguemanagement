<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>

<meta name="viewport" content="width=device-width, initial-scale=1">
<!-- style css bootstrap -->
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<!-- style css datatable -->
<link rel="stylesheet" type="text/css"
	href="resources/css/datatable.css">
<!-- set Icon page -->
<link rel="icon" type="image/gif" href="resources/icon/icon.ico" />

<title>Group product</title>

<style type="text/css">
body {
	background: #d9e6f2;
}
</style>
</head>
<body>
	<!-- table data -->
	<div class="container">
		<h1>Nhóm sản phẩm</h1>

		<table id="table_id" class="display">
			<thead>
				<tr>
					<th>ID</th>
					<th>Tên nhóm sản phẩm</th>
					<th>Miêu tả</th>
					<th>Hoạt động</th>
				</tr>
			</thead>

		</table>

		<div>

			<div>
				<!-- button export excel -->
				<button type="button" class="btn btn-success" id="excel"
					data-toggle="modal" data-target="#epexcel">Xuất ra excel</button>

				<!-- button add product group -->
				<button type="button" class="btn btn-success navbar-right"
					id="addgroup" data-toggle="modal" data-target="#addmodal"
					onclick="resetaddmodal();" style="margin-right: 0.25%;">Thêm
					nhóm sản phẩm</button>
			</div>


		</div>
	</div>

	<!-- <td><button name="change" type="button"
							class="btn btn-default" data-toggle="modal"
							data-target="#editmodal">Sửa</button>
						<button name="delete" type="button" class="btn btn-default"
							data-toggle="modal" data-target="#deletemodal">Xóa</button></td>
				</tr>

 -->

	<!-- modal delete record -->

	<div class="modal fade" id="deletemodal" role="dialog">
		<div class="modal-dialog">


			<div class="modal-content">
				<div class="modal-header">
					<button type="button" class="close" data-dismiss="modal">&times;</button>
					<h4 class="modal-title" align="center">Bạn muốn xóa Nhóm sản
						phẩm này ?</h4>
				</div>
				<div class="modal-body" align="center">
					<button type="button" class="btn btn-danger" data-dismiss="modal"
						id="deleteok">Có</button>
					<button type="button" class="btn btn-success" class="close"
						data-dismiss="modal">Không</button>
				</div>

			</div>

		</div>
	</div>
	<!-- modal edit record -->

	<div class="modal fade" id="editmodal" role="dialog">
		<div class="modal-dialog">


			<div class="modal-content">
				<div class="modal-header">
					<button type="button" class="close" data-dismiss="modal">&times;</button>
					<h4 class="modal-title" align="center">Sửa nhóm sản phẩm</h4>
				</div>
				<div class="modal-body" align="center"></div>
				<form class="form-horizontal">
					<div class="form-group">
						<label class="control-label col-sm-3" for="namegroup">Tên
							Nhóm:</label>
						<div class="col-sm-8">
							<input type="text" class="form-control" id="namegroupedit"
								placeholder="Nhập tên nhóm">
						</div>
					</div>
					<div class="form-group">
						<label class="control-label col-sm-3" for="desc">Miêu tả:</label>
						<div class="col-sm-8">
							<input type="text" class="form-control" id="descriptionedit"
								placeholder="Nhập miêu tả">
						</div>
					</div>
					<div class="form-group">
						<div class="col-sm-offset-2 col-sm-10"></div>
					</div>
					<div class="form-group" align="center">
						<div class="col-sm-offset-2 col-sm-10">
							<input type="hidden" id="idedit">
							<button type="button" class="btn btn-success" id="editgroup"
								data-dismiss="modal" onclick="editgroupproduct();">Sửa</button>
							<button type="button" class="btn btn-danger" class="close"
								data-dismiss="modal">Hủy</button>
						</div>
					</div>
				</form>

			</div>

		</div>
	</div>
	<!-- model add group product -->
	<div class="modal fade" id="addmodal" role="dialog">
		<div class="modal-dialog">


			<div class="modal-content">
				<div class="modal-header">
					<button type="button" class="close" data-dismiss="modal">&times;</button>
					<h4 class="modal-title" align="center">Thêm nhóm sản phẩm</h4>
				</div>
				<div class="modal-body" align="center"></div>
				<form class="form-horizontal">
					<div class="form-group">
						<label class="control-label col-sm-3" for="namegroup">Tên
							Nhóm:</label>
						<div class="col-sm-8">
							<input type="text" class="form-control" id="namegroupadd"
								placeholder="Nhập tên nhóm">
						</div>
					</div>
					<div class="form-group">
						<label class="control-label col-sm-3" for="desc">Miêu tả:</label>
						<div class="col-sm-8">
							<input type="text" class="form-control" id="descriptionadd"
								placeholder="Nhập miêu tả">
						</div>
					</div>
					<div class="form-group">
						<div class="col-sm-offset-2 col-sm-10"></div>
					</div>
					<div class="form-group" align="center">
						<div class="col-sm-offset-2 col-sm-10">
							<button type="button" class="btn btn-success" id="addgroup"
								class="close" data-dismiss="modal"
								onclick="creategroupproduct();">Thêm</button>
							<button type="button" class="btn btn-danger" class="close"
								data-dismiss="modal" onclick="removeTable();">Hủy</button>
						</div>

					</div>
				</form>

			</div>

		</div>
	</div>

	<!-- import jquery library javascript -->
	<script
		src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js"></script>
	<!-- import bootstrap library javascript -->
	<script
		src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
	<!-- import datatable library javascript -->
	<script type="text/javascript" charset="utf8"
		src="resources/js/datatable.js"></script>
	<!-- import javascript page -->
	<script type="text/javascript" src="resources/js/GroupProduct.js"></script>

</body>

</html>