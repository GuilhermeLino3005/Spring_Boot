package dio.properties_value.app;

import java.util.List;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration

@ConfigurationProperties(prefix = "remetente")
public class Rementente {
     private String nome;
     private String email;
     private List<Long> telefone;

     public String getEmail() {
          return email;
     }
      
     public void setEmail(String email) {
          this.email = email;
     }


     public String getNome() {
          return nome;
     }
     
     public void setNome(String nome) {
          this.nome = nome;
     }

     public List<Long> getTelefone() {
          return telefone;
     }

     public void setTelefone(List<Long> telefone) {
          this.telefone = telefone;
     }
}
