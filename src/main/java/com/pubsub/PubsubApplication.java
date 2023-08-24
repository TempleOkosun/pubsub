package com.pubsub;

import com.pubsub.config.PubSubConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
@EnableConfigurationProperties(PubSubConfiguration.class)
public class PubsubApplication {

	public static void main(String[] args) {
		SpringApplication.run(PubsubApplication.class, args);
	}

}
