<div class="container-fluid">
	<!-- Second navbar for profile settings -->
	<nav class="navbar navbar-inverse">
		<div class="container">
			<!-- Brand and toggle get grouped for better mobile display -->
			<div class="navbar-header">
				<button type="button" class="navbar-toggle collapsed"
					data-toggle="collapse" data-target="#navbar-collapse-4">
					<span class="sr-only">Toggle navigation</span> <span
						class="icon-bar">a</span> <span class="icon-bar">b</span> <span
						class="icon-bar">c</span>
				</button>
				<a class="navbar-brand" href="#">League</a>
			</div>

			<!-- Collect the nav links, forms, and other content for toggling -->
			<div class="collapse navbar-collapse" id="navbar-collapse-4">
				<ul class="nav navbar-nav navbar-right">
					<li><a href="#">Home</a></li>
					<li><a href="#">Booking</a></li>
					<li><a href="#" onClick="player()">Players</a></li>
					<li><a href="#" onClick="stadium()">Stadium</a></li>
					<li><a href="#">Manager</a></li>
					<li><a href="#" onClick="league()">League</a></li>
					<li><a id="login"
						class="btn btn-default btn-outline btn-circle collapsed  "
						data-toggle="collapse" href="#" aria-expanded="false"
						aria-controls="nav-collapse4">Login | Register
					</a>
 					</li>
				</ul>
			</div>
			<!-- /.navbar-collapse -->
		</div>
		<!-- /.container -->
	</nav>
	<!-- /.navbar -->
</div>
<!-- /.container-fluid -->
<div class="bs-example">
	<div id="successMessage" class="container alert alert-success fade in "
		style="display: none; text-align: center; weight: 50%">
		<a href="" class="close" data-dismiss="alert">&times;</a> <strong>Success!</strong>
		Login successfully. Welcome to our services...!
	</div>
	<div id="alreadyLogin" class="container alert alert-warning fade in "
		style="display: none; text-align: center; weight: 50%">
		<a href="" class="close" data-dismiss="alert">&times;</a> <strong>Warning!</strong>
		You already login...!!
	</div>
	<div id="successMessage_register"
		class="container alert alert-success fade in "
		style="display: none; text-align: center; weight: 50%">
		<a href="" class="close" data-dismiss="alert">&times;</a> <strong>Success!</strong>
		Register successfully. You can use that account to login!
	</div>
	<div id="logout_success" class="container alert alert-info fade in "
		style="display: none; text-align: center; weight: 50%">
		<a href="" class="close" data-dismiss="alert">&times;</a> <strong>Info!</strong>
		You have been logout...!!
	</div>
	<div id="createGame_success"
		class="container alert alert-success fade in "
		style="display: none; text-align: center; weight: 50%">
		<a href="" class="close" data-dismiss="alert">&times;</a> <strong>Success!</strong>
		Game is created...!!
	</div>
	<div id="createStadium_success"
		class="container alert alert-success fade in "
		style="display: none; text-align: center; weight: 50%">
		<a href="" class="close" data-dismiss="alert">&times;</a> <strong>Success!</strong>
		Stadium is created...!!
	</div>

</div>
<jsp:include page="/views/HomePage_Navibar/Login_popup.jsp"></jsp:include>
<jsp:include page="/views/HomePage_Navibar/UserProfile_popup.jsp"></jsp:include>