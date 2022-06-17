package com.syschurch.SysChurchSolutions;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })
public class SysChurchSolutionsApplication {

	public static void main(String[] args) {SpringApplication.run(SysChurchSolutionsApplication.class, args);
	}

}
