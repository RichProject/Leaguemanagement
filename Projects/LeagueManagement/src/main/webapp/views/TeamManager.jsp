
<div class="container">
	<table class="table">
		<thead>
			<tr>
				<th>
					<button type="button" class="btn btn-default btn-lg">Create
						new team</button>
				</th>
				<th>
					<div class="input-group">
						<input type="text" id="searchTeam_team" class="form-control"
							onkeyup="filterteam_TeamName()" placeholder="Search..."> <span
							class="input-group-btn">
							<button class="btn btn-default" type="button">
								<i class="glyphicon glyphicon-search"></i>
							</button>
						</span>
					</div>
				</th>
			</tr>
		</thead>
	</table>
	<table class="table" id="teamTable">
		<thead>
			<tr>
				<th class="text-center">Team ID</th>
				<th class="text-center">Team name</th>
				<th class="text-center">Leader</th>
				<th class="text-center">Point</th>
				<th class="text-center">Number of members</th>
				<th class="text-center">Number of games</th>
				<th class="text-center">Address</th>
				<th class="text-center">Win rate</th>
				<th class="text-center">Detail</th>
			</tr>
		</thead>
		<tbody id="listTeam" class="text-center">
		</tbody>
	</table>
</div>
<div class="container">
	<!--Begin Modal -->
	<div class="modal fade" id="team_members" role="dialog">
		<div class="modal-dialog">

			<!--Begin Modal content-->
			<div class="modal-content">

				<!-- Begin Modal Header-->
				<div class="modal-header">
					<button type="button" class="close" data-dismiss="modal">&times;</button>
					<h4 class="modal-title">List members</h4>
				</div>
				<!-- End Modal Header-->

				<!-- Begin Modal Body-->
				<div class="modal-body">
					<div class="panel panel-info text-center">
						<div class="panel-body">
							<form class="form-horizontal">

								<table class="table" id="team_playerList">
									<thead>
										<tr>
											<th class="text-center">Team ID</th>
											<th class="text-center">Team name</th>
										</tr>
									</thead>
									<tbody id="listPlayerinteam" class="text-center">
									</tbody>
								</table>

							</form>
						</div>


					</div>
					<!-- End panel-default-->
				</div>
				<!-- End Modal Body-->

				<!-- Begin Modal Footer-->
				<div class="modal-footer">
					<button type="button" class="btn btn-primary" data-dismiss="modal"
						onClick="">Back</button>
				</div>
				<!-- End Modal Footer-->
			</div>
			<!--End Modal content-->

		</div>
	</div>
</div>

