







	

	 $("#Search button").click(function() {
		 
			$.ajax( '/coffeemanagementsystem/searchPromotion', {
				  type: 'POST',
				  contentType: "application/json",
			      dataType: "json",
				  
				  success: function( response ) { 
					
					 
					
					 
					  $('#table_id').DataTable( {
						  
							"searching" : false,
							"searchable" : true,
							"scrollX" : false,
							"scrolly" : false,
							"scrollCollapse" : true,
							"paging" : false,
							"lengthChange" : false,
							"ordering" : false,
							"paginate" : false,
							"info" : false,
							"sDom" : 'lfrtip',
							 "data" : response ,
							"columns": [
							            
							            { data: 'promotionName' },
							            { data: 'startDate' },
							            { data: 'endDate' }
							           
							            ]
					    } );
				    
				  }
				});
	 		});
			 $(document).ready(function() {
			 $('#datepicker').datepicker({
				    format: 'mm/dd/yyyy',
				    
				});
			 $('#datepicker1').datepicker({
				    format: 'mm/dd/yyyy',
				    
				});
			 $('#datepicker2').datepicker({
				    format: 'mm/dd/yyyy',
				   
				});
			 $('#datepicker3').datepicker({
				    format: 'mm/dd/yyyy',
				   
				});
			 $('#datepicker4').datepicker({
				    format: 'mm/dd/yyyy',
				  
				});
			 $('#datepicker5').datepicker({
				    format: 'mm/dd/yyyy',
				    
				});
			
			
		 });

function findById(id) {
	var pos;
	for (var i = 0; i < data.length; i++) {
		if (data[i].id === id)
			pos = i;
	}
	return pos;
}

var posDel;
function delCus (pos) {
	posDel = pos;
}



function editCus(pos) {
	$('#edit-modal').on('show.bs.modal', function() {
		$(this).find('input[id="promotionName"]').val(data[pos].promotionName);
		$(this).find('input[id="datepicker4"]').val(data[pos].startDate);
		$(this).find('input[id="datepicker5"]').val(data[pos].endDate);
		
	});
}

function submitSave() {
	
	$('#edit-modal').on('hide.bs.modal', function(){
		var id = $(e.currentTarget).find('input[id="id"]').val();
		console.log(id);
		pos = findById(id);
		data[pos].name = $(this).find('input[id="promotionName"]').val();
		data[pos].phone = $(this).find('input[id="datepicker4"]').val();
		data[pos].point = $(this).find('input[id="datepicker5"]').val();
		
		console.log (data[pos]);
		$(this).off('hide.bs.modal');
		update();
	});
}



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

function viewCus (pos) {
	$('#view-modal').on('show.bs.modal', function() {
		$(this).find('label[id="promotionName"]').text(data[pos].promotionName);
		$(this).find('label[id="datepicker4"]').text(data[pos].startDate);
		$(this).find('label[id="datepicker5"]').text(data[pos].endDate);
	})
}




	


