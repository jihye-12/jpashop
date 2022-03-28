package jpabook.jpashop.domain;

import jpabook.jpashop.domain.item.DeliveryStatus;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.concurrent.DelayQueue;

@Entity
@Getter @Setter
public class Delivery {

    @Id
    @GeneratedValue
    @Column(name = "delivery_id")
    private Long id;

    @OneToOne(mappedBy = "delivery")
    private Order order;

    @Embedded
    private Address address;

    @Enumerated(EnumType.STRING)
    private DeliveryStatus status;
}
