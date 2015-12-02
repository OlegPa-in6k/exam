package core.entity;

import javax.persistence.*;

/**
 * Created by employee on 12/2/15.
 */
@Entity
@Table(name = "Service")
public class Service {

    @Id
    @GeneratedValue
    @Column(name = "serviceId")
    private int serviceId;
    @Column(name = "serviceTitle")
    private String serviceTitle;
    @Column(name = "price")
    private int price;

    public ServiceType getServiceType() {

        return serviceType;
    }

    public void setServiceType(ServiceType serviceType) {
        this.serviceType = serviceType;
    }

    @ManyToOne
    @JoinColumn(name = "serviceTypeId")
    private ServiceType serviceType;
    public Service () {}



    public Service(int serviceId, String serviceTitle, int price) {
        this.serviceId = serviceId;
        this.serviceTitle = serviceTitle;
        this.price = price;

    }



    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getServiceTitle() {
        return serviceTitle;
    }

    public void setServiceTitle(String serviceTitle) {
        this.serviceTitle = serviceTitle;
    }

    public int getServiceId() {
        return serviceId;
    }

    public void setServiceId(int serviceId) {
        this.serviceId = serviceId;
    }



}
