package com.upgrad.mba;

import org.hibernate.engine.jdbc.connections.internal.DatasourceConnectionProviderImpl;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import javax.sql.DataSource;

@SpringBootApplication
public class MovieBookingApplication {

	public static void main(String[] args) {

	ApplicationContext context = SpringApplication.run(MovieBookingApplication.class, args);
		DataSource source = context.getBean(DataSource.class);
	}

}
