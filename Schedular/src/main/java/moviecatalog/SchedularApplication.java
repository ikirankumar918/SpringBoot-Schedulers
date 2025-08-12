package moviecatalog;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.web.client.RestTemplate;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
@EnableScheduling
public class SchedularApplication {

	@Bean
	@LoadBalanced
	public RestTemplate getRestTemplate() {
		return new RestTemplate();
		
	}
	//WebClient is totally deals with the Asynchronous way of communication, where as RestTemplate is a synchronous way where it will wait for the response object till it gets the object.
/*	@Bean
	public WebClient.Builder getWebClientBuilder() { 
	
		return WebClient.builder();
	}
	*/
	public static void main(String[] args) {
		SpringApplication.run(SchedularApplication.class, args);
	}

}

/*
@LoadBalanced -->
telling the RestTemplate to do the service discovery everytime when i call , but i am not going to give you the whole URL for service discovery but only a hint,
so here the library goes through it and calls the Eureka service and passes the message.
so what Loadbalanced does is., it does the service discovery in load balanced way, here we are telling the RestTemplate not to go through the service directly but we
are suggesting that we have given is a hint for the service directory to find the actual service (eureka server)

 */