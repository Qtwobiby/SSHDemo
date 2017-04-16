<%--
  Created by IntelliJ IDEA.
  User: chenqinqin
  Date: 17/4/16
  Time: 下午12:05
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

<%
    String path = request.getContextPath();
    String basePath = request.getContextPath() + "://"
    + request.getServerName() + ":" + request.getServerPort()
    + path + "/";
%>
<html>
<head>
    <base href="<%=basePath%>"/>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <script type="text/javascript" src="js/jquery-1.9.1.min.js"></script>
    <title>userInfo</title>
</head>
<body>
    全部用户信息:
    <c:forEach items="${ userInfos}" var="user">
        <div> 姓名: ${user.name} 年龄: ${user.age} 电话: ${user.telephone}
            <a target="_blank" href="user/userinfo!detail.action?id=${user.id}">json详情 </a>
        </div>
    </c:forEach>
</body>
</html>
