package com.bookstore.entity;

import java.util.Date;

public class Review {

    private Integer reviewId;
    private Book bookId;
    private Customer customerId;
    private String comment;
    private float rating;
    private Date reviewOn;
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

    public void setRating(float rating) {
        this.rating = rating;
    }

    public Date getReviewOn() {
        return reviewOn;
    }

    public void setReviewOn(Date reviewOn) {
        this.reviewOn = reviewOn;
    }

    public String getHeadline() {
        return headline;
    }

    public void setHeadline(String headline) {
        this.headline = headline;
    }
}
