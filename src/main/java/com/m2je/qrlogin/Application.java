package com.m2je.qrlogin;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;

import com.m2je.qrlogin.server.ServerService;

@SpringBootApplication
public class Application extends SpringBootServletInitializer {

	
	
	public static void main(String[] args) {
		new Application().
		configure(new SpringApplicationBuilder(Application.class)).
		run(args);
	}
	
}
