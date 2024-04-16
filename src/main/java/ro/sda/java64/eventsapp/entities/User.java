package ro.sda.java64.eventsapp.entities;

import jakarta.persistence.*;
import lombok.*;
import ro.sda.java64.eventsapp.enums.Role;

@Entity
@Setter
@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String email;
    private String password;
    @Enumerated(EnumType.STRING)
    private Role roleUser;
}
