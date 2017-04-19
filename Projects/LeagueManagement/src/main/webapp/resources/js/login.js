

$("#login").click(function(){
	document.getElementById('errorMessage').style.display = "none";
	$("#email1").text="";
	$("#exampleInputPassword1").text="";
	$("#loginmodal").modal();
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
               document.getElementById('loginsuccess').style.display = "block";
               document.getElementById('profile').text = data.fullname;
               $("#loginmodal").modal('toggle');
               document.getElementById('successMessage').style.display = "block";
               $('#successMessage').delay(2500).fadeOut('slow');
           },
			error : function(data){
				document.getElementById('errorMessage').style.display = "block";
			}
			
	
         });

});
