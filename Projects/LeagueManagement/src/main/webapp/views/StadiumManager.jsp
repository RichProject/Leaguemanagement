      <div class="container">       
		  	<table class= "table" >
		  	<thead>
					<tr>
						<th>
							<button type="button" class="btn btn-default btn-lg">Create new stadium</button>
						</th>
						<th>
							<div class="input-group">
								<input type="text" id="searchStadium" class="form-control" onkeyup="filterStadiumName()" placeholder="Search...">
								<span class="input-group-btn">
								<button class="btn btn-default" type="button"><i class="glyphicon glyphicon-search"></i></button>
								</span>
							</div>
						</th>			
					</tr>
				</thead>
		  	</table>
		  	<table class="table" id="stadiumTable">
				<thead>
	 				<tr>
						    <th class="text-center">Stadium ID</th>
						    <th class="text-center">Stadium name</th>
						    <th class="text-center">Address</th>
						    <th class="text-center">District</th>
						    <th class="text-center">Ward</th>
						    <th class="text-center">Status</th>
						    <th class="text-center">Phone</th>
						    <th class="text-center">Owner</th>
						     <th class="text-center">Review</th>
						    <th class="text-center">Detail</th>
						</tr>
				</thead>
				<tbody   id="listStadium"  class="text-center">
				</tbody>
			</table>
		  </div>
<div class="container">
		<!--Begin Modal -->
		<div class="modal fade" id="stadium_stadiumInfo" role="dialog">
			<div class="modal-dialog">

				<!--Begin Modal content-->
				<div class="modal-content">

					<!-- Begin Modal Header-->
					<div class="modal-header">
						<button type="button" class="close" data-dismiss="modal">&times;</button>
						<h4 class="modal-title">Stadium info</h4>
					</div>
					<!-- End Modal Header-->

					<!-- Begin Modal Body-->
					<div class="modal-body">
						<div class="panel panel-info text-center">

							<!-- First panel -->
							<div class="panel-heading">Overview</div>


							<div class="panel-body">
								<form class="form-horizontal">
									<div class="row">
										<div class="col-md-6">
											<div class="form-group">

											<label class="control-label col-md-8 required">Ground-5:</label>
												<div class="col-md-4">
													<input id="stadium_ground5" type="text" class="form-control text-center" readonly>
													<span id="stadium_ground5_error" style="color: red;"></span>
												</div>
											</div>
										</div>

										<div class="col-md-6">
											<div class="form-group">
												<label class="control-label col-md-4 required">Price:</label>
												<div class="col-md-6">
													<input id="stadium_ground5_prize" type="text" class="form-control text-center" readonly >
													<span id="stadium_ground5_prize_error" style="color: red;"></span>
												</div>
											</div>
										</div>
									</div>


									<div class="row">
										<div class="col-md-6">
											<div class="form-group">

											<label class="control-label col-md-8 required">Ground-7:</label>
												<div class="col-md-4">
													<input id="stadium_ground7" type="text" class="form-control text-center" readonly >
													<span id="stadium_ground7_error" style="color: red;"></span>
												</div>
											</div>
										</div>

										<div class="col-md-6">
											<div class="form-group">
												<label class="control-label col-md-4 required">Price:</label>
												<div class="col-md-6">
													<input id="stadium_ground7_prize" type="text" class="form-control text-center" readonly >
													<span id="stadium_ground7_prize_error" style="color: red;"></span>
												</div>
											</div>
										</div>
									</div>


									<div class="row">
										<div class="col-md-6">
											<div class="form-group">

											<label class="control-label col-md-8 required">Ground-11:</label>
												<div class="col-md-4">
													<input id="stadium_ground11" type="text" class="form-control text-center" readonly >
													<span id="stadium_ground11_error" style="color: red;"></span>
												</div>
											</div>
										</div>

										<div class="col-md-6">
											<div class="form-group">
												<label class="control-label col-md-4 required">Price:</label>
												<div class="col-md-6">
													<input id="stadium_ground11_prize" type="text" class="form-control text-center" readonly >
													<span id="stadium_ground11_prize_error" style="color: red;"></span>
												</div>
											</div>
										</div>
									</div>
									
									<div class="form-group">
										<label class="control-label col-md-4 required">Shop inside:</label>
										<div class="col-md-7">
											<input id="stadium_haveShop" type="text" class="form-control text-center" readonly>
											<span id="stadium_haveShop_win_error" style="color: red;"></span>
										</div>
									</div>

									<div class="form-group">
										<label class="control-label col-md-4 required">Canteen inside:</label>
										<div class="col-md-7">
											<input id="stadium_haveCanteen" type="text" class="form-control text-center" readonly>
											<span id="stadium_haveCanteen_error" style="color: red;"></span>
										</div>
									</div>

								</form>
							</div>
							
							
						</div>
						<!-- End panel-default-->
					</div>
					<!-- End Modal Body-->

					<!-- Begin Modal Footer-->
					<div class="modal-footer">
						<button type="button" class="btn btn-primary" data-dismiss="modal" onClick="">Back</button>
					</div>
					<!-- End Modal Footer-->
				</div>
				<!--End Modal content-->

			</div>
		</div>
	</div>

