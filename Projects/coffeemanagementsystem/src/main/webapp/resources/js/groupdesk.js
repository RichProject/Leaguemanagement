$(document).ready(function(){
	getListGroupDesk();
	var table = $('#example').DataTable( {
		
		"bFilter": false,
		"bLengthChange": false,
			data : "",
		"columns" : [
			{
				"data" : "id"
			},
			{
				"data" : "name"
			},
			{
				"data" : "cost"
			},
		{
  "data": null,
  "defaultContent": '<button type="button" class="btn btn-default btn-md" data-title="Edit" data-toggle="modal" data-target="#edit"><span class="glyphicon glyphicon-edit"></span> Edit</button><button type="button" class="btn btn-default btn-md btdelete" data-title="Edit" data-toggle="modal" data-target="#delete"><span class="glyphicon glyphicon-remove"></span> Remove</button>',
  "targets": -1
}

	
    ],
    "columnsDefs" : [

		{
			"data" : null,

			"targets" : -1
		}

		]
} );
	 
	function getListGroupDesk(){
	$.ajax({
		method:"GET",
		url : "getlistgroupdesk",
		contentType : "application/json;charset=UTF-8",
		dataType : "json",
		success:function(data){
			table.destroy();
			table = $('#example').DataTable( {
					
					"bFilter": false,
					"bLengthChange": false,
					data : data,
					"columns" : [
						{
							"data" : "id"
						},
						{
							"data" : "name"
						},
						{
							"data" : "cost"
						},
					{
		      "data": null,
		      "defaultContent": '<button type="button" class="btn btn-default btn-md btupdate" data-title="Edit" data-toggle="modal" data-target="#edit"><span class="glyphicon glyphicon-edit"></span> Edit</button><button type="button" class="btn btn-default btn-md btdelete" data-title="Edit" data-toggle="modal" data-target="#delete"><span class="glyphicon glyphicon-remove"></span> Remove</button>',
		      "targets": -1
		    }
			
				
		        ],
		        "columnsDefs" : [

					{
						"data" : null,

						"targets" : -1
					}

					]
		    } );
		}
	});
	
}
	
	$("#addgroupdesk").click(function() {
		var data = {
				"name":$("#addname").val(),
				"cost":$("#addcost").val(),
			};
		console.log(data);
		
		$.ajax({
			url : "addgroupdesk",
			method: "POST",
			dataType: "json",
			contentType: "application/json",
			data: JSON.stringify(data),
			success : function(result) {							
				alert("Thêm thành công");
				getListGroupDesk();
			},
			error: function(){
				alert("Thêm không thành công");
				
			}
		});
		$("#addgroupdesk").attr("data-dismiss","modal");
	});
	function deletegd(id){
	$("#deletegroupdesk").click(function() {
		var data = {
				"id":id
			};
		$.ajax({
			url : "deletegroupdesk",
			method: "POST",
			dataType: "json",
			contentType: "application/json",
			data: JSON.stringify(data),
			success : function(result) {							
				alert("Xóa thành công");
				getListGroupDesk();
			},
			error: function(){
				alert("Xóa không thành công");
			}
		});
		$("#deletegroupdesk").attr("data-dismiss","modal");
	});
	}
	function updategd(id){
		$("#updategroupdesk").click(function() {
			var data = {
					"id":id,
					"name":$("#updatename").val(),
					"cost":$("#updatecost").val()
				};
			$.ajax({
				url : "updategroupdesk",
				method: "POST",
				dataType: "json",
				contentType: "application/json",
				data: JSON.stringify(data),
				success : function(result) {							
					alert("Update thành công");
					getListGroupDesk();
				},
				error: function(){
					alert("Update không thành công");
				}
			});
			$("#updategroupdesk").attr("data-dismiss","modal");
		});
		}
	 $('#example tbody').on( 'click', '.btdelete', function () {	
		 var r = table.row($(this).parents('tr')).data();
		 deletegd(r['id']);
	    } );
	 $('#example tbody').on( 'click', '.btupdate', function () {	
		 var r = table.row($(this).parents('tr')).data();
		 $("#updatename").val(r['name']);
		 $("#updatecost").val(r['cost']);
		 updategd(r['id']);
	    } );
});