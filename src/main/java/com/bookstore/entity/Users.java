package com.bookstore.entity;

import javax.persistence.*;

@Entity
@NamedQueries({
        @NamedQuery(name = "Users.findAll",query = "SELECT u FROM Users u ORDER BY u.fullName"),
        @NamedQuery(name = "Users.countAll",query = "SELECT Count(*) FROM Users u")
})
@Table(name="users")
public class Users {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="user_id")
    private Integer userId;
    private String email;
    @Column(name="full_name")
    private String fullName;
    private String password;

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
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

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
