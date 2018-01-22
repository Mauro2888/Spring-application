<?php
	include('config.php');

	$db = new DB();

	$data = $db->qryFireR();

	echo json_encode($data);

?>
