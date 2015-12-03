package web.controllers;

import core.entity.User;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by employee on 12/2/15.
 */
@RestController
@RequestMapping(value = "/users")
public class UserController extends BaseControler {

    @RequestMapping(method = RequestMethod.GET)
    public List<User> getUsers() {
        return userService.getAllUsers();
    }

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public void addUser(@RequestBody String userName) {
        User user = new User();
        user.setUserName(userName);
        userService.addUser(user);
    }

    @RequestMapping(value = "/delete/{userId}", method = RequestMethod.DELETE)
    public void deleteUser(@PathVariable("userId") int userId) {
        userService.deleteUser(userService.getUserById(userId));
    }


}
