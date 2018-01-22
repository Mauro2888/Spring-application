<?php
	define("__HOST__", "localhost");
	define("__USER__", "root");
	define("__PASS__", "root");
	define("__BASE__", "resources");

	class DB {
		private $con = false;
		private $data = array();

		public function __construct() {
			$this->con = new mysqli(__HOST__, __USER__, __PASS__, __BASE__);

			if($this->con->connect_error) {
				die("DB connection failed:" . $con->connect_error);
			}
		}

		public function qryPopP() {
			$sql = "SELECT * FROM `project` ORDER BY `id` DESC";
			$qry = $this->con->query($sql);
			if($qry->num_rows > 0) {
				while($row = $qry->fetch_object()) {
					$this->data[] = $row;
				}
			} else {
				$this->data[] = null;
			}
		}

		public function qryPopRiep() {
			$sql = "SELECT * FROM `project` WHERE `id`=1";
			$qry = $this->con->query($sql);
			if($qry->num_rows > 0) {
				while($row = $qry->fetch_object()) {
					$this->data[] = $row;
				}
			} else {
				$this->data[] = null;
			}
		}

		public function qryPopR() {
			$sql = "SELECT * FROM `resource` ORDER BY `id` DESC";
			$qry = $this->con->query($sql);
			if($qry->num_rows > 0) {
				while($row = $qry->fetch_object()) {
					$this->data[] = $row;
				}
			} else {
				$this->data[] = null;
			}
		}
		public function qryAssignedR() {
			$sql = "SELECT * FROM `employement` ORDER BY `id` DESC";
			$qry = $this->con->query($sql);
			if($qry->num_rows > 0) {
				while($row = $qry->fetch_object()) {
					$this->data[] = $row;
				}
			} else {
				$this->data[] = null;
			}
		}



		public function qryFireP($sql=null) {
			if($sql) $this->con->query($sql);
			$this->qryPopP();
			$this->con->close();
			return $this->data;
		}

		public function qryFireRiep($sql=null) {
			if($sql) $this->con->query($sql);
			$this->qryPopRiep();
			$this->con->close();
			return $this->data;
		}

		public function qryFireR($sql=null) {
			if($sql) $this->con->query($sql);
			$this->qryPopR();
			$this->con->close();
			return $this->data;
		}
		public function qryAssignR($sql=null,$sql1=null) {
			if($sql) $this->con->query($sql);$this->con->query($sql1);
			$this->qryAssignedR();
			$this->qryAssONE();
			$this->con->close();
			return $this->data;
		}
		public function qryFireFR($sql=null) {
			if($sql) $this->con->query($sql);
			$this->qryPopFR();
			$this->con->close();
			return $this->data;
		}
		public function qryPopFR() {
			$sql = "SELECT * FROM `resource` WHERE `assigned`= 0";
			$qry = $this->con->query($sql);
			if($qry->num_rows > 0) {
				while($row = $qry->fetch_object()) {
					$this->data[] = $row;
				}
			} else {
				$this->data[] = null;
			}
		}

	}

?>
