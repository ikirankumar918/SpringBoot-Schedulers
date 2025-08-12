package Scheduler;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
//@EnableEurekaClient --deprecated after 3.0 -- need to use @EnableDiscoveryClient
@EnableDiscoveryClient
public class QuartzScheduleDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(QuartzScheduleDemoApplication.class, args);
	}

	@Bean
	public RestTemplate getRestTemplate() {
		return new RestTemplate();
	}
}
