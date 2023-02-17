package com.candidsoftware.springcloudclientservicetwo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.config.environment.Environment;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RefreshScope
public class TestController {
	
	
	
	@Value("${spring.datatasource.url}")
	private String dbUrl;
	@Value("${message}")
	private String message;
	
	@GetMapping("/geturl")
	public String getDbUrl() {
		
		return dbUrl;
	}

	
	@GetMapping("/getmessage")
	public String getMessage() {
		
		return message;
	}

}
