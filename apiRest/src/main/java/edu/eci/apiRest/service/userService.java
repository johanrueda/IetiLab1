package edu.eci.apiRest.service;

import edu.eci.apiRest.data.User;

import java.util.List;

public interface userService {
    User create(User user );

    User findById( String id );

    List<User> all();

    boolean deleteById( String id );

    User update( User user, String userId );
}
