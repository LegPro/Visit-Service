package com.infoway.petclinic;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

import com.infoway.petclinic.dao.VisitRepository;
import com.infoway.petclinic.model.Visit;



@SpringBootApplication
public class VisitServiceApplication {
		
	@Autowired
	private VisitRepository repo;
		
	public static void main(String[] args) {
		SpringApplication.run(VisitServiceApplication.class, args);
	}
	
	@Bean
	public CommandLineRunner commandLineRunner(ApplicationContext ctx) {
		return new CommandLineRunner() {
			@Override
			public void run(String... args) throws Exception {
				System.out.println("Hello Visitor");
	
				Visit visit=new Visit();
				String sDate1="01/06/2019";  
			    Date date1=new SimpleDateFormat("dd/MM/yyyy").parse(sDate1);  
				visit.setDate(date1);
				visit.setDescription("Visitors Meeting");
				repo.save(visit);
				
				
				Visit visit1=new Visit();
				 sDate1="02/06/2019";  
			     date1=new SimpleDateFormat("dd/MM/yyyy").parse(sDate1);  
				visit1.setDate(date1);
				visit1.setDescription("Visitors Appointment");
				repo.save(visit1);
			}
		};
	}
	

}
