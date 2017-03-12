<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<link rel='stylesheet' href='https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css'>
	 <link rel='stylesheet' href='https://cdn.datatables.net/1.10.13/css/dataTables.bootstrap.min.css'>
	 <link rel='stylesheet' href='https://cdn.datatables.net/responsive/2.1.1/css/responsive.bootstrap.min.css'>
			<script src="https://code.jquery.com/jquery-1.12.4.js"></script>
    
	<script src="http://getbootstrap.com/dist/js/bootstrap.min.js"></script>
	<script src="https://code.jquery.com/jquery-1.12.4.js"></script>
    <script src="https://cdn.datatables.net/1.10.13/js/jquery.dataTables.min.js"></script>
	<script src="https://cdn.datatables.net/1.10.13/js/dataTables.bootstrap.min.js"></script>
	<script src="https://cdn.datatables.net/responsive/2.1.1/js/dataTables.responsive.min.js"></script>
	<script src="https://cdn.datatables.net/responsive/2.1.1/js/responsive.bootstrap.min.js"></script>
</head>
<body>
	<div class="container">
            <table id="example" class="table table-bordred table-striped" cellspacing="0" width="100%">
                <thead>
                    <tr>
                        <th>Mã Nhóm Bàn</th>
                        <th>Tên Nhóm Bàn</th>
                        <th>Phụ Thu</th>
                        <th>Tùy Chọn</th>
						
                        
                    </tr>
                </thead>
            </table>
			<button type="button" class="btn btn-success" data-title="Edit" data-toggle="modal" data-target="#popupadd" ><span class="glyphicon glyphicon-ok-sign"></span> Thêm Mới</button>
        </div>
		
		<!--edit -->
<div class="modal fade" id="edit" tabindex="-1" role="dialog" aria-labelledby="modalLabel" aria-hidden="true">
  <div class="modal-dialog">
	<div class="modal-content">
		<div class="modal-header">
			
			<h3 class="modal-title" id="lineModalLabel">Sửa</h3>
		</div>
		<div class="modal-body">
			<form>
              <div class="form-group">
                <label>Tên Nhóm Bàn</label>
                <label id="error1" style="color:red"></label>
                <input type="text" class="form-control" id="updatename" placeholder="Tên nhóm bàn">
              </div>
              <div class="form-group">
                <label for="exampleInputPassword1">Phụ Thu</label>
                <label id="error2" style="color:red"></label>
                <input type="text" class="form-control" id="updatecost" placeholder="Phụ thu">
              </div>
			 
                <div class="modal-footer ">
        <button id="updategroupdesk" type="button" class="btn btn-success"  ><span class="glyphicon glyphicon-ok-sign"></span> Yes</button>
        <button type="button" class="btn btn-default" data-dismiss="modal"><span class="glyphicon glyphicon-remove"></span> No</button>
      </div>
			  
			  
            </form>
		</div>
	</div>
  </div>
</div>
<!--add -->
<div class="modal fade" id="popupadd" tabindex="-1" role="dialog">
  <div class="modal-dialog">
	<div class="modal-content">
		<div class="modal-header">
			
			<h3 class="modal-title" id="lineModalLabel">Thêm</h3>
		</div>
		<div class="modal-body">
			<form>
              <div class="form-group">
                <label>Tên Nhóm Bàn</label>
                <label id="error1" style="color:red"></label>
                <input type="text" class="form-control" id="addname" placeholder="Tên nhóm bàn">
              </div>
              <div class="form-group">
                <label for="exampleInputPassword1">Phụ Thu</label>
                <label id="error2" style="color:red"></label>
                <input type="text" class="form-control" id="addcost" placeholder="Phụ thu">
              </div>
			 
                <div class="modal-footer ">
        <button id="addgroupdesk" type="button" class="btn btn-success" ><span class="glyphicon glyphicon-ok-sign"></span> Yes</button>
        <button type="button" class="btn btn-default" data-dismiss="modal"><span class="glyphicon glyphicon-remove"></span> No</button>
      </div>
			  
			  
            </form>
		</div>
	</div>
  </div>
</div>
<!-- delete -->
<div class="modal fade" id="delete" tabindex="-1" role="dialog" aria-labelledby="edit" aria-hidden="true">
      <div class="modal-dialog">
    <div class="modal-content">
          <div class="modal-header">
        <button type="button" class="close" data-dismiss="modal" aria-hidden="true"><span class="glyphicon glyphicon-remove" aria-hidden="true"></span></button>
        <h4 class="modal-title custom_align" id="Heading">Delete this entry</h4>
      </div>
          <div class="modal-body">
       
       <div class="alert alert-danger"><span class="glyphicon glyphicon-warning-sign"></span> Are you sure you want to delete this Record?</div>
       
      </div>
        <div class="modal-footer ">
        <button id="deletegroupdesk" type="button" class="btn btn-success" ><span class="glyphicon glyphicon-ok-sign"></span> Yes</button>
        <button type="button" class="btn btn-default" data-dismiss="modal"><span class="glyphicon glyphicon-remove"></span> No</button>
      </div>
        </div>
    <!-- /.modal-content --> 
  </div>
      <!-- /.modal-dialog --> 
    </div>
</body>
	<script	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>	
	<script src="https://code.jquery.com/jquery-1.12.4.js"></script>
	<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js"></script>
    <script src="https://cdn.datatables.net/1.10.13/js/jquery.dataTables.min.js"></script>
	<script src="https://cdn.datatables.net/1.10.13/js/dataTables.bootstrap.min.js"></script>
	<script src="https://cdn.datatables.net/responsive/2.1.1/js/dataTables.responsive.min.js"></script>
	<script src="https://cdn.datatables.net/responsive/2.1.1/js/responsive.bootstrap.min.js"></script>
	<script src="resources/js/groupdesk.js"></script>
</html>