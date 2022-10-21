package eurekaDiscoveryService.eureka_Discovery_Service;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class eurekaDiscoveryService {

	public static void main(String[] args) {
		SpringApplication.run(eurekaDiscoveryService.class, args);
	}

}

