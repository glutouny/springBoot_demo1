package com.yl.pojo;

import java.io.Serializable;

/**
 * @author 杨黎
 * @Title   User
 * @description 用户pojo
 * @DATE 2018/11/8  16:19
 */
public class User implements Serializable{

    private String id;//ID

    private String userName;//姓名

    private String password;//密码

    private Integer age;//年龄

    private String phone;//电话

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
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

    public User(String id, String userName) {
        this.id = id;
        this.userName = userName;
    }
}
