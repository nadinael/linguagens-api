package br.com.nadinael.linguagensapi.principal;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//@ComponentScan("br.com.nadinael.linguagensapi") //to scan packages mentioned
//@EnableMongoRepositories("br.com.nadinael.linguagensapi")
@SpringBootApplication
public class LinguagensApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(LinguagensApiApplication.class, args);
	}

}
