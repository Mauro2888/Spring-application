<?php
	$data = json_decode(file_get_contents("php://input"));

	include('config.php');

	$db = new DB();
	$ass = 0;
	$sql = "INSERT INTO `resource` (`surname`, `name`, `type`, `hired`, `assigned`)
	VALUES('$data->surname','$data->name','$data->type','$data->hired','$ass->assigned')";
	$data = $db->qryFireR($sql);

	echo json_encode($data);

?>
