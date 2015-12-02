package web.controllers;

import core.entity.User;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by employee on 12/2/15.
 */
@RestController
@RequestMapping(value = "/users")
public class MainController extends BaseControler {

    @RequestMapping(method = RequestMethod.GET)
    public List<User> getCities() {
        return userService.getAllUsers();
    }

}
