package tn.enis.evenement;

import lombok.AllArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import tn.enis.evenement.entities.Evenement;
import tn.enis.evenement.services.EvenementService;

import java.util.Date;

@SpringBootApplication
@EntityScan(basePackages = "tn.enis.evenement.entities")
@AllArgsConstructor
@EnableDiscoveryClient
public class EvenementApplication implements CommandLineRunner {
	EvenementService evenementService;
	public static void main(String[] args) {
		SpringApplication.run(EvenementApplication.class, args);
	}

	@Override
	public void run (String... args) throws Exception {
		Evenement evenement= Evenement.builder()
				.date(new Date())
				.titre("AY")
				.lieu("EY")
				.build();
		evenementService.addEvenement(evenement);
		Evenement evenement2= Evenement.builder()
				.date(new Date())
				.titre("GH")
				.lieu("UYT")
				.build();
		evenementService.addEvenement(evenement2);

	}
}
