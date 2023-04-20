package dio.spring.gof;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * Projeto Spring Boot gerado via Initializr
 * Modulos selecionados:
 * Spring Web
 * Spring Boot JPA
 * Spring H2 Database
 * OpenFeign
 */
@EnableFeignClients
@SpringBootApplication
public class PadraoProjetoJavaSpringApplication {

	public static void main(String[] args) {
		SpringApplication.run(PadraoProjetoJavaSpringApplication.class, args);
	}

}
