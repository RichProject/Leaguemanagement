/**
 * this function use for auto load data when index.jsp called
 */
var datatable = null;
$(document)
		.ready(
				function() {
					
					resetTable();
					
							
				});

/**
 * send row click edit to modal edit product group
 */
function setValueModalEdit(id, name, description) {
	var modalid = document.getElementById("idedit");
	var modalname = document.getElementById("namegroupedit");
	var modaldescription = document.getElementById("descriptionedit");
	modalname.value = name;
	modaldescription.value = description;
	modalid.value = id;
}

function editgroupproduct() {
	var modalid = document.getElementById("idedit").value;
	var name = document.getElementById("namegroupedit").value;
	var description = document.getElementById("descriptionedit").value;

	$.ajax({
		url : "productgroup/update",
		data : {
			"id" : modalid,
			"name" : name,
			"description" : description,
		},
		type : "GET",
		contentType : "charset=UTF-8",
		success : function(resp) {
			if(resp==true)resetTable();
		},
		error : function(err) {
			alert("error");
		}

	});
}

/**
 * function use to delete product group
 */
function deletegroupproduct(id) {

	$.ajax({
		url : 'productgroup/delete',
		data : {
			"id" : id,
		},
		type : "GET",
		datatype : 'json',
		contentType : "charset=UTF-8",
		success : function(resp) {
			resetTable();
		},
		error : function(err) {
			alert(err);
		}
	});
}
/**
 * function use to create a product group
 * 
 */
function creategroupproduct() {
	var name = document.getElementById("namegroupadd").value;
	var description = document.getElementById("descriptionadd").value;

	$.ajax({
		url : "productgroup/insert",
		data : {
			"name" : name,
			"description" : description,
		},
		type : "GET",
		contentType : "charset=UTF-8",
		success : function(resp) {
			if(resp==true)
				resetTable();
			
			
		},
		error : function(err) {
			alert("error");
		}

	});
}

/**
 * reset data on modal add product group when click Them nhom san pham
 */

function resetaddmodal() {
	var name = document.getElementById("namegroupadd");
	var description = document.getElementById("descriptionadd");

	name.value = "";
	description.value = "";

}
function resetTable(){
	datatable =table = $('#table_id')
	.DataTable();
	

$.ajax({
	url : 'productgroup/getproductgroupdetail',
	data : {},
	type : "GET",
	datatype : 'json',
	contentType : "charset=UTF-8",
	success : function(data) {
		datatable.destroy();
		 datatable =table = $('#table_id')
			.DataTable(
					{
						 "bSort": false,
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
						data : data,
						"columns" : [

								{	"label":"id",
									"data" : "id"

								},
								{"label":"name",
									"data" : "name"
								},
								{"label":"description",
									"data" : "description"
								},

								{
									"defaultContent" : "<button class='btn btn-default btedit' data-toggle='modal' data-target='#editmodal'><span class='glyphicon glyphicon-wrench'></span></button>"
											+ "<button class='btn btn-default btdelete' data-toggle='modal' data-target='#deletemodal'><span class='glyphicon glyphicon-trash'></span></button>",
								}

						],
						"columnsDefs" : [

						{
							"data" : null,

							"targets" : -1
						}

						],
					"initComplete": function(){
						
						 $("#table_id tbody").on(
									'click',
									'.btedit',
									function() {
										var a = table.row(
												$(this).parents('tr'))
												.data();
										var x = a['id'];

										setValueModalEdit(a['id'],
												a['name'],
												a['description']);
									

									});
						
							$("#table_id tbody")
									.on(
											'click',
											'td .btdelete',
											function() {
												var record = table
														.row($(this)
																.parents(
																		'tr'));
												var deleteid = record
														.data();
												$("#deleteok")
														.unbind()
														.click(
																function() {
																	deletegroupproduct(deleteid['id']);

																	

																});
											});
					}
					}
					);	
	},
	error(err){}
});

	
	
	
}
