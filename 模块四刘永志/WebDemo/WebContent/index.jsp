<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" import="java.util.*" isELIgnored="false"%>
<html>

<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>管理员后台</title>
</head>
<body>

<a href="selectDR.html">禁言用户一览</a><br/>
<a href="selectDPC.html">禁课用户一览</a><br/>
<form action="/WebDemo/addDR" role="form">
    用户：<input type="text" name="addDRUserID"><br/>
    原因：<input type="text" name="addDRreason"><br/>
    <input type="submit" value="用户禁言"><br/>
</form>
<form action="/WebDemo/delDR" role="form">
    用户：<input type="text" name="delDRUserID"><br/>
    <input type="submit" value="解除禁言"><br/>
<form action="/WebDemo/addDPC" role="form">
    用户：<input type="text" name="addDPCUserID"><br/>
    原因：<input type="text" name="addDPCreason"><br/>
    <input type="submit" value="用户禁课"><br/>
</form>

</body>
</html>
