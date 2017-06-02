<style type="text/css">
   table { page-break-inside:auto }
   tr    { page-break-inside:avoid; page-break-after:auto }
</style>
 <div class="container">       
		  	<table class= "table" >
		  	<thead>
					<tr>
						<th>
							<div class="input-group">
								<input type="text" id="searchPlayer"  class="form-control"  onkeyup="filterPlayerName()" placeholder="Search...">
								<span class="input-group-btn">
								<button class="btn btn-default" type="button"><i class="glyphicon glyphicon-search"></i></button>
								</span>
							</div>
						</th>			
					</tr>
				</thead>
		  	</table>
		  	<table class="table" id="playerTable">
				<thead>
	 				<tr>
						    <th class="text-center">Player ID</th>
						    <th class="text-center">Full Name</th>
						    <th class="text-center">Birthday</th>
						    <th class="text-center">Position</th>
						    <th class="text-center">Address</th>
						    <th class="text-center">Win rate</th>
						    <th class="text-center">Phone number</th>
						</tr>
				</thead>
				<tbody   id="listPlayers" class="text-center">
				</tbody>
			</table>
		  </div>