package com.bookstore.entity;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

@Entity
public class Customer {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    @Column(name = "customer_id")
    private Integer customerId;
    private String email;
    private String fullName;
    private String address;
    private String city;
    private String country;
    @Column(name = "register_date",columnDefinition = "datetime")
    private LocalDate registerDate;
    private String password;
    private String phone;
    private String zipcode;
    @OneToMany(mappedBy = "customer",fetch = FetchType.LAZY)
    private Set<BookOrder> bookOrders = new HashSet<>();

    public Customer() {
    }

    public Customer(String email, String fullName, String address, String city, String country, LocalDate registerDate, String password, String phone, String zipcode) {
        this.email = email;
        this.fullName = fullName;
        this.address = address;
        this.city = city;
        this.country = country;
        this.registerDate = registerDate;
        this.password = password;
        this.phone = phone;
        this.zipcode = zipcode;
    }

    public Integer getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Integer customerId) {
        this.customerId = customerId;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public LocalDate getRegisterDate() {
        return registerDate;
    }

    public void setRegisterDate(LocalDate registerDate) {
        this.registerDate = registerDate;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getZipcode() {
        return zipcode;
    }

    public void setZipcode(String zipcode) {
        this.zipcode = zipcode;
    }

   }
