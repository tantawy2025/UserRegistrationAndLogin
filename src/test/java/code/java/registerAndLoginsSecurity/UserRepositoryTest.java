package code.java.registerAndLoginsSecurity;

import static org.assertj.core.api.Assertions.assertThat;

import code.java.registerAndLoginsSecurity.model.User;
import code.java.registerAndLoginsSecurity.repository.UserRepository;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.data.jdbc.DataJdbcTest;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.test.annotation.Rollback;

@DataJdbcTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
@Rollback(value = false)
@Data
public class UserRepositoryTest {

    @Autowired
    private UserRepository repo;

    @Autowired
    private TestEntityManager entityManager;

    @Test
    public void testCreateUser(){

        User user = new User();

        user.setEmail("mtantawy2025@gmail.com");
        user.setPassword("Test@123");
        user.setFirstName("mohamed");
        user.setLastName("tantawy");

        User savedUser = repo.save(user);

        User existedUser = entityManager.find(User.class,savedUser.getId());

        assertThat(existedUser.getEmail()).isEqualTo(user.getEmail());

    }

}
