package dio.primeirospassos;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class PrimeirosPassosApplication {

    private static ConversonJson conversor;
	private static Object ConversorJson;

	public static void main(String[] args) {
        SpringApplication.run(PrimeirosPassosApplication.class, args);
        @Bean
        public CommandLineRunner run (ConversorJson conversor) throws Exception {
            return args -> {
                String json = "{\"cep\":\"01001-000\",\"logradouro\":\"Praça da Sé\",\"localidade\":
                ViaCepResponse response = conversor.converter(json);
                System.out.println("Dados do CEP: " + response);
            }
        }
    }

}
