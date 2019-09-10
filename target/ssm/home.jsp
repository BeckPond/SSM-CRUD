<%@ page language="java" contentType="text/html; charset=utf-8"
         pageEncoding="utf-8" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8">
    <title>home</title>
</head>
<body>
hello
<br>
<br>
<a href="add"><strong>添加用户</strong></a>
<table>
    <tr>
        <th width="10%">编号</th>
        <th width="15%">用户号</th>
        <th width="15%">密码</th>
        <th width="15%">性别</th>
        <th width="15%">年龄</th>
        <th width="30%" colspan="2">操作</th>
    </tr>
    <c:forEach items="${list}" var="user">
        <tr>
            <td>${user.id }</td>
            <td>${user.name }</td>
            <td>${user.pwd }</td>
            <td>${user.sex }</td>
            <td>${user.age }</td>
            <td><a href="delete?id=${user.id }"><strong>删除</strong></a>&nbsp;<a
                    href="queryById?id=${user.id }"><strong>修改</strong></a></td>
        </tr>
    </c:forEach>
</table>
</body>
</html>
