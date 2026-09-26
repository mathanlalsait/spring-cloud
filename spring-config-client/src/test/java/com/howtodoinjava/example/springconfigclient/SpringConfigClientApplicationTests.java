package com.howtodoinjava.example.springconfigclient;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest(properties = {
		"spring.cloud.config.enabled=false",
		"msg=local-test"
})
class SpringConfigClientApplicationTests {

	@Test
	void contextLoads() {
	}

}
