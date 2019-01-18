package com.weimingjian.springboot.mybatis.generator.configuration.model;

import java.util.Date;

import javax.persistence.Table;

import lombok.Data;

/**
 * @author weimingjian
 */
@Data
@Table(name = "account")
public class Account {
    private Long accountId;

    private String accountName;

    private String accountToken;

    private String phone;

    private String email;

    private String des;

    private Byte status;

    private Long expireTime;

    private Long createTime;

    private Date updateTime;
}