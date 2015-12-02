package core.entity;

import javax.persistence.*;

/**
 * Created by employee on 12/2/15.
 */
@Entity
@Table(name = "ServiceType")
public class ServiceType {

    @Id
    @GeneratedValue
    @Column(name = "serviceTypeId")
    private int serviceTypeId;

    @Column(name = "serviceTypeName")
    private String serviceTypeName;

}
