<?php
	$data = json_decode(file_get_contents("php://input"));

	include('config.php');

	$db = new DB();

	$sql ="INSERT INTO `employement`(`id_r`, `id_p`) VALUES ('$data->id_r','$data->id_p')";

	$sql1= "UPDATE `resource` SET `assigned`= 1  WHERE `id`= '$data->id_r'";
	$data = $db->qryAssignR($sql,$sql1);
	//$data = $db->qryAssignR($sql);

	/*public function qryAssONE() {
		$sql = "UPDATE `resource` SET `assigned`= 1  WHERE `id`= '$data->id_r'";
		$qry = $this->con->query($sql);
		if($qry->num_rows > 0) {
			while($row = $qry->fetch_object()) {
				$this->data[] = $row;
			}
		} else {
			$this->data[] = null;
		}
	}*/

	//echo $sql1;
	//$data = $db->updateDataR($sql);

	echo json_encode($data);
?>
