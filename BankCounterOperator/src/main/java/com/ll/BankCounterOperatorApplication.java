package com.ll;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableSwagger2
@MapperScan("com.ll.dao")

public class BankCounterOperatorApplication {

	public static void main(String[] args) {
		SpringApplication.run(BankCounterOperatorApplication.class, args);
	}

} 
