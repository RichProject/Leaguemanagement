$(document).ready(function() {
	$('#btnThemMoi').click(function(e) {
	});
});
$(document).ready(function() {
	$('#saveDesk').click(function(e) {
		e.preventDefault();
		var groupDeskId = document.getElementById("grdId").value;
		var deskName = document.getElementById("deskName").value;
		var deviceId = document.getElementById("deviceId").value;
		var quantityOfSeats = document.getElementById("qOSeat").value;
		var descript = document.getElementById("descr").value;
		alert(deskName);
		$.ajax({
			url : 'desk/addDesk',
			contentType : "application/json",
			type : 'POST',
			data : JSON.stringify({
				"groupDeskId" : groupDeskId,
				"deskName" : deskName,
				"deviceId" : deviceId,
				"quantityOfSeats" : quantityOfSeats,
				"description" : descript
			}),
			dataType : 'json',
			success : function() {

				alert("saved");
			}
		});
	});
});
$(document).ready(
		function() {
			$.ajax({
				url : 'getlistgroupdesk',
				type : 'GET',
				dataType : 'json',
				success : function(data) {
					$('#grdId, #tenNB').empty();
					$('#tenNB').append($('<option>', {
						value : "rong",
						text : "Không chọn"
					}));
					$.each(data, function(i, value) {
						$('#grdId, #tenNB').append(
								$("<option/>").attr("value",
										value['id'])
										.text(value['name']));
					});
				}
			});
		});
$(document)
.ready(
		function() {

			$("#search")
			.submit(
					function(e) {
						e.preventDefault();
						var search = {

//								private String deskId;
//								private String deskName;
//								private String groupDeskName;
//								private String deviceId;
//								private String quantityOfSeats;

								"deskId" : $("#maBan").val(),
								"deskName" : $("#tenBan").val(),
								"deviceId" : $("#maTB").val(),
								"groupDeskName" : $("#tenNB").val(),
								"quantityOfSeats" : $("#slGhe").val()

						};
						console.log(search);

						$
						.ajax({
							type : "POST",
							contentType : "application/json;charset=UTF-8" ,
							dataType : "json",
							data : JSON.stringify(search),
							url : "desk/searchdesks",
							success : function(data) {
								alert(data)
								table.destroy();
								table = $("#example")
								.DataTable(
										{
											"searching" : false,
											"searchable" : false,
											"scrollX" : false,
											"scrolly" : false,
											"scrollCollapse" : true,
											"paging" : true,
											"lengthChange" : false,
											"ordering" : false,
											"paginate" : false,
											"info" : false,
											"sDom" : 'lfrtip',
											"aaData" : data,
											"columns" : 
												[ {
													"data" : "deskId",
												},
												{
													"data" : "groupDeskName",

												}, {
													"data" : "deviceId",

												}, {
													"data" : "quantityOfSeats",
												}, {
													"data" : "deskName",
												}, {
													"data" : "description",
												}, {
													"className" : 'details-control',
													"orderable" : false,
													"data" : null,
													"defaultContent" : '<i class="glyphicon glyphicon-eye-open data-toggle="tooltip" title="Xem chi tiết""></i>&nbsp;&nbsp;&nbsp;&nbsp;<i class="glyphicon glyphicon-edit" data-toggle="tooltip" title="Cập nhật">&nbsp;</i><i class="glyphicon glyphicon-trash" data-toggle="tooltip" title="Xóa"></i>'
												} ]
										});
							}
						});
						return false;
					});
			var table = $("#example")
			.DataTable(
					{
						"searching" : false,
						"searchable" : false,
						"scrollX" : false,
						"scrolly" : false,
						"scrollCollapse" : true,
						"paging" : true,
						"lengthChange" : false,
						"ordering" : false,
						"paginate" : false,
						"info" : false,
						"sDom" : 'lfrtip',
						"aaData" : "",
						"columns" : 	[ {
							"data" : "deskId",
						},
						{
							"data" : "groupDeskName",

						}, {
							"data" : "deviceId",

						}, {
							"data" : "quantityOfSeats",
						}, {
							"data" : "deskName",
						}, {
							"data" : "description",
						}, {
							"className" : 'details-control',
							"orderable" : false,
							"data" : null,
							"defaultContent" : '<i class="glyphicon glyphicon-eye-open data-toggle="tooltip" title="Xem chi tiết""></i>&nbsp;&nbsp;&nbsp;&nbsp;<i class="glyphicon glyphicon-edit" data-toggle="tooltip" title="Cập nhật">&nbsp;</i><i class="glyphicon glyphicon-trash" data-toggle="tooltip" title="Xóa"></i>'
						} ]
					});
		});
