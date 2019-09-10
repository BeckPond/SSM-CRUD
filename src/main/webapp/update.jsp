<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>hoo</title>
    <style type="text/css">
        #demo {
            position: absolute;
            left: 40%;
            right: 60%;
            top: 20%;
            bottom: 80%;
        }
    </style>
</head>
<body>
<form action="update" method="post">
    <table id="demo">
            <tr>
                <td><h3>信息</h3></td>
            </tr>
            <tr>
                <td>id:</td>
                <td><input type="text" name="id" value="${user.id}"
                           readonly="readonly" /></td>
            </tr>
            <tr>
                <td>name:</td>
                <td><input type="text" name="name" value="${user.name}" /></td>
            </tr>
            <tr>
                <td>password:</td>
                <td><input type="text" name="pwd" value="${user.pwd}" /></td>
            </tr>
            <tr>
                <td>sex:</td>
                <td><input type="text" name="sex" value="${user.sex}" /></td>
            </tr>
            <tr>
                <td>age:</td>
                <td><input type="text" name="age" value="${user.age}" /></td>
            </tr>
            <tr>
                <td colspan="2"><input type="submit" value="提交" /> <input type="button"
                                                                          value="返回" onclick="history.go(-1)" /></td>
            </tr>
        </table>
</form>
</body>
</html>