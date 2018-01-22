<?php
	$data = json_decode(file_get_contents("php://input"));

	include('config.php');

	$db = new DB();

	$sql = "UPDATE `resource` SET `surname` = '$data->surname', `name` = '$data->name',
  `type` = '$data->type', `hired` = '$data->hired'
  WHERE `id` = '$data->id'";

	$data = $db->qryFireR($sql);

	echo json_encode($data);
?>
