package com.example.sample;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.jdbc.core.JdbcTemplate;

@SpringBootApplication
public class SampleApplication implements CommandLineRunner {
	@Autowired
	private JdbcTemplate jdbcTemplate;


	public static void main(String[] args) {
		SpringApplication.run(SampleApplication.class, args);

	}

	@Override
	public void run(String... args) throws Exception {
		String sql="INSERT into trial (msg) VALUES('Get Hello World')";
		int rows=jdbcTemplate.update(sql);
	}
}
