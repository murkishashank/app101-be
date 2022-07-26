package com.example.crud1.usersLeave;

import java.util.List;

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
    @GetMapping("/userLeave/{userName}")
    public List<UsersLeaveEntity> findByUsername(@PathVariable("userName") String userName) {
        return usersLeaveService.findById(userName);
    }

    @PostMapping("/leave")
    public ResponseEntity<UsersLeaveEntity> saveLeaveDetails(@RequestBody UsersLeaveEntity record) {
        usersLeaveService.saveUsersDetails(record);
        return new ResponseEntity<UsersLeaveEntity>(record, HttpStatus.OK);
    }

}
