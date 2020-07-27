<%--
  Created by IntelliJ IDEA.
  User: 86185
  Date: 2020/7/27
  Time: 8:51
  To change this template use File | Settings | File Templates.
--%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <script type="text/javascript" src="js/jquery-1.8.2.min.js"></script>
    <link href="css/css.css" rel="stylesheet">
</head>
<body>
    <table>
        <tr>
            <td>
                <input type="checkbox">
            </td>
            <td>序号</td>
            <td>会议编号</td>
            <td>会义名</td>
            <td>开始时间</td>
            <td>结束时间</td>
            <td>会议类型</td>
            <td>创建时间</td>
        </tr>

            <c:forEach items="${list}" var="l">
                <tr>
                    <td> <input type="checkbox" value="${l.id}" class="ch"></td>
                <td>${l.id}</td>
                <td>${l.code}</td>
                <td>${l.name}</td>
                <td>${l.start_time}</td>
                <td>${l.end_time}</td>
                <td>${l.create_time}</td>
                <td>${l.tname}</td>
                </tr>
            </c:forEach>

        <tr>
            <td colspan="11">
                <button onclick="add()">新增</button>
                <button onclick="xiu()">编辑</button>
                <button onclick="fenye(${p.isIsFirstPage()?1:p.getPrePage()})">上一页</button>
                <c:forEach items="${p.navigatepageNums}" var="n">
                    <button onclick="fenye(${n})">${n}</button>
                </c:forEach>
                <button onclick="fenye(${p.isIsLastPage()?p.getPages():p.getNextPage()})">下一页</button>
            </td>
        </tr>
    </table>

</body>
    <script type="text/javascript">
        function fenye(cpage) {
            location = "list?cpage="+cpage;
        }
        function add() {
            location = "toAdd";

        }
        function xiu() {
            //获取id
            var a = $(".ch:checked").val();
            location = "toXiu?id="+a;
        }

    </script>
</html>
