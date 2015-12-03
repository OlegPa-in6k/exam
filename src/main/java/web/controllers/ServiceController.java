package web.controllers;

import core.entity.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by employee on 12/3/15.
 */
@RestController
@RequestMapping(value = "/services")
public class ServiceController extends BaseControler {

    @RequestMapping(method = RequestMethod.GET)
    public List<Service> getServices() {
        return userService.getAllServices();
    }

    @RequestMapping(value = "/byType/{serviceTypeId}", method = RequestMethod.GET)
    public List<Service> getServicesBytype(@PathVariable("serviceTypeId") int serviceTypeId) {
        return userService.getServicesByType(serviceTypeId);
    }
}

