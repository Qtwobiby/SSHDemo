package com.nancy.shop.service;

import com.nancy.shop.entity.UserInfo;

import java.util.List;

/**
 * Created by chenqinqin on 17/4/16.
 */
public interface UserInfoService {
    UserInfo load(Integer id);

    UserInfo get(Integer id);

    List<UserInfo> findAll();

    void persist(UserInfo entity);

    Integer save(UserInfo entity);

    void saveOrUpdate(UserInfo entity);

    void delete(Integer id);

    void flush();
}
