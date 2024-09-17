package com.hms.user.service.services;

import com.hms.user.service.entities.User;

import java.util.List;

public interface UserService {
    //user operations

    //create
    User saveUser(User user);

    //get all user
    List<User> getAllUsers();

    //get single user of given userId
    User getUser(String userId);

    //TODO : DELETE
    //TODO : UPDATE
}
