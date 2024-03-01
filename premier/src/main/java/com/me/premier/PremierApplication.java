package com.me.premier;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.me.premier.models.Helloword;
import com.me.premier.services.BusinessService;

@SpringBootApplication
public class PremierApplication implements CommandLineRunner{
	@Autowired
	private BusinessService bs;
	public static void main(String[] args) {
		SpringApplication.run(PremierApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Helloword hw=bs.getGetHelloword();
		System.out.println(hw);
	}
	
}
