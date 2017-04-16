package com.nancy.shop.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

/**
 * Created by chenqinqin on 17/4/16.
 * @author chenqinqin
 *
 */
@Entity
@Table(name="user_info", catalog="shop")
public class UserInfo implements Serializable {
    private int id;
    private String name;
    private Integer age;
    private String telephone;

    public UserInfo() {
    }

    public UserInfo(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public UserInfo(int id, String name, Integer age, String telephone) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.telephone = telephone;
    }

    @Column(name = "telephone")
    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    @Id
    @Column(name="id", unique=true, nullable=false)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Column(name = "name", nullable = false)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Column(name = "age")
    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
