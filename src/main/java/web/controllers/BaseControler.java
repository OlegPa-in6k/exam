package web.controllers;

import core.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by employee on 12/2/15.
 */
public class BaseControler {

    @Autowired
    protected AdminService adminService;

//    @Autowired
//    protected UserService userService;
}
