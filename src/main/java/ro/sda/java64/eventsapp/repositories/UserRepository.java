package ro.sda.java64.eventsapp.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ro.sda.java64.eventsapp.entities.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {


}
