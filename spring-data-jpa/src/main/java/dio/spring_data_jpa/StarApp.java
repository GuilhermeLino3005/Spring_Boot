package dio.spring_data_jpa;
import dio.spring_data_jpa.model.User;
import dio.spring_data_jpa.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
//import java.util.List;

@Component
public class StarApp implements CommandLineRunner {
     @Autowired
     private UserRepository repository;

     @Override
     public void run(String ... args) throws Exception{
          /*List<User> users = repository.findByNameContaining("Guilherme");
          for(User u: users){
               System.out.println(u);
          }*/
     

     //private void insertUser(){
           User user = new User();

          user.setName("Guilherme");
          user.setUsername("Gui");
          user.setPassword("123456");

          repository.save(user);
          for(User u: repository.findAll()){
               System.out.println(u);
          }


     } 
}
