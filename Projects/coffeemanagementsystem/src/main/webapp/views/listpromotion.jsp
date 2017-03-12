<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>

<!DOCTYPE html>
<html>
<head>

<title>Insert title here</title>

 <spring:url value="resources/css/bootstrap.min.css" var="bootstrapCSS" />
<spring:url value="resources/css/bootstrap-theme.min.css" var="bootstrapThemeCSS" />
<spring:url value="resources/css/customer-style.css" var="customerStyle" />
<spring:url value="resources/css/font-awesome.min.css" var="fontAwesome" />
<spring:url value="resources/css/View.css" var="PromotionView" />
<link href="${bootstrapCSS}" rel="stylesheet">
<link href="${bootstrapThemeCSS}" rel="stylesheet">
<link href="${customerStyle}" rel="stylesheet">
<link href="${fontAwesome}" rel="stylesheet">
<link href="${PromotionView}" rel="stylesheet">
 <link rel="stylesheet" href="//code.jquery.com/ui/1.12.1/themes/base/jquery-ui.css">
 <link href="https://cdn.datatables.net/1.10.13/css/jquery.dataTables.min.css" rel="stylesheet" type="text/css">
<!-- Custom CSS -->

  
</head>

<body>
		<div id="content-view" >
			<div id="advance-search">
				<div align="center" id="title-search" ><label >Tìm kiếm nâng cao</label></div>
				 <div>
				 <form  id="Search">
				  <table class="search-form" >
				  	<tr><td>Tên khuyến mãi</td ><td><input style="width: 80%" class="form-control" type="text" name="name"/></td></tr>
				  	<tr><td>Ngày bắt đầu  </td>
				  	<td>
    					<input type="text" id="datepicker" class="form-control" style="width: 30%"  name="start" />
    				</td>
				  	</tr>
				  	<tr><td>Ngày kết thúc</td><td><input type="text" class="form-control" id="datepicker1" name="end" style="width: 30%"  /></td></tr>
				  	<tr align="right"  ><td></td><td><input  type="submit" id="Search" class="btn btn-info"  value="Search" /></td></tr>
				  </table>
				  </form>
				</div>
	
			</div>
			<div  id="table-warp" >
			<table id="table_id" class="cell-border">
    			<thead>
       		 		<tr>
       		 	
            		<th>Tên khuyến mãi</th>
            		<th>Ngày bắt đầu</th>
            		<th>Ngày kết thúc</th>
            		
            		<th>Tùy chọn</th>
            		
        			</tr>
        			
    			</thead>
  				
			</table>
			</div>
		  <div align="right" id="action-content">
		  <button type="button" class="btn btn-info btn-lg "  data-toggle="modal"  data-target="#myModal">Tạo mới</button>
		  
		  </div>
		</div >
		
  <!-- Modal -->
  <div class="modal fade" id="myModal" role="dialog" data-backdrop="static" 
