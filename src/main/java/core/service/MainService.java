package core.service;

import core.entity.User;
import persistence.UserDaoImpl;

/**
 * Created by employee on 12/2/15.
 */
public class MainService {

    public UserDaoImpl userSearch;

    public MainService(UserDaoImpl userSearch) {
        this.userSearch = userSearch;
    }

    public void getAllUsers (){
        for(User user: userSearch.getAll()){
            System.out.println(user.getUserName());
        }
    }

}
