package iuh.fit.se.user.service;

import iuh.fit.se.user.models.User;
import iuh.fit.se.user.repository.UserRepository;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }
    public User getUser(long id){
        return userRepository.findById(id).orElse(null);
    }
}
