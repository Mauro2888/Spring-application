<?php
	$data = json_decode(file_get_contents("php://input"));

	include('config.php');

	$db = new DB();

	$sql = "INSERT INTO `project` (`name_project`, `start_project`, `deadline`, `status`, `nsenior`, `njunior`)
	VALUES('$data->name_project','$data->start_project','$data->deadline','$data->status','$data->nsenior','$data->njunior')";
	$data = $db->qryFireP($sql);

	echo json_encode($data);

?>
