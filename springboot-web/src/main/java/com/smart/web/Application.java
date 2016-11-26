package com.smart.web;

import java.io.IOException;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.embedded.ConfigurableEmbeddedServletContainer;
import org.springframework.boot.context.embedded.EmbeddedServletContainerCustomizer;
import org.springframework.context.annotation.ImportResource;
/**
 * 程序主入口
 * 
 * @author lenovo
 *
 */
@SpringBootApplication
@ImportResource({"classpath:ApplicationContext.xml", "classpath:ApplicationContext-mvc.xml"})
public class Application implements EmbeddedServletContainerCustomizer {
	
	private static int port = 8083;  
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
		String cmd = "rundll32 url.dll,FileProtocolHandler http://localhost:" + port +"/login";
		try {
			Runtime.getRuntime().exec(cmd);
		} catch (IOException e) {
		}
		
	}

	public void customize(ConfigurableEmbeddedServletContainer container) {
		 container.setPort(port);
	}
}
