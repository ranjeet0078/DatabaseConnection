package com.example.Login.Controller;

import com.example.Login.Objects.Person;
import com.example.Login.service.FireBaseService;
import com.google.firebase.internal.FirebaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.print.attribute.standard.PresentationDirection;
import java.util.concurrent.ExecutionException;

@RestController
public class RestLoginController {

    @Autowired
    FireBaseService fireBaseService;

    @GetMapping("/getUserDetails")
    public Person getExample(@RequestHeader() String name) throws ExecutionException, InterruptedException {
        return fireBaseService.getUserDetails(name);
    }

    @PostMapping("/createUser")
    public String postExample(@RequestBody Person person) throws ExecutionException, InterruptedException {
        return fireBaseService.saveUserDetails(person);
    }

    @PutMapping("/updateUser")
    public String putExample(@RequestBody Person person) throws ExecutionException, InterruptedException {

        return fireBaseService.updateUserDetails(person);
    }

    @DeleteMapping("/deleteUser")
    public String deleteExample(@RequestHeader String name){

        return fireBaseService.deleteUserDetails(name);
    }
}
