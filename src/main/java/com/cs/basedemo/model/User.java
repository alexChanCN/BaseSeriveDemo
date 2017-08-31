package com.cs.basedemo.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * Created by cs on 2017/8/1.
 */
@Entity
@Data
public class User {
    @Id
    @GeneratedValue
    private Integer id;
    private String username;
    private String password;

}
