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
    private BookOrder bookorder;
    @Id
    @ManyToOne
    @JoinColumn(name = "book_id")
    private Book book;
    private int quantity;
    @Column(columnDefinition = "float")
    private BigDecimal subtotal;

    public BookOrder getBookorder() {
        return bookorder;
    }

    public void setBookorder(BookOrder orderId) {
        this.bookorder = orderId;
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book bookid) {
        this.book = bookid;
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
