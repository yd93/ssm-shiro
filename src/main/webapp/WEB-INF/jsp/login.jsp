<%--
  Auhor: yd93
  Date: 2019/5/23
  Time: 16:39
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>登录界面</title>
</head>
<body>
欢迎来到shiro的世界！！！
<form action="${pageContext.request.contextPath}/user/login" method="post">
    用户名：<input type="text" name="userName" value="${user.userName}"><br>
    密码：<input type="password" name="password"><br>
    <input type="submit" value="登录">
</form>
</body>
</html>
