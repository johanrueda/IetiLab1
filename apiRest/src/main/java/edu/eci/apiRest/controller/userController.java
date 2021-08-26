package edu.eci.apiRest.controller;
import edu.eci.apiRest.data.User;
import edu.eci.apiRest.dto.userDto;
import edu.eci.apiRest.service.userService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping( "/v1/user" )
public class userController
{
    private final userService userService;

    public userController( @Autowired userService userService )
    {
        this.userService = userService;
    }


    @GetMapping
    public ResponseEntity<List<User>> all()
    {
        //TODO implement this method using UserService
        List<User> users = userService.all();
        return new ResponseEntity<>(users, HttpStatus.FOUND);
    }

    @GetMapping( "/{id}" )
    public ResponseEntity<User> findById( @PathVariable String id )
    {
        //TODO implement this method using UserService
        User user = userService.findById(id);
        return new ResponseEntity<>(user,HttpStatus.FOUND);
    }


    @PostMapping
    public ResponseEntity<User> create( @RequestBody userDto userDto )
    {
        //TODO implement this method using UserService
        User user = userService.create(userDto);
        return new ResponseEntity<>(user,HttpStatus.ACCEPTED);
    }

    @PutMapping( "/{id}" )
    public ResponseEntity<User> update( @RequestBody userDto userDto, @PathVariable String id )
    {
        //TODO implement this method using UserService
        User user = userService.update(userDto,id);
        return new ResponseEntity<>(user,HttpStatus.ACCEPTED);
    }

    @DeleteMapping( "/{id}" )
    public ResponseEntity<Boolean> delete( @PathVariable String id )
    {
        //TODO implement this method using UserService
        userService.deleteById(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
