package com.example.crud1;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class UsersController {

    @Autowired
    public UsersService usersService;

    public UsersController(UsersService usersService) {
        this.usersService = usersService;
    }

    @CrossOrigin
    @GetMapping("/allUsers")
    public List<UsersEntity> allUsers() {
        return usersService.getAllUsers();
    }

    @CrossOrigin
    @GetMapping("/users/{userId}")
    public UsersEntity getUsers(@PathVariable("userId") Integer userId) {
        return usersService.getUserById(userId);
    }

    @CrossOrigin
    @PostMapping("/users")
    public ResponseEntity<UsersEntity> saveEmployeeDetails(@RequestBody UsersEntity record) {
        usersService.saveUsersDetails(record);
        return new ResponseEntity<UsersEntity>(record, HttpStatus.OK);
    }

    @DeleteMapping("/delEmployee/{employeeId}")
    public void deleteUsers(@PathVariable("employeeId") int employeeId) {
        usersService.delete(employeeId);
    }
}
