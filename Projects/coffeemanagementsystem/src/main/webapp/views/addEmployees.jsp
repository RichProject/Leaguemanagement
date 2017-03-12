<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<link rel="stylesheet"
		href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
	<link rel="stylesheet" href="https://cdn.datatables.net/1.10.13/css/jquery.dataTables.min.css">
<style type="text/css">
	footer .star:after{
		content: "*";
		color: red;
	}
	
	.error{
		color: red;
	}
</style>
</head>
<body>
	<button type="button" id="buttonAddEmployee" class="btn  btn-lg btn-primary" data-toggle="modal" data-target="#addEmployee">Them nhan vien</button>
		
	<div class="modal fade" id="addEmployee" role="dialog">
		    <div class="modal-dialog">
		    
		      <!-- Modal content-->
		      <div class="modal-content">
		        <div class="modal-header" style="text-transform: capitalize; padding-left: 38%; background-color: #337ab7; color: #fff;">
		          <button type="button" class="close" data-dismiss="modal">&times;</button>
		          <h4 class="modal-title">Thêm Nhân Viên</h4>
		        </div>
		        <form class="form-horizontal" style="font-size: 14px;" id="addEmployee1">
					
			        <div class="modal-body">
		          	  <div class="form-group">
					    <label for="inputNameEmployee" class="col-lg-3 control-label star">Tên nhân viên</label>
					    <div class="col-lg-9">
					      <input type="text" id="nameEmployee" class="form-control validate" name="nameEmployee" placeholder="Tên nhân viên">
					    </div>
					  </div>
						  
					  <div class="form-group">
					    <label for="inputBirthday" class="col-lg-3 control-label star">Ngày sinh</label>
					    <div class="col-lg-9">
					      <input type="date" class="form-control validate" name="birthday" id="birthday" placeholder="Ngày sinh">
					    </div>
					  </div>
					  
					  <div class="form-group">
					    <label for="inputNumberPhone" class="col-lg-3 control-label star">Số điện thoại</label>
					    <div class="col-lg-9">
					      <input type="tel" class="form-control validate" name="numberPhone" id="numberPhone" placeholder="SĐT">
					    </div>
					  </div>
						  
					  <div class="form-group">
					    <label for="inputIdCard" class="col-lg-3 control-label star">CMND</label>
					    <div class="col-lg-9">
					      <input type="text" class="form-control validate" name="idCard" id="idCard" placeholder="CMND">
					    </div>
					  </div>
					  
					  <div class="form-group">
					    <label for="inputAddress" class="col-lg-3 control-label star">Địa chỉ</label>
					    <div class="col-lg-3">
					      <input type="text" class="form-control validate" name="address" id="address" placeholder="Số nhà">
					    </div>					   
					    <div class="col-lg-3">
					        <select class="form-control validate" name="districtSelect" id="districtSelect" style="color: #999999;">
								<option> Quận</option>
							</select>
					    </div>
					    <div class="col-lg-3">
							<select class="form-control validate" name="wardSelect" id="wardSelect" style="color: #999999;">
								<option> Phường</option>
							</select>					    
						</div>
					  </div>
					  
					  <div class="form-group">
					    <label for="inputStartDate" class="col-lg-3 control-label star">Ngày bắt đầu</label>
					    <div class="col-lg-9">
					      <input type="date" class="form-control validate" name="startDate" id="startDate"  placeholder="Ngày bắt đầu">
					    </div>
					  </div>
					  
					  <div class="form-group">
					    <label for="inputEndDate" class="col-lg-3 control-label">Ngày kết thúc</label>
					    <div class="col-lg-9">
					      <input type="date" class="form-control" id="endDate" placeholder="Ngày bắt đầu">
					    </div>		    
						    
					  </div>
					  					  
					  <div class="form-group">
					    <label for="inputSalary" class="col-lg-3 control-label star">Lương </label>
					    <div class="col-lg-8">
					      <input type="number" class="form-control validate" name="salary" id="salary" placeholder="lương nhân viên">
					    </div>	
					    <div class="col-lg-1">
					      <h4 style="margin-left: -22px;">VNĐ</h4>
					    </div>				    
					  </div>
						  		  
					  <div class="form-group">
					   	<label for="inputGender" class="col-lg-3 control-label">Giới tính</label>
					    <div class="col-lg-9">
					        <label class="radio-inline">
							  <input type="radio" name="inlineRadioOptions" id="gender" value="1" checked="checked"> Nam
							</label>
							<label class="radio-inline" style="margin-left: 40px">
							  <input type="radio" name="inlineRadioOptions" id="gender" value="0"> Nữ
							</label>
					    </div>
					  </div>
					  
					  <div class="form-group">
					    <label for="inputPosition" class="col-lg-3 control-label star">Chức vụ</label>
					    <div class="col-lg-9">
					      <input type="text" class="form-control validate" name="position" id="position" placeholder="Chức vụ">
					    </div>
					  </div>
						  
					  <div class="form-group">
					    <label for="inputDescribe" class="col-lg-3 control-label">Mô tả</label>
					    <div class="col-lg-9">
					      <textarea class="form-control" id="description" placeholder="Mô tả"></textarea>
					    </div>
					  </div>						
			        </div>
			        <div class="modal-footer">
			          <button type="submit" id="submitAddEmployee" class="btn btn-primary">Save</button>
			          <button type="button" id="buttonCancelAddEmployee" class="btn btn-primary" data-dismiss="modal">Cancel</button>		          
			        </div>		        
		        </form>
		      </div>		      
		    </div>
		  </div>
