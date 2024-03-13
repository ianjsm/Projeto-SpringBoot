package com.projetos.projeto.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.projetos.projeto.entities.User;
import com.projetos.projeto.repositories.UserRepository;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner{
	
	@Autowired
	private UserRepository userRepository;

	@Override
	public void run(String... args) throws Exception {
		
		User u1 = new User(null, "José", "jose@email.com", "11111111", "0000");
		User u2 = new User(null, "Maria", "maria@email.com", "22222222", "1221");
		
		userRepository.saveAll(Arrays.asList(u1, u2));
	}
}