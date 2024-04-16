package ro.sda.java64.eventsapp.controllers;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ro.sda.java64.eventsapp.models.UserModel;
import ro.sda.java64.eventsapp.services.UserService;

@RequiredArgsConstructor
@RestController
@RequestMapping("/api")
public class UserController {

    private final UserService userService;

    @PostMapping("/register")
    public ResponseEntity<UserModel> createCustomer(@RequestBody UserModel userModel) {
        return new ResponseEntity<>(userService.createCustomer(userModel), HttpStatus.CREATED);
    }

}
