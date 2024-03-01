package com.me.premier;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.me.premier.services.BusinessService;

@SpringBootTest
class PremierApplicationTests {
	@Autowired
	BusinessService bs;
	@Test
	void contextLoads() {
	}
	@Test
	public void testGetHelloWorld() {

        String expected = "Hello World!";

        String result = bs.getGetHelloword().getValue();

        assertEquals(expected, result);
    }

}
