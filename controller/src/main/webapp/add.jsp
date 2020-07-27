<%--
  Created by IntelliJ IDEA.
  User: 86185
  Date: 2020/7/27
  Time: 9:40
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <script type="text/javascript" src="js/jquery-1.8.2.min.js"></script>
    <link href="css/css.css" rel="stylesheet">
</head>
<body>
    <form action="add" method="post">

        会议编号：<input type="text" name="code"><br>
        会议名称：<input type="text" name="name"><br>
        会议时间 ：<input type="text" name="start_time">
                    至<input type="text" name="end_time"><br>
        会议地址：<select name = "type">

                    </select><br>
        会议编号：<input type="submit" value="保存"><br>
    </form>

</body>
    <script type="text/javascript">
        $.post(
            "listType",
            function (obj) {
                alert(obj)
                for (var i in obj) {
                    $("[name='type']").append(" <option value="+obj[i].tid+">"+obj[i].tname+"</option>")
                }

            }
        );

    </script>
</html>
