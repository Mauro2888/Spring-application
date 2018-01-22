package com.sql.test.testSql.resources;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sql.test.testSql.model.ModelEmployement;


public interface JpaEmployement extends JpaRepository<ModelEmployement,Integer> {

	
}
