package com.weimingjian.springboot.jpa.multiple.datasource.moon.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

/**
 * @author weimingjian
 */
@Data
@Entity
@Table(name = "account" )
public class MoonAccount {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long accountId;
    private String accountName;
    private String accountToken;
    private String phone;
    private String email;
    private String des;
    private int status;
    private long expireTime;
    private long createTime;
    private Date updateTime;
}