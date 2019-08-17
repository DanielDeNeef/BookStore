package com.bookstore.entity;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Date;
@Entity
@Table(name = "book_order")
public class BookOrder {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "order_id")
    private int orderId;
    @ManyToOne
    @JoinColumn(name = "customer_id")
    private Customer customerId;
    @Column(name = "order_date",columnDefinition = "datetime")
    private LocalDate orderDate;
    @Column(columnDefinition = "float")
    private BigDecimal total;
    private String status;
    @Column(name = "shipping_address")
    private String shippingAddress;
    @Column(name = "payment_method")
    private String paymentMethod;
    @Column(name = "recipient_name")
    private String recipientName;
    @Column(name= "recipient_phone")
    private String recipientPhone;

    public BookOrder() {
    }

    public int getOrderId() {
        return orderId;
    }

    public String getRecipientPhone() {
        return recipientPhone;
    }

    public void setRecipientPhone(String recipientPhone) {
        this.recipientPhone = recipientPhone;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public Customer getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Customer customerId) {
        this.customerId = customerId;
    }

    public LocalDate getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(LocalDate orderDate) {
        this.orderDate = orderDate;
    }

    public BigDecimal getTotal() {
        return total;
    }

    public void setTotal(BigDecimal total) {
        this.total = total;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getShippingAddress() {
        return shippingAddress;
    }

    public void setShippingAddress(String shippingAddress) {
        this.shippingAddress = shippingAddress;
    }

    public String getPaymentMethod() {
        return paymentMethod;
    }

    public void setPaymentMethod(String paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public String getRecipientName() {
        return recipientName;
    }

    public void setRecipientName(String recipientName) {
        this.recipientName = recipientName;
    }

}
