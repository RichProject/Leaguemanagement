/**
 * 
 */function loadTeam(){
	//Load list game from database
	$(document).ready(function(){
		$.ajax({
	        type: "POST",
	        url: "team",
	        contentType : "application/json;charset=UTF-8",
	        dataType : "json",
	        success: function(data)
	        {
		        	$.each(data, function(i, item) {
//		        		if(item.status == "open") {
//		        			var icon = '<i class="glyphicon glyphicon-ok-sign"></i>';
//		        		}
//		        		if(item.status == "close"){
//		        			var icon = '<i class="glyphicon glyphicon-remove"></i>';
//		        		}
				        		var c= $('#listTeam').html()
								+ '<tr><td>'
								+ item.teamID
								+ '</td><td>'
								+ item.teamName
								+ '</td><td>'
								+ item.leader.account.fullname
								+ '</td><td>'
								+ item.point
								+ '</td><td>'
								+ item.numberOfMem
								+ '</td><td>'
								+ item.numberOfMatch
								+ '</td><td>'
								+ item.address
								+ '</td><td>'
								+ item.winRate
								+ '</td><td><i class="teaminfo glyphicon glyphicon-info-sign"></i></td></tr>';
						$('#listTeam').html(c);
						$(".teaminfo").bind("click", function() {
							var table = document.getElementById('teamTable');
							var rowclicked=$(this).closest('tr').index();
							teaminfo_click(data[rowclicked]);
						});
					});
	        	
	        },
				error : function(){
					alert("Load team failed ...! ");
				}
	      });
	});
}
 

function teaminfo_click(object) {
	$("#team_members").modal();
	$.ajax({
		type : "POST",
		url : "getPlayerByTeam",
		contentType : "application/json;charset=UTF-8",
		dataType : "json",
		data : object.teamID,
		success : function(data) {
			$('#listPlayerinteam').html("");
			$.each(data, function(i, item) {
				var c= $('#listPlayerinteam').html()
				+ '<tr><td>'
				+ item.player_id
				+ '</td><td>'
				+ item.player_fullname
				+ '</td></tr>';
				$('#listPlayerinteam').html(c);
			});
			
		},
		error : function(){
		alert("Load player_team failed ...! ");
	}
	});
}

function filterteam_TeamName() {
	  var input, filter, table, tr, td, i;
	  input = document.getElementById("searchTeam_team");
	  filter = input.value.toUpperCase();
	  table = document.getElementById("teamTable");
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
	
 
 