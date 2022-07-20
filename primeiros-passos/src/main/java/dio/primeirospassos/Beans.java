package dio.primeirospassos;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Beans {
    @Bean
    public <Gson> Gson gson() {
        return new Gson();
    }
}
