package edu.lgx.auths.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

/**
 * @Author: LGX-LUCIFER
 * @Date: 2022-03-06 20:58
 * @Description:
 */
@Entity
@Table(name = "pt_perms")
public class Perms implements Serializable {

    private static final long serialVersionUID = -5127979011341169185L;

    @Id
    private String id;

    private String name;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
