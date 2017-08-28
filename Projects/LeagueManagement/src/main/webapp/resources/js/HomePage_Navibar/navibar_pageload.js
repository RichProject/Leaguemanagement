/**
 * 
 */

//Change active tab in navi-bar
$(".nav a").on("click", function(){
   $(".nav").find(".active").removeClass("active");
   $(this).parent().addClass("active");
});

function index(){
	$.ajax({
		url:"/LeagueManagement/views/HomePage_Navibar/home.jsp",
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
		url:"/LeagueManagement/views/Manager/GameManager.jsp",
		type: "GET",
		dataType: 'text',
		success: function(response){
			$('.content').html(response);
			loadgame();
		},
		error: function(response){
			alert("error");
		},
	})
}
//function league(){
//	$.ajax({
//		url:"/LeagueManagement/views/GameManager.jsp",
//		type: "GET",
//		dataType: 'text',
//		success: function(response){
//			$('.content').html(response);
//		},
//		error: function(response){
//			alert("error");
//		},
//	})
//}

//Tab league page-load
function stadium(){
	$.ajax({
		url:"/LeagueManagement/views/Manager/StadiumManager.jsp",
		type: "GET",
		dataType: 'text',
		success: function(response){
			$('.content').html(response);
			loadstadium();
		},
		error: function(response){
			alert("error");
		},
	})
}

//Tab league page-load
function team(){
	$.ajax({
		url:"/LeagueManagement/views/Manager/TeamManager.jsp",
		type: "GET",
		dataType: 'text',
		success: function(response){
			$('.content').html(response);
			loadTeam();
		},
		error: function(response){
			alert("error");
		},
	})
}
function player(){
	$.ajax({
		url:"/LeagueManagement/views/Manager/PlayerManager.jsp",
		type: "GET",
		dataType: 'text',
		success: function(response){
			$('.content').html(response);
			loadplayer();
		},
		error: function(response){
			alert("error");
		},
	})
}
