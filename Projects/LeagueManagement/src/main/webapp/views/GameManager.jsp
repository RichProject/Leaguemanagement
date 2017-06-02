      <div class="container">       
		  	<table class= "table" >
		  	<thead>
					<tr>
						<th>
							<button type="button" class="btn btn-default btn-lg" data-toggle="modal" onClick="game_check_login();">Create new game</button>
						</th>
						<th>
							<div class="input-group">
								<input type="text" id="searchGame" class="form-control" onkeyup="filterTeamName()" placeholder="Search...">
								<span class="input-group-btn">
								<button class="btn btn-default" type="button"><i class="glyphicon glyphicon-search"></i></button>
								</span>
							</div>
						</th>			
					</tr>
				</thead>
		  	</table>
		  	<table class="table" id="gameTable">
				<thead>
	 				<tr>
						    <th class="text-center">Game ID</th>
						    <th class="text-center">Team name</th>
						    <th class="text-center">Date</th>
						    <th class="text-center">Time</th>
						    <th class="text-center">Stadium</th>
						    <th class="text-center">Address</th>
						    <th class="text-center">Status</th>
						    <th class="text-center">Detail</th>
						</tr>
				</thead>
				<tbody   id="listGames" class="text-center" >
				</tbody>
			</table>
		  </div>
		  
<div class="container">
		<!--Begin Modal -->
		<div class="modal fade" id="game_teamInfo" role="dialog">
			<div class="modal-dialog">

<!-- 				Begin Modal content -->
				<div class="modal-content">

<!-- 					Begin Modal Header -->
					<div class="modal-header">
						<button type="button" class="close" data-dismiss="modal">&times;</button>
						<h4 class="modal-title">Team info</h4>
					</div>
<!-- 					End Modal Header -->

<!-- 					Begin Modal Body -->
					<div class="modal-body">
						<div class="panel panel-default">

<!-- 							First panel -->
							<div class="panel-heading">Overview</div>
							<div class="panel-body">
								<div class="form-group">
									<label class="control-label col-md-4 required">Team Name:</label>
									<div class="col-md-8">
										<input id="game_teamName" type="text" class="form-control text-center" disabled >
										<span id="game_teamName_error" style="color: red;"></span>
									</div>
								</div>

								<div class="form-group">
									<label class="control-label col-md-4 required">Phone:</label>
									<div class="col-md-8">
										<input id="game_phone" type="text" class="form-control text-center" disabled>
										<span id="game_phone_error" style="color: red;"></span>
									</div>
								</div>

								<div class="form-group">
									<label class="control-label col-md-4 required">Total matchs:</label>
									<div class="col-md-8">
										<input id="game_totalMatchs" type="text" class="form-control text-center" disabled>
										<span id="game_played_error" style="color: red;"></span>
									</div>
								</div>

								<div class="form-group">
									<label class="control-label col-md-4 required">Games Win:</label>
									<div class="col-md-8">
										<input id="game_win" type="text" class="form-control text-center" disabled>
										<span id="game_win_error" style="color: red;"></span>
									</div>
								</div>

								<div class="form-group">
									<label class="control-label col-md-4 required">Win rate:</label>
									<div class="col-md-8">
										<input id="game_winRate" type="text" class="form-control text-center" disabled>
										<span id="game_winRate_error" style="color: red;"></span>
									</div>
								</div>
								<div class="form-group">
									<label class="control-label col-md-4 required">Members:</label>
									<div class="col-md-8">
										<input id="game_members" type="text" class="form-control text-center" disabled>
										<span id="game_members_error" style="color: red;"></span>
									</div>
								</div>
								
								<div class="form-group">
									<label class="control-label col-md-4 required">Points review:</label>
									<div class="col-md-8">
										<input id="game_pointReview" type="text" class="form-control text-center" disabled>
										<span id="game_pointReview_error" style="color: red;"></span>
									</div>
								</div>
							</div>
							
