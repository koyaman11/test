<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>御問い合わせフォーム</title>
</head>
<body>

<s:form method="post" action="InquiryCompleteAction">
名前:<input type="text" name="name"/><br>
御問い合わせの種類:<br>
<select name="qtype">
<option value="company">会社について</option>
<option value="product">製品について</option>
<option value="suppory">アフターサポートについて</option>
</select>
<br>
御問い合わせ内容:
<s:textarea name="body"/>
<br><s:submit value="登録"/>
</s:form>

</body>
</html>