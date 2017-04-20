package com.nancy.shop.action;

import com.nancy.shop.entity.UserInfo;
import com.opensymphony.xwork2.Action;
import org.apache.struts2.convention.annotation.Namespace;

/**
 * Created by chenqinqin on 17/4/20.
 */
@Namespace("/login")
public class LoginAction implements Action {

    private UserInfo userInfo;
    private String tip;

    public UserInfo getUserInfo() {
        return userInfo;
    }

    public void setUserInfo(UserInfo userInfo) {
        this.userInfo = userInfo;
    }

    public String getTip() {
        return tip;
    }

    public void setTip(String tip) {
        this.tip = tip;
    }

    public String execute() throws Exception {
        if (getUserInfo().getName().equals("chenqinqin")
                && getUserInfo().getTelephone().equals("13235630442")) {
            setTip("转换成功");
            return SUCCESS;
        } else {
            setTip("转换失败");
            return ERROR;
        }
    }
}
