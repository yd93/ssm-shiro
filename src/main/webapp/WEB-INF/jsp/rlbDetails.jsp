<%--
  Auhor: yd93
  Date: 2019/5/14
  Time: 15:04
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page isELIgnored="false" %>
<html>
<head>
    <meta name="viewport" content="width=device-width,initial-scale=1.0">
    <title>零售小票详情页</title>
    <style type="text/css">
        td{
            white-space: nowrap;
        }
    </style>
</head>
<body>
<table width="100%",height="auto" border="1" cellspacing="0" align="center">
    <caption>零售小票</caption>
    <tr>
        <td>店铺名称</td>
        <td>单号</td>
        <td>单据日期</td>
        <td>条码</td>
        <td>款号</td>
        <td>色号</td>
        <td>尺寸</td>
        <td>零售价</td>
        <td>折扣</td>
        <td>成交价</td>
        <td>数量</td>
        <td>零售金额</td>
        <td>成交金额</td>
        <td>创建人</td>
        <td>创建时间</td>
        <td>VIP</td>
        <td>营业员</td>
        <td>备注</td>
    </tr>
    <c:forEach items="${rlb}" var="details">
        <tr><td>${details.unitName}</td>
            <td>${details.rlbNum}</td>
            <td>${details.docDate}</td>
            <td>${details.prodNum}</td>
            <td>${details.prodClsNum}</td>
            <td>${details.color}</td>
            <td>${details.spec}</td>
            <td>${details.sysPrice}</td>
            <td>${details.discRate}</td>
            <td>${details.discRatePrice}</td>
            <td>${details.sellQty}</td>
            <td>${details.sellVal}</td>
            <td>${details.discSellVal}</td>
            <td>${details.prsnlNum}</td>
            <td>${details.tranlTime}</td>
            <td>${details.vip}</td>
            <td>${details.salesMan}</td>
            <td>${details.remarks}</td>
        </tr>
    </c:forEach>
</table>
</body>
</html>
