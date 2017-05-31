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
					$('#listPlayers').html(b);

					$(".playerinfo").bind("click", function() {
						alert("player info clicked");
					});

					$(".playercontact").bind("click", function() {
						alert("player contact clicked");
					});
				});
	        },
				error : function(){
					alert("Load games failed ...! ");
				}
	      });
	});
}

function filterPlayerName() {
	  var input, filter, table, tr, td, i;
	  input = document.getElementById("searchPlayer");
	  filter = input.value.toUpperCase();
	  table = document.getElementById("playerTable");
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