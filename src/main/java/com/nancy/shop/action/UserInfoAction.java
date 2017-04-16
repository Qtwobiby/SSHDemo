package com.nancy.shop.action;

import com.nancy.shop.entity.UserInfo;
import com.nancy.shop.service.UserInfoService;
import com.nancy.shop.utils.AjaxUtil;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.opensymphony.xwork2.Preparable;
import org.apache.log4j.Logger;
import org.apache.struts2.ServletActionContext;
import org.apache.struts2.convention.annotation.Namespace;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * Created by chenqinqin on 17/4/16.
 */
@Namespace("/user")
public class UserInfoAction extends ActionSupport implements ModelDriven<UserInfo>,Preparable {

    private static final Logger LOGGER = Logger.getLogger(UserInfoAction.class);
    private Integer id;
    private UserInfo userInfo;
    private List<UserInfo> userInfos;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public UserInfo getUserInfo() {
        return userInfo;
    }

    public void setUserInfo(UserInfo userInfo) {
        this.userInfo = userInfo;
    }

    public List<UserInfo> getUserInfos() {
        return userInfos;
    }

    public void setUserInfos(List<UserInfo> userInfos) {
        this.userInfos = userInfos;
    }

    @Autowired
    private UserInfoService userInfoService;

    public UserInfo getModel() {
        if (null != id) {
            userInfo = userInfoService.get(id);
        } else {
            userInfo = new UserInfo();
        }
        return userInfo;
    }

    @Override
    public String execute() {
        LOGGER.info("查询所有用户");
        userInfos = userInfoService.findAll();
        return SUCCESS;
    }

    public void detail() {
        String id = ServletActionContext.getRequest().getParameter("id");
        LOGGER.info("查看用户详情" + id);
        userInfo = userInfoService.get(Integer.valueOf(id));
        AjaxUtil.ajaxJSONResponse(userInfo);
    }

    public void prepare() throws Exception {

    }
}
