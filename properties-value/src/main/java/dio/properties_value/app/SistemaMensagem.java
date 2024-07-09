package dio.properties_value.app;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class SistemaMensagem implements CommandLineRunner {
     @Value("${name: NoReply}")
     private String nome;

     @Value("${email}")
     private String email;
     
     @Value("${telefone}")
     private List<Long> telefone = new ArrayList<>(Arrays.asList(new Long[]{8398140028922L}));

     @Override
     public void run(String... args) throws Exception{
          System.out.println("Mensagem enviada por: "+nome+ "\n E-mail: "+email+ "\nCom telefone "+telefone);
          System.out.println("Seu Cadastro foi aprovado");
     }
}
