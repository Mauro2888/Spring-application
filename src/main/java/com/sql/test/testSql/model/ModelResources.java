package com.sql.test.testSql.model;

import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonFormat;

@Table(name = "resources")
@Entity
public class ModelResources {

	
	@Id
	@GeneratedValue
	
	@Column(name = "id")
	private Integer id;
	
	@Column(name = "name")
	private String name;
	
	@Column(name = "surname")
	private String surname;
	
	@Column(name = "type")
	private String type;
	
	@Column(name = "assigned")
	private int assigned;
	
	@JsonFormat(pattern = "dd-MM-yyyy")
	@Column(name = "hire")
	private Date hire;
	
	@ManyToMany 
	@JoinTable(name = "employement", 
	joinColumns = @JoinColumn(name = "id_r", referencedColumnName = "id"), 
	inverseJoinColumns = @JoinColumn(name = "id_p", referencedColumnName = "id"))
	private Set<ModelProject> resources = new HashSet<ModelProject>();
	
	


	public int getAssigned() {
		return assigned;
	}


	public void setAssigned(int assigned) {
		this.assigned = assigned;
	}


	public Set<ModelProject> getResources() {
		return resources;
	}


	public void setResources(Set<ModelProject> resources) {
		this.resources = resources;
	}


	public Integer getId() {
		return id;
	}


	public void setId(Integer id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getSurname() {
		return surname;
	}


	public void setSurname(String surname) {
		this.surname = surname;
	}


	public String getType() {
		return type;
	}


	public void setType(String type) {
		this.type = type;
	}



	public void setHire(Date hire) {
		this.hire = hire;
	}


	public Date getHire() {
		return hire;
	}


	public void setEmployement(Date hire) {
		this.hire = hire;
	}
		
}
