<?php

	$data = json_decode(file_get_contents("php://input"));

	include('config.php');

	$db = new DB();

	$sql = "DELETE FROM `resource` WHERE `id` = $data->id";

	$data = $db->qryFireR($sql);

	echo json_encode($data);

?>
