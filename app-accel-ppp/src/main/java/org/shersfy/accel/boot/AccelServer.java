package org.shersfy.accel.boot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.Banner.Mode;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class AccelServer {

	public static void main(String[] args) {
		SpringApplication app = new SpringApplication(AccelServer.class);
		app.setBannerMode(Mode.OFF);
		app.run(args);
	}

}