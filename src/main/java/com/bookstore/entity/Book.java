package com.bookstore.entity;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

@Entity
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "book_id")
    private Integer bookId;
    @ManyToOne(cascade = CascadeType.PERSIST)
    @JoinColumn(name = "category_id")
    private Category category;
    private String title;
    private String author;
    @Column(columnDefinition = "mediumtext")
    private String description;
    private String isbn;
    @Column(columnDefinition = "blob")
    private byte[] image;
    @Column(columnDefinition = "float")
    private BigDecimal price;
    @Column(name = "publish_date")
    private LocalDate publishDate;
    @Column(name = "last_update_time",columnDefinition = "datetime")
    private LocalDate lastUpdatedOn;

    public Book() {
    }

    public Integer getBookId() {
        return bookId;
    }

    public void setBookId(Integer bookId) {
        this.bookId = bookId;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public byte[] getImage() {
        return image;
    }

    public void setImage(byte[] image) {
        this.image = image;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public LocalDate getPublishDate() {
        return publishDate;
    }

    public void setPublishDate(LocalDate publishDate) {
        this.publishDate = publishDate;
    }

    public LocalDate getLastUpdatedOn() {
        return lastUpdatedOn;
    }

    public void setLastUpdatedOn(LocalDate lastUpdatedOn) {
        this.lastUpdatedOn = lastUpdatedOn;
    }

   }
