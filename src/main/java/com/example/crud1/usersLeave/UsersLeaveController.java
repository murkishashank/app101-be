package com.example.crud1.usersLeave;

import java.io.Console;
import java.sql.Date;
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
    @GetMapping("/allLeaves")
    public List<UsersLeaveEntity> allUsers() {
        return usersLeaveService.getAllUsers();
    }

    @CrossOrigin
    @GetMapping("/userLeave/{id}")
    public List<UsersLeaveEntity> findByUserId(@PathVariable("id") Integer id) {
        return usersLeaveService.findByUserId(id);
    }

    @CrossOrigin
    @PostMapping("/leave")
    public ResponseEntity<UsersLeaveEntity> saveLeaveDetails(@RequestBody UsersLeaveEntity record) {
        UsersLeaveEntity savedRecord = usersLeaveService.saveUsersDetails(record);
        return new ResponseEntity<UsersLeaveEntity>(savedRecord, HttpStatus.OK);
    }

}
