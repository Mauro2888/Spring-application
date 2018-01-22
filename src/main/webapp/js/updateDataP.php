<?php
	$data = json_decode(file_get_contents("php://input"));

	include('config.php');

	$db = new DB();

	$sql = "UPDATE `project` SET `name_project` = '$data->name_project',`start_project` = '$data->start_project',
	`deadline` = '$data->deadline',`status` = '$data->status',`nsenior` = '$data->nsenior',`njunior` = '$data->njunior'
	WHERE `id` = '$data->id'";

	$data = $db->qryFireP($sql);

	echo json_encode($data);
?>
