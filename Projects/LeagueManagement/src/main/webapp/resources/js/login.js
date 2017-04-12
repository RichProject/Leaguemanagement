

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
	alert("success");
	var username_password = {
    	'username' : $("#email1").val(),
    	'password' : $("#exampleInputPassword1").val()
    };
	alert(username_password.password);
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
        	   console.log(data);
               alert(data);
           },
			error : alert(" asdasdsad error")
			
	
         });

});
