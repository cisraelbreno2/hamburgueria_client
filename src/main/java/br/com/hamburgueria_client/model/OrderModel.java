package br.com.hamburgueria_client.model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "order")
@Data
public class OrderModel {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "client_id")
    private ClientModel client;

    @Column(name = "order_number")
    private Long orderNumber;

    @ManyToOne
    @JoinColumn(name = "router_id")
    private RouteModel router;

}
