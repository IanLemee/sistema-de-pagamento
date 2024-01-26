package com.sistema.de.pagamento.sitemadepagamento;

import com.sistema.de.pagamento.sitemadepagamento.config.SecurityConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

@SpringBootApplication
@EnableAutoConfiguration(exclude = {SecurityAutoConfiguration.class})
public class SitemaDePagamentoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SitemaDePagamentoApplication.class, args);
	}

}
