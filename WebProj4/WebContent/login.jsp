<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>LOGIN</title>
</head>
<body>

<s:property value="LoginDTOList.get(0).username"/>さん、ようこそ！

<br>
<table>
<tbody>
<tr>
	<th>USERNAME</th>
	<th>PASSWORD</th>
</tr>

<s:iterator value="LoginDTOList">
<tr>
	<td><s:property value="username"/></td>
	<td><s:property value="password"/></td>
</tr>
</s:iterator>


</tbody>
</table>

</body>
</html>