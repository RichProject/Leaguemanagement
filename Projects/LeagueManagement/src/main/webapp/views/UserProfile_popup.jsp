<div class="container">
		<!--Begin Modal -->
		<div class="modal fade" id="accountModal" role="dialog">
			<div class="modal-dialog">

				<!--Begin Modal content-->
				<div class="modal-content">

					<!-- Begin Modal Header-->
					<div class="modal-header">
						<button type="button" class="close" data-dismiss="modal">&times;</button>
						<h4 class="modal-title">User Profile</h4>
					</div>
					<!-- End Modal Header-->
					<div class="modal-body"> <!-- Begin Modal Body-->
						<div class="panel panel-default">
							<!-- First panel -->
							<div class="panel-heading">Profile</div>
							<div class="panel-body">
								<div class="form-group">
									<label class="control-label col-md-4 required">Fullname
										:</label>
									<div class="col-md-8">
										<input id="fullname" type="text" class="form-control">
										<span id="name_error" style="color: red;"></span>
									</div>
								</div>
									<label class="control-label col-md-4 required">Phone Number
										:</label>
									<div class="col-md-8">
										<input id="phoneNumber" type="text" class="form-control">
										<span id="name_error" style="color: red;"></span>
									</div>
								<div class="form-group">
									<label class="control-label col-md-4 required">Address
										:</label>
									<div class="col-md-8">
										<input id="fullname" type="text" class="form-control">
										<span id="name_error" style="color: red;"></span>
									</div>
								</div>
						</div>
					</div> <!-- End Modal Body-->
					<!-- Begin Modal Footer-->
					<div class="modal-footer">
						<button type="button" class="btn btn-info save-btn"
							data-dismiss="modal" onClick="btnLuu()">Save</button>
						<button type="button" class="btn btn-default" data-dismiss="modal" onClick="btnLuu()">Cancel</button>
					</div>
					<!-- End Modal Footer-->
				</div>
				<!--End Modal content-->
			</div>
		</div>
		</div>
</div>