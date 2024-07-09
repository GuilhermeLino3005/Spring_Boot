package dio.spring_data_jpa.repository;
import dio.spring_data_jpa.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
/*import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;*/


public interface UserRepository extends JpaRepository<User, Integer> {
     /*List<User> findByNameContaining(String name);

     User findfByUsername(String username);

     @Query("SELECT u FROM User U WHERE u.name Like %:name%")
     List<User> filtrarPorNome(@Param("name") String name);*/


}

     
