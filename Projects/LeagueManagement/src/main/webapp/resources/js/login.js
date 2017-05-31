

//CHECK LOGIN 
$(document).ready(function(){
		if(localStorage.getItem("account") != null)
		{
		 document.getElementById('profile').text = JSON.parse(localStorage.getItem("account")).fullname;
		 document.getElementById('userfullname').style.display = "block";
		}
});

$("#login").click(function(){
	
	if(localStorage.getItem("account") == null){
		document.getElementById('errorMessage').style.display = "none";
		
		document.getElementById("loginusername").value="";
		document.getElementById("loginpassword").value="";
		$("#loginmodal").modal();
	}
	else{
		 document.getElementById('alreadyLogin').style.display = "block";
		 $('#alreadyLogin').delay(1500).fadeOut('slow');
	}
	
})

function UserProfile() {
//	document.getElementById('errorMessage').style.display = "none";

	$("#accountModal").modal();
}

function login_success(data){
	
	localStorage.setItem("account", JSON.stringify(data));
	
	document.getElementById('profile').text = JSON.parse(localStorage.getItem("account")).fullname;
	document.getElementById('userfullname').style.display = "block";
	 
    $("#loginmodal").modal('toggle');
    
    //Hiện thông Thông báo success
    document.getElementById('successMessage').style.display = "block";
    $('#successMessage').delay(2500).fadeOut('slow');
}

function register_success(data){
	
	 document.getElementById('profile').text = JSON.parse(localStorage.getItem("account")).fullname;
	 document.getElementById('userfullname').style.display = "block";
    
    //Hiện thông Thông báo success
    document.getElementById('successMessage_register').style.display = "block";
    $('#successMessage_register').delay(2500).fadeOut('slow');
}


function login_fail(){
	document.getElementById('errorMessage').style.display = "block";
}

//Login submmit
	$("#loginsubmit").submit(function(e) {
		$.ajax({
	           type: "POST",
	           url: "login",
	           contentType : "application/json;charset=UTF-8",
	           dataType : "json",
	           data : JSON.stringify({
	        	    	'username' : $("#loginusername").val(),
	        	    	'password' : $("#loginpassword").val()
	        	    }),
	           success: function(data)
	           {
	        	   login_success(data);
	           },
				error : function(){
					login_fail();
				}
	         });
	});
	

	// Registy submmit
	$("#registration-submit").submit(function(e) {
		$.ajax({
	           type: "POST",
	           url: "registy",
	           contentType : "application/json;charset=UTF-8",
	           dataType : "json",
	           data : JSON.stringify({
	        	    	'fullname' : $("#regis-fullname").val(),
	        	    	'username' : $("#regis-username").val(),
	        	    	'phoneNumber' : $("#regis-phoneNumber").val(),
	        	    	'password' : $("#regis-password").val()
	        	    }),
	           success: function(data)
	           {
	        	   register_success(data);
	           },
				error : function(data){
					 alert("Registy error");
				}
	         });
	
	});

function Logout(){
	localStorage.removeItem("account");
	document.getElementById('userfullname').style.display = "none";
}