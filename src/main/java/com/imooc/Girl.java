package com.imooc;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.io.Serializable;

/**
 * Created by yuanjie.fang on 2017/11/16.
 */
@Entity
public class Girl implements Serializable {

    private static final long serialVersionUID = -6022632440014352913L;
    @Id
    @GeneratedValue
    private Integer id;
    private String cupSize;
    private Integer age;

    public Girl() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCupSize() {
        return cupSize;
    }

    public void setCupSize(String cupSize) {
        this.cupSize = cupSize;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
