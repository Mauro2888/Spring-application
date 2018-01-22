package com.sql.test.testSql.model;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "employement")
public class ModelEmployement {
	
	@Id
	@GeneratedValue
	
	@Column(name = "id_r")
	private int id_r;
	
	@Column(name = "id_p")
	private int id_p;
	
	
	public int getId_r() {
		return id_r;
	}

	public void setId_r(int id_r) {
		this.id_r = id_r;
	}

	public int getId_p() {
		return id_p;
	}

	public void setId_p(int id_p) {
		this.id_p = id_p;
	}
	
	
	

}
