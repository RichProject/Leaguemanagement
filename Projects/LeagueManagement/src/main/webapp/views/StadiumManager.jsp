      <div class="container">       
		  	<table class= "table" >
		  	<thead>
					<tr>
						<th>
							<button type="button" class="btn btn-default btn-lg">Create new stadium</button>
						</th>
						<th>
							<div class="input-group">
								<input type="text" id="searchGame" class="form-control" onkeyup="filterStadiumName()" placeholder="Search...">
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
						    <th class="text-center">Detail</th>
						</tr>
				</thead>
				<tbody   id="listStadium"  class="text-center">
				</tbody>
			</table>
		  </div>
<div class="container">
		<!--Begin Modal -->
		<div class="modal fade" id="game_stadiumInfo" role="dialog">
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
						<div class="panel panel-default">

							<!-- First panel -->
							<div class="panel-heading">Overview</div>
							<div class="panel-body">
								<div class="form-group">
									<label class="control-label col-md-4 required">Ground 5 people:</label>
									<div class="col-md-8">
										<input id="stadium_ground5" type="text" class="form-control text-center" disabled >
										<span id="stadium_ground5_error" style="color: red;"></span>
									</div>
								</div>
								<div class="form-group">
									<label class="control-label col-md-4 required">Price for 5-ground:</label>
									<div class="col-md-8">
										<input id="stadium_ground5_prize" type="text" class="form-control text-center" disabled >
										<span id="stadium_ground5_prize_error" style="color: red;"></span>
									</div>
								</div>

								<div class="form-group">
									<label class="control-label col-md-4 required">Ground 7 people:</label>
									<div class="col-md-8">
										<input id="stadium_ground7" type="text" class="form-control text-center" disabled>
										<span id="stadium_ground7_error" style="color: red;"></span>
									</div>
								</div>
								<div class="form-group">
									<label class="control-label col-md-4 required">Price for 7-ground:</label>
									<div class="col-md-8">
										<input id="stadium_ground7_prize" type="text" class="form-control text-center" disabled >
										<span id="stadium_ground7_prize_error" style="color: red;"></span>
									</div>
								</div>

								<div class="form-group">
									<label class="control-label col-md-4 required">Ground 11 people:</label>
									<div class="col-md-8">
										<input id="stadium_ground11" type="text" class="form-control text-center" disabled>
										<span id="stadium_ground11_error" style="color: red;"></span>
									</div>
								</div>
								<div class="form-group">
									<label class="control-label col-md-4 required">Price for 11-ground:</label>
									<div class="col-md-8">
										<input id="stadium_ground11_prize" type="text" class="form-control text-center" disabled >
										<span id="stadium_ground7_prize_error" style="color: red;"></span>
									</div>
								</div>

								<div class="form-group">
									<label class="control-label col-md-4 required">Shop inside:</label>
									<div class="col-md-8">
										<input id="stadium_haveShop" type="text" class="form-control text-center" disabled>
										<span id="stadium_haveShop_win_error" style="color: red;"></span>
									</div>
								</div>

								<div class="form-group">
									<label class="control-label col-md-4 required">Canteen inside:</label>
									<div class="col-md-8">
										<input id="stadium_haveCanteen" type="text" class="form-control text-center" disabled>
										<span id="stadium_haveCanteen_error" style="color: red;"></span>
									</div>
								</div>
								
								<div class="form-group">
									<label class="control-label col-md-4 required">Points review:</label>
									<div class="col-md-8">
										<input id="stadium_pointReview" type="text" class="form-control text-center" disabled>
										<span id="stadium_pointReview_error" style="color: red;"></span>
									</div>
								</div>
							</div>
							
							<!-- List team panel -->
<!-- 							<div class="panel-heading">List players -->
<!-- 							</div> -->
<!-- 							<div class="panel-body" > -->
<!-- 								<table class="display " style="width: 90%; height: 65%;"> -->
<!-- 									<thead class="text-center" style="width: 10%"> -->
<!-- 										<tr > -->
<!-- 											<th class="text-center">Account ID</th> -->
<!-- 											<th class="text-center">Full name</th> -->
<!-- 											<th class="text-center">Phone</th> -->
<!-- 											<th class="text-center">Facebook</th> -->
<!-- 										</tr> -->
<!-- 									</thead> -->
<!-- 									<tbody id="game_listplayers" class="text-center"> -->
<!-- 									</tbody> -->
<!-- 								</table> -->
<!-- 							</div> -->
						</div>
						<!-- End panel-default-->
					</div>
					<!-- End Modal Body-->

					<!-- Begin Modal Footer-->
					<div class="modal-footer">
						<button type="button" class="btn btn-default" data-dismiss="modal" onClick="">Back</button>
					</div>
					<!-- End Modal Footer-->
				</div>
				<!--End Modal content-->

			</div>
		</div>
</div>


