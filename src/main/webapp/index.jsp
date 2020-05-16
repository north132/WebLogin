<%@ page language="java" contentType="text/html; charset=gb2312" pageEncoding="gb2312" %>
<html>
    <head>
        <meta http-equiv="content-Type" content="text/html;charset=gb2312">
        <title>Login</title>
    </head>
    <body>
        <form action="LoginServlet" method="post">
            <table>
                <tr>
                    <td>用户名:</td>
                    <td><input type="text" name="name"/></td>
                </tr>
                <tr>
                    <td>密码:</td>
                    <td><input type="password" name="password"/></td>
                </tr>
                <tr>
                    <td>验证码:</td>
                    <td><input type="text" name="validCode"/></td>
                </tr>
                <tr>
                    <td colspan="2"><img onclick="changeCode();" alt="" src="ValidCode" id="_img" width="80" height="30"/></td>
                    <script>
                        function changeCode(){
                            document.getElementById("_img").src="ValidCode";
                        }
                    </script>
                </tr>
                <tr>
                    <td><input type="submit" value="login"/></td>
                </tr>
            </table>
        </form>
    </body>
</html>
