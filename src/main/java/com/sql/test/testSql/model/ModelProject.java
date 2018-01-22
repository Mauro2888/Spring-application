package com.sql.test.testSql.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity
@Table(name = "project")
public class ModelProject {

	@Id
	@GeneratedValue
	
	@Column(name = "id")
	private int id;
	
	@Column(name = "name_project")
	private String name_project;
	
	@JsonFormat(pattern = "dd-MM-yyyy")
	@Column(name = "start_project")
	private Date start_project;
	
	@Column(name = "status")
	private String status;
	
	@Column(name = "nsenior")
	private String nsenior;
	
	@Column(name = "njunior")
	private String njunior;
	
	@JsonFormat(pattern = "dd-MM-yyyy")
	@Column(name = "deadline")
	private Date deadline;
	
	@ManyToMany(cascade = CascadeType.ALL)
	@JoinTable(name = "employement", 
	joinColumns = @JoinColumn(name = "id_p", referencedColumnName = "id"), 
	inverseJoinColumns = @JoinColumn(name = "id_r", referencedColumnName = "id"))
	private Set<ModelResources> project = new HashSet<ModelResources>();
	

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName_project() {
		return name_project;
	}

	public void setName_project(String name_project) {
		this.name_project = name_project;
	}

	public Date getStart_project() {
		return start_project;
	}

	public void setStart_project(Date start_project) {
		this.start_project = start_project;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getNsenior() {
		return nsenior;
	}

	public void setNsenior(String nsenior) {
		this.nsenior = nsenior;
	}

	public String getNjunior() {
		return njunior;
	}

	public void setNjunior(String njunior) {
		this.njunior = njunior;
	}

	public Date getDeadline() {
		return deadline;
	}

	public void setDeadline(Date deadline) {
		this.deadline = deadline;
	}

	
	
}
