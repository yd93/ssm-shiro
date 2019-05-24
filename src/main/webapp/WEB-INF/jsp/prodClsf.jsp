<%--
  Auhor: yd93
  Date: 2019/5/14
  Time: 22:39
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page isELIgnored="false" %>
<html>
<head>
    <style>
        td{
            white-space: nowrap;
        }
    </style>
    <title>商品信息详情页面</title>
</head>
<body>
<table width="100%",height="auto" border="1" cellspacing="0" align="center">
    <caption>商品信息展示</caption>
    <tr>
        <td>条码</td>
        <td>款号</td>
        <td>商品名称</td>
        <td>商品类别</td>
        <td>年份</td>
        <td>季节</td>
        <td>大类</td>
        <td>波段</td>
        <td>挂牌单价</td>
        <td>更新日期</td>
        <td>色号</td>
        <td>尺码</td>
    </tr>
    <c:forEach items="${product}" var="product">
        <tr>
            <td>${product.prodNum}</td>
            <td>${product.prodClsNum}</td>
            <td>${product.prodName}</td>
            <td>${product.prodType}</td>
            <td>${product.year}</td>
            <td>${product.season}</td>
            <td>${product.prodBoard}</td>
            <td>${product.mktRgn}</td>
            <td>${product.sysPrice}</td>
            <td>${product.updateTime}</td>
            <td>${product.color}</td>
            <td>${product.spec}</td>
        </tr>
    </c:forEach>
</table>
</body>
</html>
