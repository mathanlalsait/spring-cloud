package com.example.howtodoinjava.springeurekaserver;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest(properties = {
		"eureka.client.enabled=false"
})
class SpringEurekaServerApplicationTests {

	@Test
	void contextLoads() {
	}

}
