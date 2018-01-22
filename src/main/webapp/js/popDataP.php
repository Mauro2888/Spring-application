<?php
	include('config.php');

	$db = new DB();

	$data = $db->qryFireP();

	echo json_encode($data);

?>
