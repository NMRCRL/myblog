<%--
  Created by IntelliJ IDEA.
  User: hp
  Date: 2019/11/21
  Time: 10:32
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>图片上传</title>
</head>
<body>
    <form action="/api/upload" method="post" enctype="multipart/form-data">
        <input type="file" name="filename">
        <input type="submit" value="上传">
    </form>
<p>${msg}</p>
<p>${url}</p>
</body>
</html>
