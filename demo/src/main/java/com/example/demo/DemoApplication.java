package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.actuate.trace.http.HttpTraceRepository;
import org.springframework.boot.actuate.trace.http.InMemoryHttpTraceRepository;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@Bean
	public HttpTraceRepository httpTraceRepository(){
		InMemoryHttpTraceRepository h= new InMemoryHttpTraceRepository();
		//val h= new InMemoryHttpTraceRepository()
		//h.add(trace);
		h.setCapacity(200);
	
	    return new InMemoryHttpTraceRepository();
	}
}
