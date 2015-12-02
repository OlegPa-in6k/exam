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
//    private UserService core.service;
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
//    public UserService getService() {
//        return core.service;
//    }
//
//    public void setService(UserService core.service) {
//        this.core.service = core.service;
//    }
//
//
//
//
//
//}
