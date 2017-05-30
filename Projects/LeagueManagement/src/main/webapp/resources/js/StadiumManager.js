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
	        		if(item.status == "full") {
	        			var icon = '<i class="glyphicon glyphicon-ok-sign"></i>';
	        		}
	        		if(item.status == "available"){
	        			var icon = '<i class="glyphicon glyphicon-remove"></i>';
	        		}
	        		
			        		var b= $('#listGames').html()
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
							+ '</td><td><i class="stadiuminfo glyphicon glyphicon-info-sign"></i></td></tr>';
					$('#listStadium').html(b);
					$(".stadiuminfo").bind("click", function() {
						var table = document.getElementById('stadiumTable');
						var rowclicked=$(this).closest('tr').index();
						stadiuminfo_click(data);
					});
				});
	        },
				error : function(){
					alert("Load games failed ...! ");
				}
	      });
		
		
	});
}

function stadiuminfo_click(data){
	
//	document.getElementById("game_teamName").value=object.gameID;
//	document.getElementById("game_phone").value=object.teamCreate.leader.account.phoneNumber;
//	document.getElementById("game_totalMatchs").value=object.teamCreate.numberOfMatch;
//	document.getElementById("game_win").value=object.teamCreate.win;
//	document.getElementById("game_winRate").value=object.teamCreate.winRate;
//	document.getElementById("game_pointReview").value=object.teamCreate.point;
//	document.getElementById("game_members").value=object.teamCreate.numberOfMem;
//	$('#game_listplayers').html("");
//	$.each(object.teamCreate.listPlayers, function(i, item) {
//		var b= $('#game_listplayers').html()
//		+ '<tr><td>'
//		+ item.account.username
//		+ '</td><td>'
//		+ item.account.fullname
//		+ '</td><td>'
//		+ item.account.phoneNumber
//		+ '</td><td>'
//		+ '<i class="fa fa-facebook-official"></i>'
//		+ '</td></tr>';
//		$('#game_listplayers').html(b);
//	});
//	$("#game_teamInfo").modal();
	
}