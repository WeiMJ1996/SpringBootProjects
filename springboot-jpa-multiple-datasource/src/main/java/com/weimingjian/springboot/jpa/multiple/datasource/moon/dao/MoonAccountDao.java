package com.weimingjian.springboot.jpa.multiple.datasource.moon.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.weimingjian.springboot.jpa.multiple.datasource.moon.model.MoonAccount;

/**
 * @author weimingjian
 */
public interface MoonAccountDao extends JpaRepository<MoonAccount, Long> {
}
