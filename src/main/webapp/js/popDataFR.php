<?php
	include('config.php');

	$db = new DB();

	$data = $db->qryFireFR();

	echo json_encode($data);

?>
