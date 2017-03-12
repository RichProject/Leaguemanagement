
var listCustomer = {};
updateButton();

/* Add button to item in table */ 
function updateButton() {
	if (listCustomer.length != 0) {
		for (var i = 0; i < listCustomer.length; i++) {
			var input = "<button onclick='viewCus("
					+ i
					+ ")' class='fa fa-eye' data-toggle='modal' data-target='#view-modal'></button>"
					+ "<button onclick='editCus("
					+ i
					+ ")' class='fa fa-pencil-square-o' data-toggle='modal' data-target='#edit-modal'></button>"
					+ "<button onclick='delCus("
					+ i
					+ ")' class='fa fa-trash-o' data-toggle='modal' data-target='#delete-modal'></button>";

			listCustomer[i].action = input;
		}
	}
}

/* Request Search Customer */
function search() {
	var data = {
		"name" : $("#name").val(),
		"phoneNumber" : $("#phone").val(),
		"gender" : $("#gender").val(),
		"point" : $("#point").val()
	};
	$.ajax({
		type : "POST",
		contentType : "application/json; charset=utf-8",
		url : "customer/search",
		data : JSON.stringify(data),
		dataType : 'json',
		success : function(data) {
			console.log("SUCCESS: ", data);
			listCustomer = data;
			updateButton();
			createTable();
		},
		error : function(e) {
			console.log("ERROR: ", e);
		},
		done : function(e) {
			console.log("DONE");
		}
	});

}

/* Request Update Customer */
function updateCustomer(customer) {
	$.ajax({
		type : "POST",
		contentType : "application/json; charset=utf-8",
		url : "customer/update",
		data : JSON.stringify(customer),
		dataType : 'json',
		success : function(data) {
			console.log("SUCCESS: ", data);
			$(this).off('hide.bs.modal');
			update();
		},
		error : function(e) {
			console.log("ERROR: ", e);
		},
		done : function(e) {
			console.log("DONE");
		}
	});
}

/* Request Delete Customer */
function deleteCustomer(customer) {
	$.ajax({
		type : "POST",
		contentType : "application/json; charset=utf-8",
		url : "customer/delete",
		data : JSON.stringify(customer),
		dataType : 'json',
		success : function(data) {
			console.log("SUCCESS: ", data);
		},
		error : function(e) {
			console.log("ERROR: ", e);
		},
		done : function(e) {
			console.log("DONE");
		}
	});
}

/* show modal view customer information */
function viewCus (pos) {
	$('#view-modal').on('show.bs.modal', function(e) {
		$(e.currentTarget).find('input[id="id"]').val(listCustomer[pos].id);
		$(e.currentTarget).find('input[id="name"]').val(listCustomer[pos].name);
		$(e.currentTarget).find('input[id="phone"]').val(listCustomer[pos].phoneNumber);
		$(e.currentTarget).find('input[id="email"]').val(listCustomer[pos].email);
		$(e.currentTarget).find('input[id="point"]').val(listCustomer[pos].point);
		$(e.currentTarget).find('input[id="birth"]').val(listCustomer[pos].birthday);
		if (listCustomer[pos].gender == 1) {
			$(e.currentTarget).find('input[value="1"]').attr("checked", true);
			$(e.currentTarget).find('input[value="0"]').attr("checked", false);
		} else {
			$(e.currentTarget).find('input[value="0"]').attr("checked", true);
			$(e.currentTarget).find('input[value="1"]').attr("checked", false);
		}
	})
}

/* Show modal edit customer information */
function editCus(pos) {
	var posEdit = pos;
	$('#edit-modal').on('show.bs.modal', function(e) {
		$(e.currentTarget).find('input[id="id"]').val(listCustomer[pos].id);
		$(e.currentTarget).find('input[id="name"]').val(listCustomer[pos].name);
		$(e.currentTarget).find('input[id="phone"]').val(listCustomer[pos].phoneNumber);
		$(e.currentTarget).find('input[id="email"]').val(listCustomer[pos].email);
		$(e.currentTarget).find('input[id="point"]').val(listCustomer[pos].point);
		$(e.currentTarget).find('input[id="birth"]').val(listCustomer[pos].birthday);
		if (listCustomer[pos].gender == 1) {
			$(e.currentTarget).find('input[value="1"]').attr("checked", true);
			$(e.currentTarget).find('input[value="0"]').attr("checked", false);
		} else {
			$(e.currentTarget).find('input[value="0"]').attr("checked", true);
			$(e.currentTarget).find('input[value="1"]').attr("checked", false);
		}
		
		$("input[type='radio']").click(function () {
			console.log($(this).val());
			if ($(this).val() == 1) {
				$(e.currentTarget).find('input[value="0"]').attr("checked", false);
			} else {
				$(e.currentTarget).find('input[value="1"]').attr("checked", false);
			}
		});
	});
	
}

/* On submit Save customer */
function submitSave() {
	$('#edit-modal').on('hide.bs.modal', function(e){
		listCustomer[posEdit].name = $(e.currentTarget).find('input[id="name"]').val();
		listCustomer[posEdit].phone = $(e.currentTarget).find('input[id="phone"]').val();
		listCustomer[posEdit].point = $(e.currentTarget).find('input[id="point"]').val();
		listCustomer[posEdit].birth = $(e.currentTarget).find('input[id="birth"]').val();
		updateCustomer(listCustomer[posEdit]);
	});
}


/* On show modal delete */
function delCus (pos) {
	var posDel = pos;
}

/* On submit delete customer */
function submitDel() {
	console.log(posDel);
	$('#delete-modal').on('hide.bs.modal', function(e){
		data.splice(posDel, 1);
		console.log(data);
		$(this).off('hide.bs.modal');
		updateButton();
		update();
	});
}




$(document).ready(function() {
	window.createTable = function () {
		var table = $('#table').DataTable();
		table.destroy();
		table = $('#table').DataTable({
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
			"aaData" : listCustomer,
			"language" : {
				"emptyTable" : "No Customer Found"
			},
			columns : [ {
				"data" : "id",
				"width": "5%",
				"defaultContent": ""
			}, {
				"data" : "name",
				"width": "25%",
				"defaultContent": ""
			}, {
				"data" : "phoneNumber",
				"width": "25%",
				"defaultContent": ""
			}, {
				"data" : "point",
				"width": "20%",
				"defaultContent": ""
			}, {
				"data" : "action",
				"width": "25%",
				"orderable": false,
				"defaultContent": ""
			} ],
		});
	}
	
	/* Update data in dataTable */
	window.update = function() {
		$('#table').dataTable().fnClearTable();
		$('#table').dataTable().fnAddData(listCustomer);
	};

	/* On button Search click */
	$('#Submitsearch').click(function(e) {
		search();
	})
	
});