data-keyboard="false">
    <div class="modal-dialog modal-lg">
    <form id="contact" method="POST" action="PromotionController" >
      <div class="modal-content">
        <div style="background-color: #31b0d5" class="modal-header">
          <button type="button" class="close" data-dismiss="modal">&times;</button>
          <h4 class="modal-title" style="text-align: center;color:white">Thêm chương trình khuyến mãi</h4>
        </div>
        <div class="modal-body">
        	<div>
        	 <div>
				  <table class="search-form" >
				  
				  	<tr ><td >Tên khuyến mãi</td ><td><input style="width: 80%" class="form-control" name="name" id="contractName" type="text"/></td></tr>
				  	
				  	<tr ><td >Ngày bắt đầu</td><td><input type="text" id="datepicker2" name="start" class="form-control" style="width: 30%"   /></td></tr>
				  	<tr ><td >Ngày kết thúc</td><td><input type="text" id="datepicker3" name="end" class="form-control" style="width: 30%"   /></td></tr>
				  	
				  </table>
				</div>
				<div>
					
				</div>
        	</div>
         
		
        </div>
        <div class="modal-footer">
          <button type="button" class="btn btn-info" data-dismiss="modal">Close</button>
           <button type="button"  id="button_add" class="btn btn-info" >Add</button>
        </div>
      </div>
      </form>
    </div>
  </div>
	<!-- Edit modal-->
	<div id="edit-modal" class="modal fade" tabindex="-1" role="dialog"
		aria-hidden="true" data-backdrop="static" 
		data-keyboard="false">
		<div class="modal-dialog modal-lg">
			<div class="modal-content">
				<div class="modal-header">
					<button type="button" class="close" data-dismiss="modal"
						aria-hidden="true">&times;</button>
					<h4 class="modal-title" id="editModal">Cập nhật thông tin
						khuyến mãi</h4>
				</div>
				<div class="modal-body">
					<div>
						<table>
							
							<tr>
								<td><label>Tên khuyến mãi</label></td>
								<td><input type="text" id="promotionName" name="name" class="form-control" /></td>
							</tr>
						
					
							<tr>
								<td><label>Ngày bắt đầu</label></td>
								<td>
									<div class="form-group">
										
											<input type='text' class="form-control" id="datepicker4" />
										
									</div>
								</td>
							</tr>
								<tr>
								<td><label>Ngày kết thúc</label></td>
								<td>
									<div class="form-group">
										
											<input type='text' class="form-control" id="datepicker5" />
										
									</div>
								</td>
							</tr>
				
							<tr>
								<td colspan=2 align="right">
									<button type="button" class="btn btn-primary"
										onclick="submitSave()" data-dismiss="modal">Cập nhật</button>
									<button type="button" class="btn btn-primary"
										data-dismiss="modal">Hủy</button>
								</td>
							</tr>
						</table>
				
					</div>
					<div>
						
					</div>
				</div>
			</div>
		</div>
	</div>

	<div id="delete-modal" class="modal fade" tabindex="-1" role="dialog"
		aria-hidden="true" data-backdrop="static" 
		data-keyboard="false">
		<div class="modal-dialog modal-lg">
			<div class="modal-content">
				<div class="modal-header">
					<button type="button" class="close" data-dismiss="modal"
						aria-hidden="true">&times;</button>
					<h4 class="modal-title" id="deleteModal">Xóa khuyến mãi</h4>
				</div>
				<div class="modal-body">
					<label style="align: center">Bạn có chắc muốn xóa khuyến mãi này khỏi danh sách không?</label>
				</div>
				<div class="modal-footer">
					<button type="button" class="btn btn-primary" data-dismiss="modal" onclick="submitDel()">Xóa</button>
					<button type="button" class="btn btn-primary" data-dismiss="modal">Hủy</button>
				</div>
			</div>
		</div>
	</div>

	<div id="view-modal" class="modal fade" tabindex="-1" role="dialog"
		aria-hidden="true" data-backdrop="static" 
		data-keyboard="false">
		<div class="modal-dialog modal-lg">
			<div class="modal-content">
				<div class="modal-header">
					<button type="button" class="close" data-dismiss="modal"
						aria-hidden="true">&times;</button>
					<h4 class="modal-title" id="deleteModal">Thông tin Khuyến mãi</h4>
				</div>
				<div class="modal-body">
				<div>
					<table>
						
						<tr>
							<td><label>Tên chương trình</label></td>
							<td><label  id="promotionName" ></label></td>
						</tr>
						<tr>
							<td><label>Ngày bắt đầu</label></td>
							<td><label  id="datepicker4" ></label></td>
						</tr>
						<tr>
							<td><label>Ngày kết thúc</label></td>
							<td><label  id="datepicker5" ></label></td>
						</tr>
						<tr>
					
						</tr>
						
					</table>
				</div>
				<div></div>
				</div>
				<div class="modal-footer">
					<button type="button" class="btn btn-primary" data-dismiss="modal">Hủy</button>
				</div>
			</div>
		</div>
	</div>	
	 
 <spring:url value="resources/js/jquery-1.12.4.js" var="jQuery" />
	<spring:url value="resources/js/bootstrap.min.js" var="bootstrapJS" />
	<spring:url value="resources/js/jquery.dataTables.min.js" var="dataTableJS" />
	<spring:url value="resources/js/dataTables.bootstrap.min.js" var="dataTableBootstrapJS" />
	<spring:url value="resources/js/customermanagement.js" var="appJS" />
	<spring:url value="resources/js/promotion_N.js" var="pro" />
	<script type="text/javascript" charset="utf8" src="${jQuery}"></script>
	<script type="text/javascript" src="${bootstrapJS}"></script>
	<script type="text/javascript" src="${dataTableJS}"></script>
	<script type="text/javascript" src="${dataTableBootstrapJS}"></script>
	<script type="text/javascript" src="${appJS}"></script>
	<script type="text/javascript" src="${pro}"></script>
</body>

</html>
