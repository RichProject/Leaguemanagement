/**
 * 
 */

function index(){
	$.ajax({
		url:"/LeagueManagement/views/home.jsp",
		type: "GET",
		dataType: 'text',
		success: function(response){
			$('.content').html(response);
		},
		error: function(response){
			alert("error");
		},
	})
}
// Tab league page-load
function game(){
	$.ajax({
		url:"/LeagueManagement/views/GameManager.jsp",
		type: "GET",
		dataType: 'text',
		success: function(response){
			$('.content').html(response);
		},
		error: function(response){
			alert("error");
		},
	})
}
function league(){
	$.ajax({
		url:"/LeagueManagement/views/GameManager.jsp",
		type: "GET",
		dataType: 'text',
		success: function(response){
			$('.content').html(response);
		},
		error: function(response){
			alert("error");
		},
	})
}

//Tab league page-load
function stadium(){
	$.ajax({
		url:"/LeagueManagement/views/StadiumManager.jsp",
		type: "GET",
		dataType: 'text',
		success: function(response){
			$('.content').html(response);
		},
		error: function(response){
			alert("error");
		},
	})
}

//Tab league page-load
function team(){
	$.ajax({
		url:"/LeagueManagement/views/TeamManager.jsp",
		type: "GET",
		dataType: 'text',
		success: function(response){
			$('.content').html(response);
		},
		error: function(response){
			alert("error");
		},
	})
}
function player(){
	$.ajax({
		url:"/LeagueManagement/views/PlayerManager.jsp",
		type: "GET",
		dataType: 'text',
		success: function(response){
			$('.content').html(response);
		},
		error: function(response){
			alert("error");
		},
	})
}
