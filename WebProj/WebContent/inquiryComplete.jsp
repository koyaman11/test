<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>御問い合わせ　受付完了</title>
</head>
<body>

<s:property value="name"/>さん、御問い合わせありがとうございました。

<br>
<br>御問い合わせの種類:<br>
<s:if test='qtype=="company"'>
会社について
</s:if>
<s:if test='qtype=="product"'>
製品について
</s:if>

<s:if test='qtype=="support"'>
アフターサポートについて
</s:if>

<br>
<br>問い合わせ内容<br>
<s:property value="body"/>



</body>
</html>