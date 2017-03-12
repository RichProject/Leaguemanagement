$(document)
		.ready(
				function() {
					// combobox search loai hang
					$.ajax({
						type : "GET",
						contentType : "application/json;charset=UTF-8",
						dataType : "json",
						url : "getAllMaterialType",
						success : function(data) {
							$.each(data, function(i, item) {
								$('#comboLoaiHang').append($('<option>', {
									value : item.id,
									text : item.name
								}));
							});
						}
					});

					// search
					$("#search")
							.submit(
									function(e) {
										e.preventDefault();
										var search = {
											'name' : $("#material").val()
										};
										$
												.ajax({
													type : "POST",
													contentType : "application/json;charset=UTF-8",
													dataType : "json",
													data : JSON
															.stringify(search),
													url : "listWarehouse",
													success : function(data) {
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
																			"columns" : [
																					{
																						"data" : "id"
																					},
																					{
																						"data" : "name"
																					},
																					{
																						"data" : "materialType"
																					},
																					{
																						"data" : "price"
																					},
																					{
																						"data" : "quantity"
																					},
																					{
																						"className" : 'details-control',
																						"orderable" : false,
																						"data" : null,
																						"defaultContent" : '<button class="viewDetails fa fa-pencil-square-o"></button><button class="update fa glyphicon-zoom-in"></button></button><button class="delete fa fa-trash"></button>'
																					} ]
																		});
													}
												});
										return false;
									});

					var table = $("#example").DataTable({
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
						"sDom" : 'lfrtip'

					});
					// delete update isDelete = 1
					$('#example tbody').on('click', '.delete', function() {
						var r = confirm("ban co muon xoa");
						if (r == true) {
							var data = table.row($(this).parents('tr')).data();
							var row = table.row($(this).parents('tr'));
							var id = data['id'];
							$.ajax({
								type : "POST",
								contentType : "application/json;charset=UTF-8",
								dataType : "json",
								data : JSON.stringify({
									"id" : id
								}),
								url : "deleteWarehouse",
								success : function() {
									row.remove().draw();
									alert("da xoa");
								}
							});
						} else {
							alert("me m");
						}
					});
				});