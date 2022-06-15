package com.hexaware.SpringAssessment;

import com.hexaware.SpringAssessment.Entity.Books;
import com.hexaware.SpringAssessment.Entity.Library;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.PostConstruct;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

@SpringBootApplication
public class RestapiAssesmentApplication {

	public static void main(String[] args) {
		SpringApplication.run(RestapiAssesmentApplication.class, args);
	}



}
