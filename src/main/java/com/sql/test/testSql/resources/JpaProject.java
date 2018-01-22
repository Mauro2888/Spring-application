package com.sql.test.testSql.resources;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sql.test.testSql.model.ModelProject;
import com.sql.test.testSql.model.ModelResources;

@Repository
public interface JpaProject extends JpaRepository<ModelProject,Integer>{
	

	ModelProject findAllById(int id);
	

}