<!-- 							List team panel -->
							<div class="panel-heading">List players
							</div>
							<div class="panel-body" >
								<table class="display " style="width: 90%; height: 65%;">
									<thead class="text-center" style="width: 10%">
										<tr >
											<th class="text-center">Account ID</th>
											<th class="text-center">Full name</th>
											<th class="text-center">Phone</th>
											<th class="text-center">Facebook</th>
										</tr>
									</thead>
									<tbody id="game_listplayers" class="text-center">
									</tbody>
								</table>
							</div>
						</div>
<!-- 						End panel-default -->
					</div>
<!-- 					End Modal Body -->

<!-- 					Begin Modal Footer -->
					<div class="modal-footer">
						<button type="button" class="btn btn-default" data-dismiss="modal" onClick="">Back</button>
					</div>
<!-- 					End Modal Footer -->
				</div>
<!-- 				End Modal content -->

			</div>
		</div>
</div>



<!--CREATE GAME-->
<div class="container">
		<div class="modal fade" id="game_createGame" role="dialog">
			<div class="modal-dialog">
				<div class="modal-content">
					<div class="modal-header">
						<button type="button" class="close" data-dismiss="modal" >&times;</button>
						<h4 class="modal-title">Create Game</h4>
					</div>
					
					<div class="modal-body">
						<form class="form-horizontal">
							<div class="form-group">
								<label class="control-label col-sm-3">Team:</label>
								<div class="col-sm-8">
									<select class="form-control" id="choose_game_teamName">
										<option>Choose Team</option>
									</select>
								</div>
							</div>
							
							<div class="form-group">
								<label class="control-label col-sm-3">Stadium:</label>
								<div class="col-sm-8">
									<select class="selectpicker form-control" id="choose_stadium">
										<option>Choose Stadium</option>
									</select>
								</div>
							</div>
							
							<div class="form-group">
								<label class="control-label col-sm-3">Other Stadium:</label>
								<div class="col-sm-8">
										<input type="text" class="form-control" name="otherStadium" id="otherStadium" placeholder="Enter Other Stadium" required disabled>
								</div>
							</div>

							<div class="form-group">
								<label class="control-label col-sm-3">Date:</label>
								<div class="col-sm-8">
									<input type="date" class="form-control" name="date" id="create_game_date" required>
								</div>
							</div>
							
							
							<div class="form-group">
								<label class="control-label col-sm-3">Time:</label>
								<div>
									<div class="col-sm-3">
										<select class="form-control" id="create_game_hour" >
											<option value="-1">Minute</option>
											<option value="1">1</option>
											<option value="2">2</option>
											<option value="3">3</option>
											<option value="4">4</option>
											<option value="5">5</option>
											<option value="6">6</option>
											<option value="7">7</option>
											<option value="8">8</option>
											<option value="9">9</option>
											<option value="10">10</option>
											<option value="11">11</option>
											<option value="12">12</option>
										</select>
									</div>
									
									<div class="col-sm-3">
										<select class="form-control" id="create_game_minute">
											<option value="-1">Minute</option>
											<option value="00">00</option>
											<option value="15">15</option>
											<option value="30">30</option>
											<option value="45">45</option>
										</select>
									</div>
									
									<div class="col-sm-2" >
										<select class="form-control" id="create_game_AP">
											<option value="AM">AM</option>
											<option value="PM">PM</option>
										</select>
									</div>
								</div>
							</div>
							<div id="creategame_errorMessage" class="alert alert-danger fade in"
										style="display: none; margin-top: 10px">
										<a href="#" class="close" data-dismiss="alert">&times;</a> <strong>Create game
											failed !</strong> Please choose time or date of game...!
							</div>
						</form>
					</div>

					<div class="modal-footer">
						<button type="button" class="btn btn-primary" onClick="createGame();">Create</button>
						<button type="button" class="btn btn-default" data-dismiss="modal" onClick="">Back</button>
					</div>
				</div>
			</div>
		</div>
	</div>


