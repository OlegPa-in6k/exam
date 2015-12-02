package core.service;

import core.entity.User;
import persistence.UserDaoImpl;

import java.util.List;

/**
 * Created by employee on 12/2/15.
 */
public class UserService {

    public UserDaoImpl userSearch;

    public UserService(UserDaoImpl userSearch) {
        this.userSearch = userSearch;
    }

    public List<User> getAllUsers() {
        return userSearch.getAll();
    }



}
