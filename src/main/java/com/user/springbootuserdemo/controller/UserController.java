package com.user.springbootuserdemo.controller;

import com.user.springbootuserdemo.domain.UserRepository;
import com.user.springbootuserdemo.domain.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping(path = "/users")
public class UserController {

    @Autowired
    private UserRepository userRepository;

    @RequestMapping(method = RequestMethod.POST)
    public @ResponseBody String addNewUser(@RequestBody UserInput userInput) {
        User user = new User();
        user.setName(userInput.name);
        user.setEmail(userInput.email);
        userRepository.save(user);
        return "Saved";
    }

    @RequestMapping(method = RequestMethod.GET)
    public @ResponseBody Iterable<User> getAllUsers() {
        return userRepository.findAll();
    }
}
