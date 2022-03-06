package edu.lgx.auths.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.util.Date;

/**
 * @Author: LGX-LUCIFER
 * @Date: 2022-03-06 16:33
 * @Description:
 */
@Entity
@Table(name = "pt_user")
public class User implements Serializable {

    private static final long serialVersionUID = -1256427537736992658L;

    @Id
    private String id;

    private String username;

    private String password;

    private String phone;

    private Date created;

    private String status;

    public User() {
    }

    public User(String id, String username, String password, String phone, Date created, String status) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.phone = phone;
        this.created = created;
        this.status = status;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
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

    public Date getCreated() {
        return created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
