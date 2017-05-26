/**
 * 
 */


//Load list game from database
$document.ready(function(){
	
	$.ajax({
        type: "POST",
        url: "game",
        contentType : "application/json;charset=UTF-8",
        dataType : "json",
        success: function(data)
        {
        	loadgamesuccess(data);
        },
			error : function(){
				alert("Load games failed ...! ");
			}
      });
	
	
});


function loadgamesuccess(data){
	
}
