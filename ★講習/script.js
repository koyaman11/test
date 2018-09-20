document.write("<h1>JavaScript 課題集</h1><br>");

document.write("【課題内容】");
document.write("<br>");
document.write("＝ルール＝<br>");
document.write("・言語はjavascriptとします。<br>");
document.write("・出力方法は問いません(for文、if文などを使用します)。<br>");
document.write("<br>");


document.write("■■■問１■■■<br>");
document.write("以下のような実行結果を出力せよ<br>問１の実行結果<br><br>");

document.write("ココカラ―――――<br>")
var a=1;
while(a<=5){
    document.write("★");a++;
}
document.write("<br>");
document.write("―――――ココマデ<br><br>");


document.write("■■■問２■■■<br>");
document.write("以下のような実行結果を出力せよ<br>問２の実行結果<br><br>");
document.write("ココカラ――――<br>")
for(var b=1;b<=2;b++){
    for(var c=1;c<=3;c++){
        document.write("★");
    }
    document.write("<br>");       
}
document.write("――――ココマデ<br><br>");


document.write("■■■問３■■■<br>");
document.write("以下のような実行結果を出力せよ<br>問３の実行結果<br><br>");
document.write("ココカラ――――<br>");
for(var d=1;d<=2;d++){
    for(var e=2;e<=6;e++){
        document.write("☆");}
    document.write("<br>");   
}

document.write("――――ココマデ<br><br>");


document.write("■■■問４■■■<br>");
document.write("以下のような実行結果を出力せよ<br>問４実行結果<br><br>");

document.write("ココカラ――――<br>");
for(var f=1;f<=4;f++){
    for(var g=1;g<=5;g++){
        
    document.write("★");
    }
    document.write("<br>");
    
}

document.write("――――ココマデ<br><br>");


document.write("■■■問５■■■<br>以下のような実行結果を出力せよ<br>問５の実行結果<br>");
document.write("ココカラ――――<br>");

for(var h=1;h<=4;h++){
    for(var i=1;i<=3;i++){
        document.write("★");
    }
    document.write("<br>")
}
document.write("――――ココマデ<br><br>");

document.write("■■■問６■■■<br>以下のような実行結果を出力せよ<br>問６の実行結果<br><br>");

document.write("ココカラ――――<br>");

for(var no1=0;no1<3;no1++){
 for(var no2=0;no2<3;no2++){
     if(no2%2==0){
     document.write("★"); }else{document.write("☆");}
 }
document.write("<br>");
}
document.write("――――ココマデ<br><br>")

document.write("■■■問７■■■<br>以下のような実行結果を出力せよ<br>問の実行結果<br><br>");


for(var no3=0;no3<4;no3++){
    for(var no4=0;no4<=5;no4++){
        if(no4%2==0){
        document.write("★");
    }else{document.write("☆");}

}
    document.write("<br>");
}

document.write("――――ココマデ<br><br>");

document.write("■■■問８■■■<br>以下のような実行結果を出力せよ<br>問８の実行結果<br><br>");

for(var box=1;box<=5;box++){
    for(var box2=0;box2<box;box2++){
        document.write("★");
    }document.write("<br>");
}

