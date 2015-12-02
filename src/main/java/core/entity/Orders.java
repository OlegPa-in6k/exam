//package core.entity;
//
//import javax.persistence.*;
//
///**
// * Created by employee on 12/2/15.
// */
//public class Orders {
//
//    @Id
//    @GeneratedValue
//    @Column(name = "orderId")
//    private Order order;
//
//    @OneToOne
//    @JoinColumn(name = "serviceTypeId")
//    private MainService service;
//
//    public Order() { }
//
//    public Order getOrder() {
//        return order;
//    }
//
//    public void setOrder(Order order) {
//        this.order = order;
//    }
//
//    public MainService getService() {
//        return service;
//    }
//
//    public void setService(MainService service) {
//        this.service = service;
//    }
//
//
//
//
//
//}
