

$("#login").click(function(){
	$("#loginmodal").modal()
})


$("#profile").click(function(){
	test();
})

function test() {
    $(document).ready(function () {      
        $.ajax({
            url: "getusername",
            type: 'POST',
            success: function (result) {
                  
            }
        });

    
    });
}

//this is the id of the form
$("#loginsubmit").submit(function(e) {
	$.ajax({
           type: "POST",
           url: "login",
           contentType : "application/json;charset=UTF-8",
           dataType : "json",
           data : JSON.stringify({
        	    	'username' : $("#email1").val(),
        	    	'password' : $("#exampleInputPassword1").val()
        	    }),
           success: function(data)
           {
               alert("login success");
               document.getElementById('loginsuccess').style.display = "block";
             //  $("loginsuccess").setAttribute("display", "block");
               //profile
               document.getElementById('profile').text = data.username;
               alert(data.username);
           },
			error : function(data){
				
				alert("error!");
				alert(data);
			}
			
	
         });

});
