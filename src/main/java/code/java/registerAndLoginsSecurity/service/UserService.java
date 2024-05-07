package code.java.registerAndLoginsSecurity.service;

import code.java.registerAndLoginsSecurity.model.User;
import code.java.registerAndLoginsSecurity.repository.UserRepository;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
@Data
public class UserService {

    private final UserRepository userRepo;

    private final PasswordEncoder passwordEncoder;

    public void registerUser(User user){

        String encodedPassword = passwordEncoder.encode(user.getPassword());
        user.setPassword(encodedPassword);

        userRepo.save(user);
    }


}
