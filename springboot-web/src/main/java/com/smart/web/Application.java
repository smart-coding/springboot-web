package com.smart.web;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;
/**
 * 程序主入口
 * 
 * @author lenovo
 *
 */
@SpringBootApplication
@ImportResource({"classpath:ApplicationContext.xml", "classpath:ApplicationContext-mvc.xml"})
public class Application {
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
}
