package com.example.crud1.usersLeave;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class UsersLeaveController {
    @Autowired
    public UsersLeaveService usersLeaveService;

    public UsersLeaveController(UsersLeaveService usersLeaveService) {
        this.usersLeaveService = usersLeaveService;
    }

    @CrossOrigin
    @GetMapping("/allLeaves/")
    public List<UsersLeaveEntity> allUsers() {
        return usersLeaveService.getAllUsers();
    }

    @CrossOrigin
    @GetMapping("/userLeave/{id}")
    public Optional<UsersLeaveEntity> findByUsername(@PathVariable("id") Integer id) {
        return usersLeaveService.findById(id);
    }

    @CrossOrigin
    @PostMapping("/leave")
    public ResponseEntity<UsersLeaveEntity> saveLeaveDetails(@RequestBody UsersLeaveEntity record) {
        usersLeaveService.saveUsersDetails(record);
        return new ResponseEntity<UsersLeaveEntity>(record, HttpStatus.OK);
    }

}
