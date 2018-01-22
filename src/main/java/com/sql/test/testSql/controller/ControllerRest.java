package com.sql.test.testSql.controller;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Locale;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.sql.test.testSql.model.ModelEmployement;
import com.sql.test.testSql.model.ModelProject;
import com.sql.test.testSql.model.ModelResources;
import com.sql.test.testSql.resources.JpaEmployement;
import com.sql.test.testSql.resources.JpaProject;
import com.sql.test.testSql.resources.JpaResources;



@RestController
@RequestMapping(value = "/rest/resources")
public class ControllerRest{
	

	@Autowired
	JpaResources jpaResources;
	JpaProject jpaProject;
	JpaEmployement jpaEmplo;
	

	public ControllerRest(JpaResources jpaResources, JpaProject jpaProject, JpaEmployement jpaEmplo) {
		super();
		this.jpaResources = jpaResources;
		this.jpaProject = jpaProject;
		this.jpaEmplo = jpaEmplo;
	}

	//SHOW ALL RESOURCES
	@GetMapping(value = "/show")
	public List<ModelResources> viewAll(){
		return jpaResources.findAll();	
	}
	
	//SHOW ALL PROJECT
	@GetMapping(value = "/show/projects")
	public List<ModelProject> viewAllproject(){
		return jpaProject.findAll();	
	}
	
	//SHOW ALL EMPLOYEMENT
	@GetMapping(value = "/show/employement")
	public List<ModelEmployement> viewAllEmployements(){
		return jpaEmplo.findAll();
	}
	
	

	//POST ALL RESOURCES
	@PostMapping(value = "/load")
	public List<ModelResources> post (@RequestBody final ModelResources resources){
		jpaResources.save(resources);
		return jpaResources.findAll();
	}
	
	
	//POST ALL PROJECT
	@PostMapping(value = "/load/project")
	public List<ModelProject> post (@RequestBody final ModelProject project){
		jpaProject.save(project);
		return jpaProject.findAll();
	}
	
	//POST/UPDATE SINGLE EMPLOYEMENT
	@RequestMapping(value = "/load/employement/all", method = RequestMethod.POST)
	public ResponseEntity<?> addEmployement(@RequestBody ModelEmployement emplo) {
		return new ResponseEntity<>(jpaEmplo.save(emplo), HttpStatus.CREATED);
	}
	
	
	//DELETE ASSIGNMENT PROJECT BY ID
	@RequestMapping(value = "/delete/resources_assignment/{id}")
	public void deleteAssingnment(@PathVariable Integer id) {
		jpaEmplo.delete(id);
	}
	
		
	//DELETE METHOD for RESOURCES BY ID
	@RequestMapping(value = "/delete/resources/{id}")
	public void deleteResource(@PathVariable Integer id) {
		jpaResources.delete(id);
	}
		
	
	//GET FOR RESOURCES by ID / TYPE / SURNAME
	//ID
	@GetMapping(value = "/show/resources/{id}")
	public ModelResources getId(@PathVariable final int id){
		return jpaResources.findAllById(id);
		
	}
	
	//TYPE
	@GetMapping(value = "/show/type/{type}")
	public List<ModelResources> tipologia(@PathVariable final String type){
		return jpaResources.findByType(type);
	}
	
	//SURNAME
	@GetMapping(value = "/show/surname/{surname}")
	public List<ModelResources> surname(@PathVariable String surname){
		return jpaResources.findBySurname(surname);
	}
	
	
	//GET PROJECT BY ID
	@GetMapping(value = "/show/projects/{id}")
	public ModelProject getIdProject(@PathVariable final int id){
		return jpaProject.findAllById(id);	
	}

	
	//UPDATE PROJECT BY ID
	@PutMapping("/update/project/{id}")
	public ResponseEntity<ModelProject> updateProject(@PathVariable(value = "id") int idProject, 
	                                       @Valid @RequestBody ModelProject projectDetails) {
	    ModelProject proj = jpaProject.findOne(idProject);
	    if(proj == null) {
	        return ResponseEntity.notFound().build();
	    }
	    proj.setName_project(projectDetails.getName_project());
	    proj.setStart_project(projectDetails.getStart_project());
	    proj.setStatus(projectDetails.getStatus());
	    proj.setNjunior(projectDetails.getNjunior());
	    proj.setNsenior(projectDetails.getNsenior());
	    proj.setDeadline(projectDetails.getDeadline());

	    ModelProject updatedProj = jpaProject.save(proj);
	    return ResponseEntity.ok(updatedProj);
	}
	

	
	
	//UPDATE RESOURCES BY ID
		@PutMapping("/update/resources/{id}")
		public ResponseEntity<ModelResources> updateResources(@PathVariable(value = "id") int idResources, 
		                                      @Valid @RequestBody ModelResources resourcesDetails) {
			ModelResources res = jpaResources.findOne(idResources);
		    if(res == null) {
		        return ResponseEntity.notFound().build();
		    }
		    
		    res.setName(resourcesDetails.getName());
		    res.setSurname(resourcesDetails.getSurname());
		    res.setType(resourcesDetails.getType());
		    res.setAssigned(resourcesDetails.getAssigned());
		    res.setHire(resourcesDetails.getHire());

		    ModelResources updateRes = jpaResources.save(res);
		    return ResponseEntity.ok(updateRes);
		}
		
		//UPDATE ASSIGNED BY ID
		@PutMapping("/assigned/project/{id}")
		public ResponseEntity<ModelResources> assignedProject(@PathVariable(value = "id") int idAssigned, 
		                                      @Valid @RequestBody ModelResources assignedDetails) {
			ModelResources assigned = jpaResources.findOne(idAssigned);
		    if(assigned == null) {
		        return ResponseEntity.notFound().build();
		    }
		  			
		    assigned.setAssigned(assignedDetails.getAssigned());

		    ModelResources updateAssigned = jpaResources.save(assigned);
		    return ResponseEntity.ok(updateAssigned);
		}
			
	
	
	//DELETE METHOD for PROJECT BY ID
	@RequestMapping(value = "/delete/projects/{id}")
	public void delete(@PathVariable Integer id) {
		jpaProject.delete(id);
	}	

}
