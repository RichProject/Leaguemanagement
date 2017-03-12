function resetstorefield() {
	$('#storename').val("");
	$('#storedis').val("");
}
function resetAccountfield() {
		$('#hovaten').val("");
		$('#sodienthoai').val("");
		$('#ngaysinh').val("");
		$('#socmnd').val("");
		$('#sonha').val("");
		$('#tinhthanh').val("");
		$('#quan').val("");
		$('#phuong').val("");
		$('#tentaikhoan').val("");
		$('#email').val("");
		$('#taikhoanchu').val("");
		
		
}
function addstore() {

	var storename = document.getElementById("storename").value;
	var storedis = document.getElementById("storedis").value;
	if ((storename != null) && (storedis != null)) {
		var a = $('#liststore').html();
		// alert(a);
		var b = a
				+ '<tr><td>'
				+ storename
				+ '</td><td>'
				+ storedis
				+ '</td><td><i class="btdelete glyphicon glyphicon-trash"></i></td></tr>';
		// alert(b);
		$('#liststore').html(b);
		$(".btdelete").bind("click", function() {
			$(this).parent().parent().remove();
		});
	}

	resetstorefield();
	
}

function loadliststore() {

}
function showpopupaddaccount() {
	resetAccountfield();
	$(document).ready(function() {
		$('#accountModal').modal('show');
	});

}
function btnLuu(){
	resetstorefield();
	resetAccountfield();
	
}