<script	src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js"></script>
<script	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>	
<script	src="http://ajax.aspnetcdn.com/ajax/jquery.validate/1.15.0/jquery.validate.js"></script>
<script	src="https://cdn.datatables.net/1.10.13/js/jquery.dataTables.min.js"></script>
<script type="text/javascript">
	var cancelHide = false;
	
	function resetForm(){
		$('#addProduct1').validate().resetForm();
		$("#nameProduct").val('');
		$("#productGroup").prop('selectedIndex',0);
		$("#priceProduct").val('');
		$("#status").prop('checked', true);
	}
	
	$(document).ready(function(){
		// focus on first field of table add employee
		$("#buttonAddEmployee").click(function() {
			 $('#addEmployee').on('shown.bs.modal', function () {
			 	
			     $('#nameEmployee').focus();
			 });
		});
		
		
		// validate form Employee
		$("#addEmployee1").validate({
			onfocusout : false,
			rules : {
				'nameEmployee' : {
					required : true,
					maxlength : 20
				},
				'birthday' : {
					required : true
				},
				'startDate' : {
					required : true
				},
				'salary' : {
					required : true
				},
				'numberPhone' : {
					required : true,
					minlength: 9,
					maxlength: 11,
					number: true
				},
				'idCard' : {
					required : true,
					minlength: 9,
					maxlength: 12,
					number: true
				},
				'address' : {
					required : true,
					maxlength: 100
				},
				'position' : {
					required : true,
					maxlength: 50
				}

			},
			messages : {
				'nameEmployee' : {
					required : "Vui lòng nhập tên nhân viên.",
					maxlength : "Tên nhân viên phải nhỏ hơn 20 ký tự. Vui lòng nhập lại!"
				},
				'birthday' : {
					required : "Vui lòng nhập ngày sinh."
				},
				'startDate' : {
					required : "Vui lòng nhập ngày bắt đầu."
				},
				'salary' : {
					required : "Vui lòng nhập lương."
				},
				'numberPhone' : {
					required : "Vui lòng nhập số điện thoại.",
					minlength: "SĐT lơn hơn hoặc bằng 9 ký tự. Vui lòng nhập lại!",
					maxlength: "SĐT nhỏ hơn hoặc bằng 11 ký tự. Vui lòng nhập lại!",
					number: "SĐT phải là số. Vui lòng nhập lại!"
				},
				'idCard' : {
					required : "Vui lòng nhập CMND.",
					minlength: "CMND lơn hơn hoặc bằng 9 ký tự. Vui lòng nhập lại!",
					maxlength: "CMND nhỏ hơn hoặc bằng 12 ký tự. Vui lòng nhập lại!",
					number: "CMND phải là số. Vui lòng nhập lại!"
				},
				'address' : {
					required : "Vui lòng nhập địa chỉ.",
					maxlength: "địa chỉ phải nhỏ hơn 100 ký tự. Vui lòng nhập lại!"
				},
				'position' : {
					required : "Vui lòng nhập chức vụ.",
					maxlength: "Chức vụ phải nhỏ hơn 50 ký tự. Vui lòng nhập lại!"
				}
			}
		});
		
		// display error when mouse blur
		$(".validate").blur(function(){
			if (!cancelHide) {
				if(!$(this).valid()){
		             return false;
		         }
		    }         
	     });
		
		$('#buttonCancelAddEmployee').mousedown(function() {
		    cancelHide = true;
		});
		$('#buttonCancelAddEmployee').mouseup(function() {
		    cancelHide = false;
		    resetForm();
		    $("#addEmployee").modal('hide');
		});
		
		
		// get list ward
		$.ajax({
			url : "getListDistrict",
			dataType : "json",
			success : function(data){
				$("#districtSelect").empty();
				 $.each(data, function(){
				 	$("#districtSelect").append('<option value="'+ this.id +'">'+ this.name +'</option>');
				 });
			}
		});
		
		// get list district
		$.ajax({
        	url : "searchWardByDistrictId",
        	type: 'POST',
            data: {
            	id : $('#districtSelect').val()
            },	            	
            dataType : "json",
            success : function(data){
				$("#wardSelect").empty();
				 $.each(data, function(){
				 	$("#wardSelect").append('<option value="'+ this.id +'">'+ this.name +'</option>');
				 });
			}
        });		
		$("#districtSelect").change(function(){
	        $.ajax({
	        	url : "searchWardByDistrictId",
	        	type: 'POST',
	            data: {
	            	id : $('#districtSelect').val()
	            },	            	
	            dataType : "json",
	            success : function(data){
					$("#wardSelect").empty();
					 $.each(data, function(){
					 	$("#wardSelect").append('<option value="'+ this.id +'">'+ this.name +'</option>');
					 });
				}
	        });
		});
		
		// add employees
		$("#addEmployee1").submit(function(e){
			e.preventDefault();
			var data = {
					"wardId" : $('#wardSeclect').val(),
					"name" :  $('#nameEmployee').val(),
					"address" : $('#address').val(),
					"idCard" : $('#idCard').val(),	
					"phone"	: $('#numberPhone').val(),
					"birthday" : $('#birthday').val(),
					"startDate"	:$('#startDate').val(),
					"endDate" : $('#endDate').val(),
					"salary" : $('#salary').val(),
					"position" : $('#position').val(),
					"gender" : $('#gender').is(':checked'),
					"description" : $('#description').val()
			};
			$.ajax({
				url : "addEmployees",
				type : "POST",
				dataType: "json",
				contentType : "application/json",
				data: JSON.stringify(data),
				success : function(data){
					alert("Thêm thành công");
				},
				error : function(data){
					alert("Thêm không thành công");
				}				
			});			
		});
		
		
		
	});

</script>  


</body>
</html>