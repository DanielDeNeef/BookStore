package com.bookstore.entity;

import java.math.BigDecimal;


public class OrderDetail{

    private BookOrder orderId;
    private Book bookid;
    private int quantity;
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
