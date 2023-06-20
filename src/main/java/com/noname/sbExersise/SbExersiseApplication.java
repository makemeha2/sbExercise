package com.noname.sbExersise;

import com.noname.sbExersise.service.LiveShoppingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

@SpringBootApplication
public class SbExersiseApplication {

	public static void main(String[] args) throws Exception {
		SpringApplication.run(SbExersiseApplication.class, args);
	}
}
