package edu.eci.apiRest.service;

import edu.eci.apiRest.data.User;
import edu.eci.apiRest.dto.userDto;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

@Service
public class userServiceHashMap  implements  userService{

    private HashMap<String,User> users = new HashMap<>();

    @Override
    public User create(userDto user) {
        User newUser = new User(user,String.valueOf(users.size()+1));
        users.put(newUser.getId(),newUser);
        return newUser;
    }

    @Override
    public User findById(String id) {
        return users.get(id);
    }

    @Override
    public List<User> all() {
        return new ArrayList<>(users.values());
    }

    @Override
    public void deleteById(String id) {
        users.remove(id) ;
    }

    @Override
    public User update(userDto user, String userId) {
        User newUser = new User(user,userId);
        users.put(userId,newUser);
        return newUser;
    }
}
