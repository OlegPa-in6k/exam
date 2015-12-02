package core.entity;

import javax.persistence.*;

/**
 * Created by employee on 12/2/15.
 */
public class Order {

    @Id
    @GeneratedValue
    @Column(name = "orderId")
    private Order order;

    @OneToOne
    @JoinColumn(name = "serviceTypeId")
    private Service service;

    public Order() { }

    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }

    public Service getService() {
        return service;
    }

    public void setService(Service service) {
        this.service = service;
    }





}
