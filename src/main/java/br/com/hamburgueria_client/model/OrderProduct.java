package br.com.hamburgueria_client.model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "order_product")
@Data
public class OrderProduct {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "order_id")
    private OrderModel order;

    @ManyToOne
    @JoinColumn(name = "product_id")
    private ProductModel product;

    private String note;
    private Integer quantity;
}
