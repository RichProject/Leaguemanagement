/**
 * 
 */
function loadstadium(){
	//Load list game from database
	$(document).ready(function(){
		$.ajax({
	        type: "POST",
	        url: "stadium",
	        contentType : "application/json;charset=UTF-8",
	        dataType : "json",
	        success: function(data) 
	        {
	        	$.each(data, function(i, item) {
	        		if(item.status == "available") {
	        			var icon = '<i class="glyphicon glyphicon-ok-sign"></i>';
	        		}
	        		if(item.status == "full"){
	        			var icon = '<i class="glyphicon glyphicon-remove"></i>';
	        		}
			        		var b= $('#listStadium').html()
							+ '<tr><td>'
							+ item.stadiumID
							+ '</td><td>'
							+ item.stadiumName
							+ '</td><td>'
							+ item.address
							+ '</td><td>'
							+ item.district
							+ '</td><td>'
							+ item.ward
							+ '</td><td>'
							+ icon
							+ '</td><td>'
							+ item.ownerName.phoneNumber
							+ '</td><td>'
							+ item.ownerName.fullname
							+ '</td><td>'
							+ getStar(item.pointReview)
							+ '</td><td><i class="stadiuminfo glyphicon glyphicon-info-sign"></i></td></tr>';
					$('#listStadium').html(b);
					$(".stadiuminfo").bind("click", function() {
						var table = document.getElementById('stadiumTable');
						var rowclicked=$(this).closest('tr').index();
						stadiuminfo_click(data[rowclicked]);
					});
				});
	        },
				error : function(){
					alert("Load games failed ...! ");
				}
	      });
		
		
	});
}

function stadiuminfo_click(object){
	
	if(object.haveClothShop == true) document.getElementById("stadium_haveShop").value= "Yes";
	else document.getElementById("stadium_haveShop").value= "No";
	
	if(object.haveCanteen == true) document.getElementById("stadium_haveCanteen").value= "Yes";
	else document.getElementById("stadium_haveCanteen").value= "No";
	
	document.getElementById("stadium_ground5").value=object.fiveGround;
	document.getElementById("stadium_ground5_prize").value=object.priceFiveGround;
	document.getElementById("stadium_ground7").value=object.sevenGround;
	document.getElementById("stadium_ground7_prize").value=object.priceSevenGround;
	document.getElementById("stadium_ground11").value=object.elevenGround;
	document.getElementById("stadium_ground11_prize").value=object.priceElevenGround;
	$("#stadium_stadiumInfo").modal();
}

function getStar(pointReview){
	var starString='';
	var i = 0;
		for(i;i<pointReview;i++){
			starString=starString +'<i class="fa fa-star" aria-hidden="true"></i>';
		}
		return starString;
}

function filterStadiumName() {
	  var input, filter, table, tr, td, i;
	  input = document.getElementById("searchStadium");
	  filter = input.value.toUpperCase();
	  table = document.getElementById("stadiumTable");
	  tr = table.getElementsByTagName("tr");
	  for (i = 0; i < tr.length; i++) {
	    td = tr[i].getElementsByTagName("td")[1];
	    if (td) {
	      if (td.innerHTML.toUpperCase().indexOf(filter) > -1) {
	        tr[i].style.display = "";
	      } else {
	        tr[i].style.display = "none";
	      }
	    }       
	  }
	}


function createStadium() {
	$("#stadium_createStadium").modal();
	
}
			


function stadium_submit(){
	
	
	
	var stadium = {
			ownerID				: JSON.parse(localStorage.getItem("account")).username,
			stadiumName			: $("#createstadium_name").val(),
			address				: $("#createstadium_address").val(),
			district 			: $("#createstadium_district").val(),
			ward 				: $("#createstadium_ward").val(),
			fiveGround 			: $("#createstadium_ground5").val(),
			priceFiveGround		: $("#createstadium_ground5_prize").val(),
			sevenGround 		: $("#createstadium_ground7").val(),
			priceSevenGround 	: $("#createstadium_ground7_prize").val(),
			elevenGround 		: $("#createstadium_ground11").val(),
			priceElevenGround 	: $("#createstadium_ground11_prize").val()
		}
	if (	($("#createstadium_name").val() == "")
		||	($("#createstadium_address").val() == "")
		||	($("#createstadium_district").val() == "")
		||	($("#createstadium_ward").val() == "")) {
		
		document.getElementById('createstadium_errorMessage').style.display = "block";
		$('#createstadium_errorMessage').delay(1500).fadeOut('slow');
	}
	else{
		$.ajax({
	        type: "POST",
	        url: "createstadium",
	        contentType : "application/json;charset=UTF-8",
	        dataType : "json",
	        data : JSON.stringify(stadium),
	        success: function(item) 
	        {
	        	if(item.status == "available") {
    			var icon = '<i class="glyphicon glyphicon-ok-sign"></i>';
    		}
    		if(item.status == "full"){
    			var icon = '<i class="glyphicon glyphicon-remove"></i>';
    		}
	        	var b= $('#listStadium').html()
				+ '<tr><td>'
				+ item.stadiumID
				+ '</td><td>'
				+ item.stadiumName
				+ '</td><td>'
				+ item.address
				+ '</td><td>'
				+ item.district
				+ '</td><td>'
				+ item.ward
				+ '</td><td>'
				+ icon
				+ '</td><td>'
				+ item.ownerName.phoneNumber
				+ '</td><td>'
				+ item.ownerName.fullname
				+ '</td><td>'
				+ getStar(item.pointReview)
				+ '</td><td><i class="stadiuminfo glyphicon glyphicon-info-sign"></i></td></tr>';
	        	$('#listStadium').html(b);
	        	$("#stadium_createStadium").modal('toggle');
	        	document.getElementById('createStadium_success').style.display = "block";
				$('#createStadium_success').delay(1500).fadeOut('slow');
	        	
	        },
				error : function(){
					alert("create stadium failed ...! ");
				}
	      });
}
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
