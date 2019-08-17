package com.bookstore.entity;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.Date;

@Entity
public class Review {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    @Column(name = "review_id")
    private Integer reviewId;
    @ManyToOne
    @JoinColumn(name = "book_id")
    private Book bookId;
    @ManyToOne
    @JoinColumn(name="customer_id")
    private Customer customerId;
    private String comment;
    private int rating;
    @Column(name = "review_time",columnDefinition = "datetime")
    private LocalDate reviewOn;
    private String headline;

    public Integer getReviewId() {
        return reviewId;
    }

    public void setReviewId(Integer reviewId) {
        this.reviewId = reviewId;
    }

    public Book getBookId() {
        return bookId;
    }

    public void setBookId(Book bookId) {
        this.bookId = bookId;
    }

    public Customer getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Customer customerId) {
        this.customerId = customerId;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public float getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public LocalDate getReviewOn() {
        return reviewOn;
    }

    public void setReviewOn(LocalDate reviewOn) {
        this.reviewOn = reviewOn;
    }

    public String getHeadline() {
        return headline;
    }

    public void setHeadline(String headline) {
        this.headline = headline;
    }
}
