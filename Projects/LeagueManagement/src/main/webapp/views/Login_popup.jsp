<!-- Large modal -->
<div class="modal fade" id="loginmodal" tabindex="-1" role="dialog"
	aria-labelledby="myLargeModalLabel" aria-hidden="true">
	<div class="modal-dialog modal-lg">
		<div class="modal-content">
			<div class="modal-header">
				<button type="button" class="close" data-dismiss="modal"
					aria-hidden="true">×</button>
				<h4 class="modal-title" id="myModalLabel">Login-Registration</h4>
			</div>
			<div class="modal-body">
				<div class="row">
					<div class="col-md-8"
						style="border-right: 1px dotted #C2C2C2; padding-right: 30px;">
						<!-- Nav tabs -->
						<ul class="nav nav-tabs">
							<li><a class="active" href="#Login1" data-toggle="tab">Login</a></li>
							<li><a href="#Registration1" data-toggle="tab">Registration</a></li>
						</ul>
						<!-- Tab panes -->
						<div class="tab-content">
							<div class="tab-pane active" id="Login1">
								<form id="loginsubmit" role="form" class="form-horizontal">
									<div class="form-group">
										<label for="email" class="col-sm-2 control-label">
											Username</label>
										<div class="col-sm-10">
											<input type="text" class="form-control" id="loginusername"
												placeholder="Email or phonenumber" />
										</div>
									</div>
									<div class="form-group">
										<label for="exampleInputPassword1"
											class="col-sm-2 control-label"> Password</label>
										<div class="col-sm-10">
											<input type="password" class="form-control"
												id="loginpassword" placeholder="Password" />
										</div>
									</div>
									<div class="row">
										<div class="col-sm-2"></div>
										<div class="col-sm-10">
											<button type="submit" class="btn btn-primary btn-sm">
												Login</button>
											<a href="javascript:;">Forgot your password?</a>
										</div>
									</div>
									<div id="errorMessage" class="alert alert-danger fade in"
										style="display: none; margin-top: 10px">
										<a href="#" class="close" data-dismiss="alert">&times;</a> <strong>Login
											failed !</strong> Username or password is incorrect. Try again...!
									</div>
								</form>
							</div>
							<div class="tab-pane" id="Registration1">
								<form id="registration-submit" role="form"
									class="form-horizontal">
									<div class="form-group">
										<label for="email" class="col-sm-2 control-label">
											Fullname</label>
										<div class="col-sm-10">
											<div class="row">
												<div class="col-md-9">
													<input id="regis-fullname" type="text" class="form-control"
														placeholder="Fullname" />
												</div>
											</div>
										</div>
									</div>
									<div class="form-group">
										<label for="mobile" class="col-sm-2 control-label">
											Mobile</label>
										<div class="col-sm-10">
											<input type="number" class="form-control"
												id="regis-phoneNumber" placeholder="Mobile" />
										</div>
									</div>
									<div class="form-group">
										<label for="username" class="col-sm-2 control-label">
											Username</label>
										<div class="col-sm-10">
											<input type="text" class="form-control" id="regis-username"
												placeholder="Username" />
										</div>
									</div>
									<div class="form-group">
										<label for="password" class="col-sm-2 control-label">
											Password</label>
										<div class="col-sm-10">
											<input type="password" class="form-control"
												id="regis-password" placeholder="Password" />
										</div>
									</div>
									<div class="form-group">
										<label for="password" class="col-sm-2 control-label">
											Confirm</label>
										<div class="col-sm-10">
											<input type="password" class="form-control"
												id="regis-repassword" placeholder="re-enter password" />
										</div>
									</div>
									<div class="row">
										<div class="col-sm-2"></div>
										<div class="col-sm-10">
											<button id="regis-btnsave" type="submit"
												class="btn btn-primary btn-sm">Save & Continue</button>
											<button id="regis-btncancel" type="button"
												class="btn btn-default btn-sm">Cancel</button>
										</div>
									</div>
									<div id="registysuccess" class="alert alert-success fade in"
										style="display: none; margin-top: 10px">
										<a href="#" class="close" data-dismiss="alert">&times;</a> <strong>
											Registy success.</strong>Please login with your account!
									</div>
									<div id="registyerror" class="alert alert-danger fade in"
										style="display: none; margin-top: 10px">
										<a href="#" class="close" data-dismiss="alert">&times;</a> <strong>
											Registy Error.</strong>Please check your info!
									</div>
								</form>
							</div>
						</div>
						<div id="OR" class="hidden-xs">OR</div>
					</div>
					<div class="col-md-4">
						<div class="row text-center sign-with">
							<div class="col-md-12">
								<h3>Sign in with</h3>
							</div>
							<div class="col-md-12">
								<div class="btn-group btn-group-justified">
									<a href="#" class="btn btn-primary">Facebook</a> <a href="#"
										class="btn btn-danger"> Google</a>
								</div>
							</div>
						</div>
					</div>
				</div>
			</div>
		</div>
	</div>
</div>
