package web.controllers;

import core.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by employee on 12/2/15.
 */
public class BaseControler {

    @Autowired
    protected UserService userService;
}
