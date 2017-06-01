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
				        		var c= $('#listGames').html()
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
								+ item.stadium.address
								+ '</td><td>'
								+ icon
								+ '</td><td><i class="gameinfo glyphicon glyphicon-info-sign"></i></td></tr>';
						$('#listGames').html(c);
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
		
		
		//Load stadium
		$.ajax({
	        type: "POST",
	        url: "stadium",
	        contentType : "application/json;charset=UTF-8",
	        dataType : "json",
	        success: function(data) 
	        {
	        	
	        		$('#choose_stadium').empty();
	        		$.each(data, function(i, item) {
	    				$('#choose_stadium').append($('<option>', {
	    					value : item.stadiumID,
	    					text : item.stadiumName
	    				}));
	    			});
	        		$('#choose_stadium').append($('<option>', {
	    				value : "other",
	    				text : "Other Stadium..."
	    			}));
	        },
				error : function(){
					alert("Load stadium failed ...! ");
				}
	      });
		
		$("#choose_stadium").on("change", function() {
			if ($("#choose_stadium").find(":selected").val() == "other") {
//				$("#otherStadium").disabled=false;
				document.getElementById("otherStadium").disabled = false;
			}
			else{
				document.getElementById("otherStadium").disabled = true;
			}
		});

		
	});
}

function gameinfo_click(object){
//	var object2 = localStorage.getItem("account");
//	;console.log('test account storage: ', JSON.parse(object2));
//	alert( JSON.parse(object2).username);
	document.getElementById("game_teamName").value=object.teamCreate.teamName;
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

function game_check_login(){
	if(login_checklogin() == false){
		$("#loginmodal").modal();
	}
	else {
		loadTeamByAccount();
		$("#game_createGame").modal();
	}
}


function loadTeamByAccount(){
	var username = JSON.parse(localStorage.getItem("account")).username;
	$.ajax({
        type: "POST",
        url: "getPlayerByAccount",
        contentType : "application/json;charset=UTF-8",
        dataType : "json",
        data : username,
        success: function(data) 
        {
        		$('#game_teamName').empty();
        		$.each(data.listTeams, function(i, item) {
    				$('#game_teamName').append($('<option>', {
    					value : item.teamID,
    					text : item.teamName
    				}));
    			});
  
        },
			error : function(){
				alert("Load player-team failed ...! ");
			}
      });
	
//	$('#game_teamName').empty();
//	$.each(data, function(i, item) {
//		$('#game_teamName').append($('<option>', {
//			value : item.stadiumID,
//			text : item.stadiumName
//		}));
//	});
}