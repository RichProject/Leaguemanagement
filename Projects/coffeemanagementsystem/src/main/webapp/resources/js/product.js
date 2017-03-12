$(document)
		.ready(
				function() {
					var cancelHide = false;
					function resetForm() {
						$('#addProduct1').validate().resetForm();
						$("#nameProduct").val('');
						$("#productGroup").prop('selectedIndex', 0);
						$("#priceProduct").val('');
						$("#descriptionProduct").val('');
						$("#status").prop('checked', true);
					}
					$("#addform")
							.load(
									"homeAddProducts",
									function() {
										$
												.ajax({
													url : "productgroup/getproductgroup",
													dataType : "json",
													success : function(data) {
														$("#productGroup")
																.empty();
														$
																.each(
																		data,
																		function() {
																			$(
																					"#productGroup")
																					.append(
																							'<option value="'
																									+ this.id
																									+ '">'
																									+ this.name
																									+ '</option>');
																		});
													}
												});
										$("#buttonAddProduct")
												.click(
														function() {
															$('#addProduct')
																	.on(
																			'shown.bs.modal',
																			function() {
																				$(
																						'#nameProduct')
																						.focus();
																			});
														});
										$("#addProduct1")
												.submit(
														function(e) {
															e.preventDefault();
															var data = {
																"name" : $(
																		"#nameProduct")
																		.val(),
																"productGroupId" : $(
																		"#productGroup")
																		.val(),
																"price" : $(
																		"#priceProduct")
																		.val(),
																"status" : $(
																		"#status")
																		.is(
																				':checked'),
																"description" : $(
																		"#descriptionProduct")
																		.val()
															};
															console.log(data);
															if ($(
																	"#addProduct1")
																	.valid()) {
																$
																		.ajax({
																			url : "addProducts",
																			type : "POST",
																			dataType : "json",
																			contentType : "application/json",
																			data : JSON
																					.stringify(data),
																			success : function(
																					result) {
																				alert("Thêm thành công");
																				resetForm();
																				$(
																						"#addProduct")
																						.modal(
																								'hide');
																			},
																			error : function() {
																				alert("Thêm không thành công");
																				resetForm();
																			}
																		});

															}
															return false;
														});

										$(".validate").blur(function() {
											if (!cancelHide) {
												if (!$(this).valid()) {
													return false;
												}
											}
										});

										$("#addProduct1")
												.validate(
														{
															onfocusout : false,
															rules : {
																'nameProduct' : {
																	required : true,
																	maxlength : 20
																},
																'productGroup' : {
																	required : true
																},
																'priceProduct' : {
																	required : true,
																	min : 0
																}
															},
															messages : {
																'nameProduct' : {
																	required : "Vui lòng nhập tên sản phẩm.",
																	maxlength : "Tên sản phẩm nhỏ hơn 50 ký tự. Vui lòng nhập lại!"
																},
																'productGroup' : {
																	required : "Vui lòng chọn tên nhóm sản phẩm.",
																},
																'priceProduct' : {
																	required : "Vui lòng nhập giá sản phẩm.",
																	min : "Giá phải lớn hơn 0. Vui lòng nhập lại!"
																}
															}
														});

										$('#buttonCancelAddProduct').mousedown(
												function() {
													cancelHide = true;
												});
										$('#buttonCancelAddProduct').mouseup(
												function() {
													cancelHide = false;
													resetForm();
													$("#addProduct").modal(
															'hide');
												});
									});

					$.ajax({
						url : "productgroup/getproductgroup",
						dataType : "json",
						success : function(data) {
							$('#productGroupName').empty();
							$('#productGroupName').append($('<option>', {
								value : "rong",
								text : "Không chọn"
							}));
							$.each(data, function(i, item) {
								$('#productGroupName').append($('<option>', {
									value : item.id,
									text : item.name
								}));
							});
						}
					});

					// $.ajax({
					// url : "ListProductName",
					// dataType : "json",
					// success : function(data) {
					// $("#productName").typeahead({
					// hint : true,
					// highlight : true,
					// minLength : 1,
					// source : data
					// });
					// }
					// });
					$("#search").submit(function(e) {
										e.preventDefault();
										var search = {
											'name' : $("#productName").val(),
											'groupId' : $("#productGroupName")
													.val(),
											'priceFrom' : $("#pricefrom").val(),
											'priceTo' : $("#priceto").val()
										}
										$
												.ajax({
													type : "POST",
													contentType : "application/json;charset=UTF-8",
													url : "searchproducts",
													dataType : "json",
													data : JSON
															.stringify(search),
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
																			"language" : {
																				"emptyTable" : "Không có sản phẩm nào cả",
																				"paginate" : {
																					"previous" : "Trước",
																					"next" : "Sau"
																				}
																			},
																			"columns" : [
																					{
																						"data" : "id",
																						"visible" : false
																					},
																					{
																						"data" : "productGroupId",
																						"visible" : false
																					},
																					{
																						"data" : "name"
																					},
																					{
																						"data" : "productGroupName"
																					},
																					{
																						"data" : "price"
																					},
																					{
																						"data" : "description"
																					},
																					{
																						"className" : 'details-control',
																						"orderable" : false,
																						"data" : null,
																						"defaultContent" : '<i class="editproduct fa fa-pencil-square-o"></i><i class="deleteproduct fa fa-trash"></i>'
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
										"language" : {
											"emptyTable" : "Không có sản phẩm nào cả",
											"paginate" : {
												"previous" : "Trước",
												"next" : "Sau"
											}
										},
										"columns" : [
												{
													"data" : "id",
													"visible" : false
												},
												{
													"data" : "productGroupId",
													"visible" : false
												},
												{
													"data" : "name"
												},
												{
													"data" : "productGroupName"
												},
												{
													"data" : "price"
												},
												{
													"data" : "description"
												},
												{
													"className" : 'details-control',
													"orderable" : false,
													"data" : null,
													"defaultContent" : '<i class="editproduct fa fa-pencil-square-o"></i><i class="deleteproduct fa fa-trash"></i>'
												} ]
									});
				});