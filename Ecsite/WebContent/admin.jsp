<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
<meta http-equiv="Content-Style-Type" content="text/css"/>
<meta http-equiv="Content-Script-Type" content="text/javascript"/>
<meta http-equiv="imagetoolbar" content="no">
<meta name="description" content=""/>
<meta name="keywords" content=""/>
<title>admin画面</title>

<style type="text/css">
body{
margin:0;
padding:0;
line-height:1.6;
letter-spacing:1px;
font-family:Verdana,Helvetica,sans-serif;
font-size:12px;
color:#333;
backgrount:#fff;
}

table{
text-align:center;
margin:0 auto;
}

#top{
width:780px;
margin:30px auto;
border:1px solid #333;
}

#header{
width:100%;
height:80px;
background-color:black;
}

#main{
width:100%;
height:500px;
text-align:center;
}


#box{

wigth:60px;
hight:60px;
padding:0.5em 1em;
margin:2em 0;
font-weight: bold;
color:#6091d3;/*文字色*/
background:#FFF;
border:solid 3px #6091d3; /*線*/
border-radius: 10px; /*角野丸み*/
}



#footer{
width:100%;
height:80px;
background-color:black;
clear:both;
}

#text-center{
displey:inline-block;
text-align:center;
}
<script type="text/javascript">
  function submitAction(url){
   $('form').attr('action',url);
   $('form').submit();
}
</script>

</style>
</head>
<body>

<div id="header">
<div id="pr">
</div>
</div>
<div id="main">
<div id="top">
<p>管理者画面</p>
</div>
<div>

<div id="text-center">
<div id="box">
<p>商品</p>
<p><input type="button" value="新規登録" onclick="submitAction('ItemCreateAction')"/><p>
<p><input type="button" value="ユーザー" onclick="submitAction('ItemListAction')"/><p>
</div></div>

<div id="text-center">
<div id="box">
<p>ユーザー</p>
<p><input type="button" value="新規登録" onclick="submitAction('UserCreateAction')"/><p>
<p><input type="button" value="ユーザー" onclick="submitAction('UserListAction')"/><p>
</div>
</div>


</div>
</div>

<div id="footer">
<div id="pr">
</div>
</div>


</body>
</html>