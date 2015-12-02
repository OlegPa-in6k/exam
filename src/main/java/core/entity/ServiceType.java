package core.entity;

import javax.persistence.*;

/**
 * Created by employee on 12/2/15.
 */
@Entity
@Table(name = "serviceType")
public class ServiceType {

    @Id
    @GeneratedValue
    @Column(name = "serviceTypeId")
    private int serviceTypeId;

    @Column(name = "serviceTypeName")
    private String serviceTypeName;

    public int getServiceTypeId() {
        return serviceTypeId;
    }

    public void setServiceTypeId(int serviceTypeId) {
        this.serviceTypeId = serviceTypeId;
    }

    public String getServiceTypeName() {
        return serviceTypeName;
    }

    public void setServiceTypeName(String serviceTypeName) {
        this.serviceTypeName = serviceTypeName;
    }
}
