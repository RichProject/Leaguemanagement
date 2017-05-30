function loadplayer(){
	//Load list game from database
	$(document).ready(function(){
		$.ajax({
	        type: "POST",
	        url: "player",
	        contentType : "application/json;charset=UTF-8",
	        dataType : "json",
	        success: function(data)
	        {
	        	$.each(data, function(i, item) {
			        		var b= $('#listPlayers').html()
							+ '<tr><td>'
							+ item.username
							+ '</td><td>'
							+ item.account.fullname
							+ '</td><td>'
							+ item.account.birthday
							+ '</td><td>'
							+ item.position
							+ '</td><td>'
							+ item.account.address
							+ '</td><td>'
							+ item.winRate
							+ '</td><td><i class="playerinfo glyphicon glyphicon-info-sign"></i> <i class="playercontact glyphicon glyphicon-earphone"></i></td></tr>';
					// alert(b);
					$('#listPlayers').html(b);

					$(".playerinfo").bind("click", function() {
						
						
						alert("player info clicked");
					//
//						var table = document.getElementById('playerTable');
//						var rowclicked=$(this).closest('tr').index()+1;
//				        var teamId = table.rows[rowclicked].cells[1].innerHTML;
//						gameinfo_click(teamId,data);
					});

					$(".playercontact").bind("click", function() {
						
						alert("player contact clicked");
//						var table = document.getElementById('playerTable');
//						var rowclicked=$(this).closest('tr').index()+1;
//				        var teamId = table.rows[rowclicked].cells[1].innerHTML;
//						gameinfo_click(teamId,data);
					});
				});
	        },
				error : function(){
					alert("Load games failed ...! ");
				}
	      });
		
		
	});
}