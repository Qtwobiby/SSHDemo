<%--
  Created by IntelliJ IDEA.
  User: chenqinqin
  Date: 17/4/19
  Time: 下午8:20
  To change this template use File | Settings | File Templates.
--%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Tansitional//EN"
    "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="s" uri="/struts-tags" %>
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
    <title>简单的文件上传</title>
</head>
<body>
<s:form action="upload" enctype="multipart/form-data">
    <s:textfield name="title" label="文件标题"/><br/>
    <s:file name="upload" label="选择文件" /><br/>
    <s:submit value="上传"/>
</s:form>
</body>
</html>
