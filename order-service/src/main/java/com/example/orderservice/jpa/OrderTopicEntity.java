package com.example.orderservice.jpa;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "example_order_topic") // 테이블 이름을 명시 (필요시 수정)
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class OrderTopicEntity {

    @Id
    @Column(name = "order_id") // 주문 ID
    private String orderId;

    @Column(name = "user_id") // 사용자 ID
    private String userId;

    @Column(name = "product_id") // 상품 ID
    private String productId;

    @Column(name = "qty") // 수량
    private int qty;

    @Column(name = "unit_price") // 단가
    private int unitPrice;

    @Column(name = "total_price") // 총 가격
    private int totalPrice;

    @Column(name = "service_id") // 서비스 ID
    private String serviceId;
}
