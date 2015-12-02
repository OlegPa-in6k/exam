package core.service;

import core.entity.User;
import org.hibernate.exception.ConstraintViolationException;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.stereotype.Service;
import persistence.ServiceTypeImpl;
import persistence.UserDaoImpl;

import java.util.List;

/**
 * Created by employee on 12/2/15.
 */
@Service
public class AdminService extends BaseService{

    public UserDaoImpl userSearch;

    public ServiceTypeImpl serviceTypeSearch;

    public AdminService(UserDaoImpl userSearch, ServiceTypeImpl serviceTypeSearch) {
        this.userSearch = userSearch;
        this.serviceTypeSearch = serviceTypeSearch;
    }

    public AdminService(UserDaoImpl userDao) {
    }

    public List<User> getAllUsers() {
        return userSearch.getAll();
    }

    public void addUser(User user){
        try{  userSearch.create(user);
        } catch (ConstraintViolationException e){

        }

    }


    public void deleteUser (User  user) {
        try{ userSearch.delete(user);
        } catch (DataIntegrityViolationException e){

        }
    }

    public User getUserById(int userId){
        return userSearch.read(userId);
    }




}
