package dio.scopes_singleton.app;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class Beans {
     @Bean
     @Scope("prototype")
     public Remetente remetente(){
          System.out.println("CRIANDO UM OBJETO REMENTENTE");
          Remetente remetente = new Remetente();
          remetente.setEmail("noreply@dio.com.br");
          remetente.setNome("Digite Innovation One");
          return remetente;
     }
}
