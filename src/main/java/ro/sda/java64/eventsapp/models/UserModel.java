package ro.sda.java64.eventsapp.models;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import ro.sda.java64.eventsapp.enums.Role;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class UserModel {
    private Long id;
    private String name;
    private String email;
    private String password;
    private Role roleUser;
}
