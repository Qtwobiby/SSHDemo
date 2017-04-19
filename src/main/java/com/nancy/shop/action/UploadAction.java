package com.nancy.shop.action;

import com.opensymphony.xwork2.ActionSupport;
import org.apache.struts2.ServletActionContext;
import org.apache.struts2.convention.annotation.Namespace;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.File;
/**
 * Created by chenqinqin on 17/4/19.
 */

public class UploadAction extends ActionSupport {
    private String title;
    private File upload;
    private String uploadContentType;
    private String uploadFileName;
    private String savePath;

    public void setSavePath(String value) {
        this.savePath = value;
    }

    private String getSavePath() throws Exception {
        return ServletActionContext.getServletContext().getRealPath("/WEB-INF/" + savePath);
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public File getUpload() {
        return upload;
    }

    public void setUpload(File upload) {
        this.upload = upload;
    }

    public String getUploadContentType() {
        return uploadContentType;
    }

    public void setUploadContentType(String uploadContentType) {
        this.uploadContentType = uploadContentType;
    }

    public String getUploadFileName() {
        return uploadFileName;
    }

    public void setUploadFileName(String uploadFileName) {
        this.uploadFileName = uploadFileName;
    }

    @Override
    public String execute() throws Exception {
        FileOutputStream fos = new FileOutputStream(getSavePath() + "\\" + getUploadFileName());
        FileInputStream fis = new FileInputStream(getUpload());
        byte[] buffer = new byte[1024];
        int len = 0;
        while ((len = fis.read(buffer)) > 0) {
            fos.write(buffer, 0, len);
        }
        return SUCCESS;
    }
}
