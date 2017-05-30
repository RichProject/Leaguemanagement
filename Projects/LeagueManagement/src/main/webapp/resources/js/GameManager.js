/**
 * 
 */

function loadgame(){
	//Load list game from database
	$(document).ready(function(){
		$.ajax({
	        type: "POST",
	        url: "game",
	        contentType : "application/json;charset=UTF-8",
	        dataType : "json",
	        success: function(data)
	        {
	        	$.each(data, function(i, item) {
	        		if(item.status == "open") {
	        			var icon = '<i class="glyphicon glyphicon-ok-sign"></i>';
	        		}
	        		if(item.status == "close"){
	        			var icon = '<i class="glyphicon glyphicon-remove"></i>';
	        		}
	        		
			        		var b= $('#listGames').html()
							+ '<tr><td>'
							+ item.gameID
							+ '</td><td>'
							+ item.teamCreate.teamName
							+ '</td><td>'
							+ item.date
							+ '</td><td>'
							+ item.time
							+ '</td><td>'
							+ item.stadium.stadiumName
							+ '</td><td>'
							+ item.address
							+ '</td><td>'
							+ icon
							+ '</td><td><i class="gameinfo glyphicon glyphicon-info-sign"></i></td></tr>';
					$('#listGames').html(b);
					$(".gameinfo").bind("click", function() {
						var table = document.getElementById('gameTable');
						var rowclicked=$(this).closest('tr').index();
						gameinfo_click(data[rowclicked]);
					});
				});
	        },
				error : function(){
					alert("Load games failed ...! ");
				}
	      });
		
		
	});
}

function gameinfo_click(object){
	
	document.getElementById("game_teamName").value=object.gameID;
	document.getElementById("game_phone").value=object.teamCreate.leader.account.phoneNumber;
	document.getElementById("game_totalMatchs").value=object.teamCreate.numberOfMatch;
	document.getElementById("game_win").value=object.teamCreate.win;
	document.getElementById("game_winRate").value=object.teamCreate.winRate;
	document.getElementById("game_pointReview").value=object.teamCreate.point;
	document.getElementById("game_members").value=object.teamCreate.numberOfMem;
	$('#game_listplayers').html("");
	$.each(object.teamCreate.listPlayers, function(i, item) {
		var b= $('#game_listplayers').html()
		+ '<tr><td>'
		+ item.account.username
		+ '</td><td>'
		+ item.account.fullname
		+ '</td><td>'
		+ item.account.phoneNumber
		+ '</td><td>'
		+ '<i class="fa fa-facebook-official"></i>'
		+ '</td></tr>';
		$('#game_listplayers').html(b);
	});
	$("#game_teamInfo").modal();
	
}

function filterTeamName() {
	  var input, filter, table, tr, td, i;
	  input = document.getElementById("searchGame");
	  filter = input.value.toUpperCase();
	  table = document.getElementById("gameTable");
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
