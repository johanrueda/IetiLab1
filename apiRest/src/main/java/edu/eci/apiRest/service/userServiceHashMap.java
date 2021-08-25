package edu.eci.apiRest.service;

import edu.eci.apiRest.data.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

@Service
public class userServiceHashMap  implements  userService{

    private HashMap<String,User> users = new HashMap<>();

    @Override
    public User create(User user) {
        users.put(user.getId(),user);
        return user;
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
    public boolean deleteById(String id) {
        return users.remove(id) != null;
    }

    @Override
    public User update(User user, String userId) {
        user.setId(userId);
        users.put(userId,user);
        return user;
    }
}
