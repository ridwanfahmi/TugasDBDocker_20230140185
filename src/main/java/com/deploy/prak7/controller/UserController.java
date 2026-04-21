package com.deploy.prak7.controller;

import com.deploy.prak7.model.User;
import com.deploy.prak7.service.UserService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/users")
public class UserController {
    private  final UserService userService;

    public UserController(UserService userService){
        this.userService = userService;
    }

    @PostMapping
    public String createUser(@RequestBody User request){
        userService.addUser(request);
        return "User Berhasil Dibuat";
    }

    @GetMapping
    public List<User>getAllUser(){
        return userService.getAllusers();
    }

    @DeleteMapping
    public String deleteUser(@PathVariable String id){
        userService.deleteUser(id);
        return "User Berhasil Dihapus";
    }

    @GetMapping("/{id}")
    public User getUserById(@PathVariable String id){
        return userService.getUserById(id);
    }

    @PutMapping("/{id}")
    public String updateUser(@PathVariable String id, @RequestBody User request){
        userService.updateUser(id, request);
        return "User Berhasil diupdate";
    }
}
