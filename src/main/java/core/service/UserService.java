package core.service;

import core.entity.ServiceType;
import core.entity.User;
import org.hibernate.exception.ConstraintViolationException;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.stereotype.Service;
import persistence.ServiceDaoImpl;
import persistence.ServiceTypeImpl;
import persistence.UserDaoImpl;

import java.util.List;

/**
 * Created by employee on 12/2/15.
 */
@Service
public class UserService extends BaseService {

    public UserDaoImpl userSearch;

    public ServiceTypeImpl serviceTypeSearch;

    public ServiceDaoImpl serviceSearch;

    public UserService(UserDaoImpl userSearch, ServiceTypeImpl serviceTypeSearch, ServiceDaoImpl serviceSearch) {
        this.userSearch = userSearch;
        this.serviceTypeSearch = serviceTypeSearch;
        this.serviceSearch = serviceSearch;
    }


    public List<User> getAllUsers() {
        return userSearch.getAll();
    }

    public void addUser(User user) {
        try {
            userSearch.create(user);
        } catch (ConstraintViolationException e) {

        }

    }

    public void deleteUser(User user) {
        try {
            userSearch.delete(user);
        } catch (DataIntegrityViolationException e) {

        }
    }

    public User getUserById(int userId) {
        return userSearch.read(userId);
    }

    public ServiceType getTypeServiceById(int serviceTypeId) {
        return serviceTypeSearch.read(serviceTypeId);
    }


    public List<ServiceType> getAllServiceTypes() {
        return serviceTypeSearch.getAll();
    }

    public void addServiceType(ServiceType serviceType) {
        try {
            serviceTypeSearch.create(serviceType);
        } catch (ConstraintViolationException e) {

        }
    }

    public void deleteServiceType(ServiceType serviceType) {
        try {
            serviceTypeSearch.delete(serviceType);
        } catch (DataIntegrityViolationException e) {

        }
    }

    public ServiceType getServiceTypeById(int serviceTypId) {
        return serviceTypeSearch.read(serviceTypId);
    }

    public List<core.entity.Service> getAllServices() {
        return serviceSearch.getAll();
    }

    public List<core.entity.Service> getServicesByType(int serviceTypeId) {
        return serviceSearch.getServicesByType(serviceTypeId);
    }

    public List<ServiceType> getUserServiceTypes (int userId){
        return serviceTypeSearch.getUserServiceTypes(userId);
    }


}
