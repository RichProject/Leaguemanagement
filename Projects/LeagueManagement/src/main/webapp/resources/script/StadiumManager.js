/**
 * 
 */
//function loadstadium(){
//	alert("Load stadium failed ...! ");
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
							+ item.stadiumName
							+ '</td><td>'
							+ item.address
							+ '</td><td>'
							+ item.district
							+ '</td><td>'
							+ getStar(item.pointReview)
							+ '</td><td><i class="stadiuminfo fa fa-info" style="color: teal"></i>'
							+ '</td><td> <a class="w3-button w3-xlarge w3-circle w3-teal"  style="color: teal;font-size: 12px!important;" ><i class="fa fa-check"></i></a></td></tr>';
					$('#listStadium').html(b);
					$(".stadiuminfo").bind("click", function() {
						var table = document.getElementById('stadiumTable');
						var rowclicked=$(this).closest('tr').index();
						stadiuminfo_click(data[rowclicked]);
					});
				});
	        	 var pager = new Pager('results', 3);
	             pager.init();
	             pager.showPageNav('pager', 'pageNavPosition');
	             pager.showPage(1);
	        },
				error : function(){
					alert("Load stadium failed ...! ");
				}
	      });
		
		
	});
//}

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
			starString=starString +'<i class="fa fa-star" aria-hidden="true" style="color:teal"></i>';
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
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
//<![CDATA[
function Pager(tableName, itemsPerPage) {
    this.tableName = tableName;
    this.itemsPerPage = itemsPerPage;
    this.currentPage = 1;
    this.pages = 0;
    this.inited = false;
   
    this.showRecords = function(from, to) {      
        var rows = document.getElementById(tableName).rows;
        // i starts from 1 to skip table header row
        for (var i = 1; i < rows.length; i++) {
            if (i < from || i > to)
                rows[i].style.display = 'none';
            else
                rows[i].style.display = '';
        }
    }
   
    this.showPage = function(pageNumber) {
          if (! this.inited) {
                   alert("not inited");
                   return;
          }
        var oldPageAnchor = document.getElementById('pg'+this.currentPage);
        oldPageAnchor.className = 'pg-normal';
       
        this.currentPage = pageNumber;
        var newPageAnchor = document.getElementById('pg'+this.currentPage);
        newPageAnchor.className = 'pg-selected';
       
        var from = (pageNumber - 1) * itemsPerPage + 1;
        var to = from + itemsPerPage - 1;
        this.showRecords(from, to);
    }  
   
    this.prev = function() {
        if (this.currentPage > 1)
            this.showPage(this.currentPage - 1);
    }
   
    this.next = function() {
        if (this.currentPage < this.pages) {
            this.showPage(this.currentPage + 1);
        }
    }                      
   
    this.init = function() {
        var rows = document.getElementById(tableName).rows;
        var records = (rows.length - 1);
        this.pages = Math.ceil(records / itemsPerPage);
        this.inited = true;
    }
    this.showPageNav = function(pagerName, positionId) {
          if (! this.inited) {
                   alert("not inited");
                   return;
          }
          var element = document.getElementById(positionId);
         
          var pagerHtml = '<span onclick="' + pagerName + '.prev();" class="pg-normal"> &#171 Prev </span> | ';
        for (var page = 1; page <= this.pages; page++)
            pagerHtml += '<span id="pg' + page + '" class="pg-normal" onclick="' + pagerName + '.showPage(' + page + ');">' + page + '</span> | ';
        pagerHtml += '<span onclick="'+pagerName+'.next();" class="pg-normal"> Next &#187;</span>';          
       
        element.innerHTML = pagerHtml;
    }
}