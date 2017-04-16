package com.nancy.shop.service.impl;

import com.nancy.shop.entity.UserInfo;
import com.nancy.shop.dao.UserInfoDao;
import com.nancy.shop.service.UserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by chenqinqin on 17/4/16.
 */
@Service("userInfoService")
public class UserInfoServiceImpl implements UserInfoService {

    @Autowired
    private UserInfoDao userInfoDao;

    public UserInfo load(Integer id) {
        return null;
    }

    public UserInfo get(Integer id) {
        return userInfoDao.get(id);
    }

    public List<UserInfo> findAll() {
        return userInfoDao.findAll();
    }

    public void persist(UserInfo entity) {
        userInfoDao.persist(entity);
    }

    public Integer save(UserInfo entity) {
        return userInfoDao.save(entity);
    }

    public void saveOrUpdate(UserInfo entity) {
        userInfoDao.saveOrUpdate(entity);
    }

    public void delete(Integer id) {
        userInfoDao.delete(id);
    }

    public void flush() {
        userInfoDao.flush();
    }
}
