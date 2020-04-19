package com.multi.database.console;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.multi.database.service.EmployeeService;
import com.multi.database.service.model.EmployeeContext;


@Component
public class ConsoleApplication implements CommandLineRunner {

	@Autowired
	private EmployeeService employeeService;
	
	
	@Override
	public void run(String... args) throws Exception {
	
		
		employeeService.transferRecordsBetweenDBs();
		System.out.println("Transferred from MySQL to Postgres!");
	}

}
