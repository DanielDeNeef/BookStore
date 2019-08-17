package com.bookstore.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;

@Entity
@Table(name = "order_detail")
public class OrderDetail implements Serializable {

    @Id
    @ManyToOne
    @JoinColumn(name = "order_id")
    private BookOrder orderId;
    @Id
    @ManyToOne
    @JoinColumn(name = "book_id")
    private Book bookid;
    private int quantity;
    @Column(columnDefinition = "float")
    private BigDecimal subtotal;

    public BookOrder getOrderId() {
        return orderId;
    }

    public void setOrderId(BookOrder orderId) {
        this.orderId = orderId;
    }

    public Book getBookid() {
        return bookid;
    }

    public void setBookid(Book bookid) {
        this.bookid = bookid;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public BigDecimal getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(BigDecimal subtotal) {
        this.subtotal = subtotal;
    }
}
