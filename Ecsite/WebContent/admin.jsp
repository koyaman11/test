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
	width: 780px;
    font-weight: 800;
    font-size: 20px;
    margin: 30px auto;
    border: 3px solid;
    border-radius: 10px;
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

#footer{
	width:100%;
	height:80px;
	background-color:black;
	clear:both;
}

.box_adimin{
    text-align: center;
    width: 60%;
    height: 50%;
 }
.text-center-left{
	displey:inline-block;
	text-align:center;
	float: right;
	wigth:60px;
	hight:60px;
	padding:0.5em 1em;
	margin:2em 0;
	font-weight: bold;
	color:#6091d3;/*文字色*/
	background:#FFF;
	border:solid 3px black; /*線*/
	border-radius: 10px; /*角野丸み*/
}
.text-center-right{
	displey:inline-block;
	text-align:center;
	float: right;
	wigth:60px;
	hight:60px;
	padding:0.5em 1em;
	margin:2em 0;
	 margin-left: 4px;
	font-weight: bold;
	color:#6091d3;/*文字色*/
	background:#FFF;
	border:solid 3px black; /*線*/
	border-radius: 10px; /*角野丸み*/
}

.sinki_btn{
	width: 70px;
    background-color: white;
    border-radius: 10px;
    color: #6091d3;
    border: 2px solid #6091d3;
}

.itiran_btn{
	width: 70px;
    background-color: white;
    border-radius: 10px;
    color: #6091d3;
    border: 2px solid #FF3399;
}
</style>

<script type="text/javascript">
  function submitAction(url){
   $('form').attr('action',url);
   $('form').submit();
}
</script>

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
		<div class=box_adimin>
			<div class="text-center-left">
				<p>商品</p>
 					<p><s:form action="ItemCreateAction">
 						<s:submit value="新規登録" class ="sinki_btn"/>
 					</s:form><br>
 						<s:form action="ItemListAction">
 						<s:submit value="一覧" class="itiran_btn"/>
 						</s:form>
			</div>
		<div class="text-center-right">
			<p>ユーザー</p>
			<p><s:form action="UserCreateAction">
 				<s:submit value="新規登録" class="sinki_btn"/>
 			</s:form><br>
			<s:form action="UserListAction">
 				<s:submit value="一覧" class="itiran_btn"/>
			 </s:form>
		</div>
	</div>
	 <div>
  		<span>Homeに戻る場合は<a href='<s:url action="GoHomeAction"/>'>こちら</a></span>
  	</div>
  	</div>

<div id="footer">
<div id="pr">
</div>
</div>


</body>
</html>