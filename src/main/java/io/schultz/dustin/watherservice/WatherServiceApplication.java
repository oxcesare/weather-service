package io.schultz.dustin.watherservice;

import java.util.concurrent.ThreadLocalRandom;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@SpringBootApplication
@EnableDiscoveryClient
public class WatherServiceApplication {
	
	private String [] weather = new String [] {"sunny","cloudy","rainy","windy"};
	public static void main(String[] args) {
		SpringApplication.run(WatherServiceApplication.class, args);
	}

	@GetMapping("/weather")
	public String getWeather() {
		int rand = ThreadLocalRandom.current().nextInt(0,4);
		return weather[rand];
	}
	
	
}
