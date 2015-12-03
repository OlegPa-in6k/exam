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
        return adminService.getAllServiceTypes();
    }

    @RequestMapping(value = "/add" ,method = RequestMethod.POST)
    public void addServiceType(@RequestBody String  serviceTypeName ) {
        ServiceType serviceType = new ServiceType();
        serviceType.setServiceTypeName(serviceTypeName);
        adminService.addServiceType(serviceType);
    }

    @RequestMapping(value = "/delete/{serviceTypeId}", method = RequestMethod.DELETE)
    public void deleteServiceType(@PathVariable("serviceTypeId") int serviceTypeId ){
        adminService.deleteServiceType(adminService.getServiceTypeById(serviceTypeId));
    }

    @RequestMapping(value ="/showById/{serviceTypeId}", method = RequestMethod.GET)
    public void showServiceTypeById (@PathVariable("serviceTypeId") int serviceTypeId){

    }

}
