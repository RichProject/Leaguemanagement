

$("#login").click(function(){
	document.getElementById('errorMessage').style.display = "none";
	$("#email1").text="";
	$("#exampleInputPassword1").text="";
	$("#loginmodal").modal();
})

function test() {
//    $(document).ready(function () {      
//        $.ajax({
//            url: "getusername",
//            type: 'POST',
//            success: function (result) {
//                  
//            }
//        });
//    });
	alert("tag a click");
}

function login_success(data){
	
	//Set session 
//	var session=var data = '@Session["UserName"]';
	//Hiện thẻ li, tên người dùng
    document.getElementById('userfullname').style.display = "block";
    //Set tên user 
    document.getElementById('profile').text = data.fullname;
    //Ẩn cái popup đăng nhập
    $("#loginmodal").modal('toggle');
    
    //Hiện thông Thông báo success
    document.getElementById('successMessage').style.display = "block";
    $('#successMessage').delay(2500).fadeOut('slow');
}

function register_success(data){
//	//Set session 
////	var session=var data = '@Session["UserName"]';
//	//Hiện thẻ li, tên người dùng
//    document.getElementById('userfullname').style.display = "block";
//    //Set tên user 
//    document.getElementById('profile').text = data.fullname;
    //Ẩn cái popup đăng nhập
    $("#loginmodal").modal('toggle');
    
    //Hiện thông Thông báo success
    document.getElementById('successMessage_register').style.display = "block";
    $('#successMessage_register').delay(2500).fadeOut('slow');
}

function login_fail(){
	document.getElementById('errorMessage').style.display = "block";
}
$(document).ready(function(){
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
})