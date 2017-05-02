/**
 * 
 */
$(document).ready(function(){
	//Login submmit
	$("#loginsubmit").submit(function(e) {
		$.ajax({
	           type: "POST",
	           url: "login_bt2",
	           contentType : "application/json;charset=UTF-8",
	           dataType : "json",
	           data : JSON.stringify({
	        	    	'username' : $("#loginPhone").val(),
	        	    	'password' : $("#loginpassword").val()
	        	    }),
	           success: function(data)
	           {
	        	   var login_time = data.logintime;
	        	   if(login_time==0) 
	        		   alert("Chào mừng lần đầu tiên bạn đến với website");
	        	   else{
	        		   alert("Chào mừng bạn đã trở lại");
	        		   if(login_time==4)  alert("Chúc mừng bạn đã nhận được một voucher");
	        	   }
	        	   //Hiện thẻ li, tên người dùng
	               document.getElementById('userfullname').style.display = "block";
	               //Set tên user 
	               document.getElementById('profile').text = data.fullname;
	               //Ẩn cái popup đăng nhập
	               $("#loginmodal").modal('toggle');
	               
	               //Hiện thông Thông báo success
	               document.getElementById('successMessage').style.display = "block";
	               $('#successMessage').delay(2500).fadeOut('slow');
	           },
				error : function(data){
					
					 alert("error_bt2");
					//document.getElementById('errorMessage').style.display = "block";
				}
	         });
	});
})