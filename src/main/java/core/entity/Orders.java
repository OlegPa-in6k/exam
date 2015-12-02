package core.entity;


import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

/**
 * Created by employee on 12/2/15.
 */

@Entity
@Table(name = "orders")
public class Orders implements Serializable{

    @ManyToOne
    @JoinColumn(name = "serviceId")
    private Service service;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "billId")
    @EmbeddedId
    private Bill bill;

    public Bill getBill() {
        return bill;
    }

    public void setBill(Bill bill) {
        this.bill = bill;
    }

    public Service getService() {
        return service;
    }

    public void setService(Service service) {
        this.service = service;
    }


}
