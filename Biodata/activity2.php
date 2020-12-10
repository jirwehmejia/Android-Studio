<!DOCTYPE html>
<html>
<head>
	<title>Activity 2</title>
</head>
<link rel="stylesheet" type="text/css" href="style/style.css">
<body>

	<center>
		<form method="POST" action="activity2.php">
			<table cellpadding="10" cellspacing="3">
				<tr>
					<th colspan="2" class="header">BIODATA</th>
				</tr>
				<tr>
					<td colspan="2">Name: <br><input class="input1" type="text" name="name"></td>
				</tr>
				<tr>
					<td colspan="2">Present Address: <br><input class="input1" type="text" name="preadd"></td>
				</tr>
				<tr>
					<td colspan="2">Permanent Address: <br><input class="input1" type="text" name="peradd"></td>
				</tr>
				<tr>
					<td>Date of Birth: <br><input style="width: 80%;" class="input1" type="text" name="DOB"></td>
					<td>Religion: <br><input type="text" name="religion"></td>
				</tr>
				<tr>
					<td>Civil Status: <br><input style="width: 80%;" class="input1" type="text" name="CS"></td>
					<td>Age: <br><input type="text" name="age"></td>
				</tr>
				<tr>
					<td>Citizenship: <br><input style="width: 80%;" class="input1" type="text" name="citizenship"></td>
					<td>Weight: <br><input type="text" name="weight"></td>
				</tr>
				<tr>
					<td>Place of Birth: <br><input style="width: 80%;" class="input1" type="text" name="POB"></td>
					<td>Height: <br><input type="text" name="height"></td>
				</tr>
				<tr>
					<td colspan="2">Name of Father: <br><input class="input1" type="text" name="father"></td>
				</tr>
				<tr>
					<td colspan="2">Name of Mother: <br><input class="input1" type="text" name="mother"></td>
				</tr>
				<tr>
					<td colspan="2">Address: <br><input class="input1" type="text" name="address"></td>
				</tr>
				<tr>
					<td colspan="2">Languages or Dialects Spoken: <br><input class="input1" type="text" name="LD"></td>
				</tr>
				<tr>
					<td colspan="2">Person to be notified In Case of Emergency: <br>
						<input class="input1" type="text" name="PN"></td>
				</tr>
				<tr>
					<th colspan="2" class="header2">
						EDUCATIONAL BACKGROUND:
					</th>
				</tr>
				<tr>
					<td>Elementary: <br><input style="width: 80%;" class="input1" type="text" name="elementary"></td>
					<td>Year Graduated: <br><input type="text" name="EG"></td>
				</tr>
				<tr>
					<td>High School: <br><input style="width: 80%;" class="input1" type="text" name="HS"></td>
					<td>Year Graduated: <br><input type="text" name="HSG"></td>
				</tr>
				<tr>
					<td>College:<br> <input style="width: 80%;" class="input1" type="text" name="college"></td>
					<td>Year Graduated: <br><input type="text" name="CG"></td>
				</tr>
				<tr>
					<td colspan="2">Course: <br><input class="input1" type="text" name="course"></td>
				</tr>
				<tr>
					<td colspan="2">Special Skills: <br><input class="input1" type="text" name="skills"></td>
				</tr>
				<tr>
					<td colspan="2">
						<center>
						<input class="button" type="submit" name="submit">
						</center>
					</td>
				</tr>
			</table>
			</form>
	</center>
																		<br>				<br>
	<center>
		<?php
			if(isset($_POST['submit'])) {
				$name = $_POST['name'];
				$preadd = $_POST['preadd'];
				$peradd = $_POST['peradd'];
				$DOB = $_POST['DOB'];
				$religion = $_POST['religion'];
				$CS = $_POST['CS'];
				$age = $_POST['age'];
				$citizenship = $_POST['citizenship'];
				$weight = $_POST['weight'];
				$POB = $_POST['POB'];
				$height = $_POST['height'];
				$father = $_POST['father'];
				$mother = $_POST['mother'];
				$address = $_POST['address'];
				$LD = $_POST['LD'];
				$PN = $_POST['PN'];
				$elementary = $_POST['elementary'];
				$EG = $_POST['EG'];
				$HS = $_POST['HS'];
				$HSG = $_POST['HSG'];
				$college = $_POST['college'];
				$CG = $_POST['CG'];
				$course = $_POST['course'];
				$skills = $_POST['skills'];
				
										}
		?>

		<table>
			<th colspan="2">BIODATA</th>
			<tr>
				<td colspan="2"><?php echo "Name: " . $name; ?></td>
			</tr>
			<tr>
				<td colspan="2">
					<?php echo "Present Address: ".$preadd; ?>
				</td>
			</tr>
			<tr>
				<td colspan="2"><?php echo "Permanent Address: " . $peradd; ?></td>
			</tr>
			<tr>
				<td><?php echo "Date of Birth: " . $DOB; ?></td>
				<td><?php echo "Religion: " . $religion; ?></td>
			</tr>
			<tr>
				<td>
					<?php echo "Civil Status: ".$CS; ?>
				</td>
				<td>
					<?php echo "Age: ".$age; ?>
				</td>
			</tr>
			<tr>
				<td>
					<?php echo "Citizenship: ".$citizenship; ?>
				</td>
				<td>
					<?php echo "Weight: ".$weight; ?>
				</td>
			</tr>
			<tr>
				<td>
					<?php echo "Place of Birth: ".$POB; ?>
				</td>
				<td>
					<?php echo "Height: ".$height; ?>
				</td>
			</tr>
			<tr>
				<td colspan="2">
					<?php echo "Name of Father: ".$father; ?>
				</td>
			</tr>
			<tr>
				<td colspan="2">
					<?php echo "Name of Mother: ".$mother; ?>
				</td>
			</tr>
			<tr>
				<td colspan="2">
					<?php echo "Address: ".$address; ?>
				</td>
			</tr>
			<tr>
				<td colspan="2">
					<?php echo "Languages or Dialects Spoken: ".$LD; ?>
				</td>
			</tr>
			<tr>
				<td colspan="2">
					<?php echo "Person to be notified In Case of Emergency: ".$PN; ?>
				</td>
			</tr>
			<th class="header2" colspan="2">EDUCATIONAL BACKGROUND: </th>
			<tr>
				<td>
					<?php echo "Elementary: ".$elementary; ?>
				</td>
				<td>
					<?php echo "Year Graduated: ".$EG; ?>
				</td>
			</tr>
			<tr>
				<td>
					<?php echo "High School: ".$HS; ?>
				</td>
				<td>
					<?php echo "Year Graduated: ".$HSG; ?>
				</td>
			</tr>
			<tr>
				<td>
					<?php echo "College: ".$college; ?>
				</td>
				<td>
					<?php echo "Year Graduated: ".$CG; ?>
				</td>
			</tr>
			<tr>
				<td colspan="2">
					<?php echo "Course: ".$course; ?>
				</td>
			</tr>
			<tr>
				<td colspan="2">
					<?php echo "Special Skills: ".$skills; ?>
				</td>
			</tr>
		</table>
	</center>


</body>
</html>