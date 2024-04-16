package ro.sda.java64.eventsapp.services;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import ro.sda.java64.eventsapp.entities.User;
import ro.sda.java64.eventsapp.enums.Role;
import ro.sda.java64.eventsapp.models.UserModel;
import ro.sda.java64.eventsapp.repositories.UserRepository;

@Service
@RequiredArgsConstructor
public class UserService {
        
    private final UserRepository userRepository;
    
    public UserModel createCustomer(UserModel user) {
        User newCustomer = User.builder()
                .id(user.getId())
                .name(user.getName())
                .email(user.getEmail())
                .password(user.getPassword())
                .roleUser(Role.CUSTOMER)
                .build();
        userRepository.save(newCustomer);

        return user;
    }
    
}
