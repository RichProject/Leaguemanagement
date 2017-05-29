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
							+ item.stadium
							+ '</td><td>'
							+ item.address
							+ '</td><td>'
							+ item.status
							+ '</td><td><i class="gameinfo glyphicon glyphicon-info-sign"></i> <i class="leadercontact glyphicon glyphicon-earphone"></i></td></tr>';
					// alert(b);
					$('#listGames').html(b);

					$(".gameinfo").bind("click", function() {
						
					//
						var table = document.getElementById('mytable');
						var rowclicked=$(this).closest('tr').index()+1;
				        var teamId = table.rows[rowclicked].cells[1].innerHTML;
						gameinfo_click(teamId,data);
					});

					$(".leadercontact").bind("click", function() {
						var table = document.getElementById('mytable');
						var rowclicked=$(this).closest('tr').index()+1;
				        var teamId = table.rows[rowclicked].cells[1].innerHTML;
						gameinfo_click(teamId,data);
					});
				});
	        },
				error : function(){
					alert("Load games failed ...! ");
				}
	      });
		
		
	});
}

function gameinfo_click(teamId){
	$("#game_teamInfo").modal();
	//alert(teamId);
}

function leadercontact_click(){
	alert("function leader contead clicked");
}
