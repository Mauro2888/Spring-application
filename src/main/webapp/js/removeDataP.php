<?php

	$data = json_decode(file_get_contents("php://input"));

	include('config.php');

	$db = new DB();

	$sql = "DELETE FROM `project` WHERE `id` = $data->id";

	$data = $db->qryFireP($sql);

	echo json_encode($data);

?>
