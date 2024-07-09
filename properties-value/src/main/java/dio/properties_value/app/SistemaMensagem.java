package dio.properties_value.app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class SistemaMensagem implements CommandLineRunner {
     @Autowired
     private Rementente rementente;


     @Override
     public void run(String... args) throws Exception{
          System.out.println("Mensagem enviada por: "+rementente.getNome()+ "\n E-mail: "+rementente.getEmail()+ "\nCom telefone "+rementente.getTelefone());
          System.out.println("Seu Cadastro foi aprovado");
     }
}
