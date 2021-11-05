package com.pokemon;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.web.client.RestTemplate;

import com.fasterxml.jackson.databind.ObjectMapper;

@SpringBootApplication
public class PokemonServiceApplication {
	
	@Autowired
	public ObjectMapper mapper;

	public static void main(String[] args) {
		SpringApplication.run(PokemonServiceApplication.class, args);
	}

	@Bean
	public RestTemplate getTemplate() {
		return new RestTemplateBuilder().messageConverters( new MappingJackson2HttpMessageConverter( mapper ) ).build(); 
	}
	
//	@Bean
//	public ObjectMapper getObjectMapper() {
//		return new ObjectMapper();
//	}
}
