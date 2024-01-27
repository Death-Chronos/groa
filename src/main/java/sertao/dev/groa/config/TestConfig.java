package sertao.dev.groa.config;

import java.time.LocalDate;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

import sertao.dev.groa.entities.Producao;
import sertao.dev.groa.repositories.ProducaoRepository;

@Configuration
public class TestConfig implements CommandLineRunner {

    @Autowired
    ProducaoRepository pr;

    @Override
    public void run(String... args) throws Exception {
        Producao prod1 = new Producao(null,"Manga", LocalDate.of(2012,10,22),20f,12f,8f);
        Producao prod2 = new Producao(null,"Batata", LocalDate.of(2012,10,22),20f,12f,8f);
        Producao prod3 = new Producao(null,"Pera", LocalDate.of(2012,10,22),20f,12f,8f);

        pr.saveAll(Arrays.asList(prod1,prod2,prod3));
    }
    
}
