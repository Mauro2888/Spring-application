package com.sql.test.testSql;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.JstlView;

@EnableJpaRepositories(basePackages = "com.sql.test.testSql.resources")
@SpringBootApplication
public class TestSqlApplication {

	public static void main(String[] args) {
		SpringApplication.run(TestSqlApplication.class, args);
	}
	
	
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(TestSqlApplication.class);
	}
	
	@Bean 
	public ViewResolver getViewResolver(){
	    InternalResourceViewResolver resolver = new InternalResourceViewResolver();
	    resolver.setPrefix("/WEB-INF/jsp/");
	    resolver.setSuffix(".jsp");
	    resolver.setViewClass(JstlView.class);
	    return resolver;
	}
}
