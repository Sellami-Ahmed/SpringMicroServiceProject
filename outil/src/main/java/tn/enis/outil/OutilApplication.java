package tn.enis.outil;

import lombok.AllArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import tn.enis.outil.entities.Outil;
import tn.enis.outil.services.OutilService;

import java.util.Date;

@SpringBootApplication
@EntityScan(basePackages = "tn.enis.outil.entities")
@AllArgsConstructor
@EnableDiscoveryClient
public class OutilApplication implements CommandLineRunner {
	OutilService outilService;
	public static void main(String[] args) {
		SpringApplication.run(OutilApplication.class, args);
	}

	@Override
	public void run (String... args) throws Exception {
		Outil outil1=Outil.builder()
				.source("AZ")
				.date(new Date())
				.build();
		outilService.addOutil(outil1);

		Outil outil2=Outil.builder()
				.source("BY")
				.date(new Date())
				.build();
		outilService.addOutil(outil2);

	}
}
