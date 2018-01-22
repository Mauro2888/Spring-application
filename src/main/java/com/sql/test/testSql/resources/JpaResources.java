package com.sql.test.testSql.resources;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.sql.test.testSql.model.ModelResources;

@Repository
public interface JpaResources extends JpaRepository<ModelResources,Integer> {
	
	//methods for risorsa table
	ModelResources findAllById(int id);
	List<ModelResources> findByType(String type);
	List<ModelResources> findBySurname(String surname);


	void deleteById(int id);
}