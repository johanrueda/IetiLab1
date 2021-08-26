package edu.eci.apiRest.service;

import edu.eci.apiRest.data.User;
import edu.eci.apiRest.dto.userDto;

import java.util.List;

public interface userService {
    User create(userDto user );

    User findById( String id );

    List<User> all();

    void deleteById( String id );

    User update(userDto user, String userId );
}
