package com.nancy.shop.utils;

import com.alibaba.fastjson.JSON;
import org.apache.struts2.ServletActionContext;

import java.io.IOException;

/**
 * Created by chenqinqin on 17/4/16.
 */
public class AjaxUtil {

    public static void ajaxResponse(String text) {
        try {
            ServletActionContext.getResponse().setContentType("text/html;charset=utf-8");
            ServletActionContext.getResponse().getWriter().write(text);
            ServletActionContext.getResponse().getWriter().flush();
            ServletActionContext.getResponse().getWriter().close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void ajaxJSONResponse(Object object) {
        try {
            String json = JSON.toJSONStringWithDateFormat(object, "yyyy-mm-dd hh:mm:ss");
            ServletActionContext.getResponse().setContentType("text/html;charset=utf-8");
            ServletActionContext.getResponse().getWriter().write(json);
            ServletActionContext.getResponse().getWriter().flush();
            ServletActionContext.getResponse().getWriter().close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
