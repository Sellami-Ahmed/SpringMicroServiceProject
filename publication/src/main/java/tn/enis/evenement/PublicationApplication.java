package tn.enis.evenement;

import lombok.AllArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;
import tn.enis.evenement.entities.Publication;
import tn.enis.evenement.services.PublicationService;

import java.util.Date;

@SpringBootApplication
@EntityScan(basePackages = "tn.enis.evenement.entities")
@AllArgsConstructor
@EnableDiscoveryClient
public class PublicationApplication implements CommandLineRunner {
    PublicationService publicationService;

    public static void main (String[] args) {
        SpringApplication.run(PublicationApplication.class, args);
    }

    @Override
    public void run (String... args) throws Exception {

        Publication publication = Publication.builder()
                .type("article")
                .titre("introduction to linux")
                .lien("lien")
                .date(new Date())
                .sourcePdf("pdf")
                .build();
        publicationService.addPublication(publication);
        Publication publication2 = Publication.builder()
                .type("chapitre de livre")
                .titre("introduction a l ia")
                .lien("lien")
                .date(new Date())
                .sourcePdf("pdf")
                .build();
        publicationService.addPublication(publication2);
        Publication publication3 = Publication.builder()
                .type("article")
                .titre("introduction spring")
                .lien("lien")
                .date(new Date())
                .sourcePdf("pdf")
                .build();
        publicationService.addPublication(publication3);
    }
}
