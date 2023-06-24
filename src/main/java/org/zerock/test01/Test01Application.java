package org.zerock.test01;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(basePackages = {"org.zerock.test01.**.mappers"})
public class Test01Application {

	public static void main(String[] args) {
		SpringApplication.run(Test01Application.class, args);
	}

}
