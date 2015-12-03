package web.controllers;

import core.entity.ServiceType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by employee on 12/2/15.
 */

@RestController
@RequestMapping(value = "/serviceTypes")
public class ServiceTypeController extends BaseControler{

    @RequestMapping(method = RequestMethod.GET)
    public List<ServiceType> getServiceTypes() {
        return userService.getAllServiceTypes();
    }

    @RequestMapping(value = "/add" ,method = RequestMethod.POST)
    public void addServiceType(@RequestBody String  serviceTypeName ) {
        ServiceType serviceType = new ServiceType();
        serviceType.setServiceTypeName(serviceTypeName);
        userService.addServiceType(serviceType);
    }

    @RequestMapping(value = "/delete/{serviceTypeId}", method = RequestMethod.DELETE)
    public void deleteServiceType(@PathVariable("serviceTypeId") int serviceTypeId ){
        userService.deleteServiceType(userService.getServiceTypeById(serviceTypeId));
    }

    @RequestMapping(value = "/{userId}", method = RequestMethod.GET)
    public List<ServiceType> showUserServiceTypes (@PathVariable("userId") int userId) {
        System.out.println(userService.getUserServiceTypes(userId));
        return userService.getUserServiceTypes(userId);

    }



}
