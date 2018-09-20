document.write("hehoo world");

document.write("私の名前は田中です。");

document.write("年齢は25歳です。");

document.write("あいうえお<br>")
document.write("かきくけこ<br>");
document.write("さしすせそ<br>");

document.write("月曜日<br>火曜日<br>水曜日");

document.write("<h1>あいうえお</h1>");
document.write("<p>かきくけこ<p>");
document.write("さしすせそ");

document.write(2017813);

document.write("<br>");

document.write(20.3);

document.write(-100);

document.write("<br>");

document.write(53+10);

document.write("heloo world");

document.write("Good!");

document.write("090-1111-2222");

document.write("携帯番号");
document.write("<br>");


var number=208;
document.write(number);

var tell="090-0000-1234";
document.write(tell);

var name="jody"
document.write(name);

var name2="高橋さんと田中さん";

document.write(name2);

var cost="2001円";
document.write(cost);

var month=12;
document.write(month+"月");

var day=25;
document.write(day+"日");

var youbi="木";
document.write(youbi+"曜日");

document.write("<br>");

document.write(3*3);

document.write(4/2);


var b=55-28;
document.write(b);

var c=10*2;
document.write(c);

var d="3+6";
    document.write(d);

var e="2+3";
var f="4-1";
document.write(e);
    document.write("<br>");
document.write(f);

var g=5*5;
var h="5*5";

document.write(h+"="+g);

var abc1=10%3;
document.write(abc1);

var abc2=5%2;
document.write("5÷2のお余りは"+abc2);

var abc3="8%2";
document.write(abc3);

var abc4=3%2;
var abc5=1;
document.write(abc4+"="+abc5);

document.write("<br>");

var v1=2;
if(v1<10){
    document.write("A");}


var age=18;
var seibetsu="女性";
if(age>=18){
    if(seibetsu=="女性"){
        document.write("Aさん");
    }else if(seibetsu=="男性"){
        document.write("Bさん");
    }else{
        document.write("Cさん");
    }
}

var month=5;
var day=28;
if(month<=12){
    if(day<=15){
        document.write("月の前半");
    }else if(day>=15){
        document.write("月の後半");
    }
}

var test1=80;
var test2=96;
if(test1>=80){
    if(test2<=89){
        dosument.write("不合格");
    }else if(test2>=90){
        document.write("合格");
    }
}

var a1=1;
switch(a1){
    case 0:
        document.write("A");
        break;
    case 1:
        document.write("B");
        break;
}

var a2=3;
switch(a2){
    case 0:
        document.write("A");
        break;
    case 1:
        document.write("B");
        break;
    default:
        document.write("C");
}

var a3="青";
switch(a3){
        case"赤":
        document.write("赤組");
        break;
       case"白":
        document.write("白組");
        break;
      case"青":
        document.write("青組");
        break;
}   

var star="☆";
switch(star){
        case"★":
        document.write("黒い星です");
        break;
        case"☆":
        document.write("白い☆です");
        break;
    default:
        document.write("その他記号です");
}



var score=99;
switch(score){
        case 99:
        document.write("おしい！");
        break;
    case 100:
        document.write("満点です！");
        break;
    default:
        document.write(seore+"点です！");
}

for(var i=1;i<=10;i++){
    document.write(i);
    document.write("/");
}

for(var a=10;a>=0;a--){
    document.write(a);
    document.write("/");
}

for(var b=1;b<7;b++){
    document.write(b);
    document.write("<br>");
}

for(var star=1;star<5;star++){
    document.write("★");
    document.write("<br>");
}

for(var monht=1;monht<=12;monht++){
    document.write(monht);
    document.write("月/");
}

for(var age=18;age<=99;age++){
    document.write(age+"歳");
    document.write("<br>");
}

for(var day=1;day<=31;day++){
    document.write(day+"日");
    document.write("<br>");
}
for(var num=1;num<=40;num++){
    document.write(num+"番");
    document.write("<br>");
}

for(var i=1;i<=10;i++){
    if(i%2==0){
        document.write(i);
    }
}

for(var a=3;a<=8;a++){
    if(a>5){
        document.write(a);
        document.write("<br>");
    }
}

for(var b=1;b<=9;b++){
    for(var c=1;c<=9;c++){
        document.write(b*c);
    }
        document.write("→"+b+"の段<br>");
    }

for(var star1=1;star1<=5;star1++){
    for(var star2=1;star2<=5;star2++){
        document.write("★");
    }
    document.write("<br>");
}


    
for(var monht=1;monht<=12;monht++){
    document.write(monht+"月");
    for(var day=1;day<=30;day++){
        document.write(day+"日/");
    }
    document.write("<br><br>");
}

for(var num=10;num>=0;num--){
    if(num==0){
        document.write("終了！"+"<br>");}
    else{
        document.write(num+"<br>");
    }
}

for(var no1=0;no1<4;no1++){
    for(var no2=0;no2<=5;no2++){
        if(no2%2==0){
            document.write("★");}
        else{
            document.write("☆");}    
}
    document.write("<br>");
}



var i=1;
while(i<=20){
    document.write(i);
    i++
    document.write("<br>");
}

var a=10;
while(a<=30){
    document.write(a+"<br>");
    a++;
}

var b=20;
while(b>=10){
    document.write(b+"<br>");
    b--;
}

var c=1;
while(c<=10){
    document.write(c+"<br>");
    c+=2;
}

var d=30;
while(d>5){
    document.write(d+"<br>");
    d-=3;
}

var name=1;
while(name<5){
    document.write("Tanaka"+"<br>");
    name++;
}



var color=["NO1","NO2","NO3"];
delete color[0];
document.write(color);

var pre1=["東京","神奈川","埼玉"];
pre1[3]="千葉";
document.write(pre1);

var pre2=["東京","神奈川","埼玉"];
delete pre2[0];
pre2[0]="千葉";
document.write(pre2);

var monht=["一月","二月","三月"];
monht[2]="誕生日";
document.write(monht);
document.write(monht[2]);

var number=
    {"1番":"佐藤","2番":"田中","3番":"斉藤"};
document.write(number["1番"]);

var myoji=["田中","高橋","斉藤"];
myoji.unshift("鈴木");
document.write(myoji);

var abc=["高知","愛媛","香川"];
abc.unshift("徳島");
document.write(abc);

var xyz1=["名前","住所","電話番号"];
xyz1.push("アドレス");
document.write(xyz1);

var rech=["good","bad","nice"];
rech.push("lacky");
document.write(rech);

var xyz4=["名前","住所","電話番号"];
xyz4.pop();
document.write(xyz4);

var def=["関東","東北","九州","四国"];
def.pop();
document.write(def);

var myoji=["田中","高橋","斉藤"];
document.write(myoji.slice(0,2));

var age=[18,26,33,41,50];
document.write(age.slice(1,4));


function namehello(name){
    return name+"さん。こんにちは";
}
document.write(namehello("高橋"));
document.write("<br>");
document.write(namehello("鈴木"));
document.write("<br>");

function jiusho(abc){
    return abc+"出身の方";
}
document.write(jiusho("東京"));
document.write("<br>");
document.write(jiusho("神奈川"));
document.write("<br>")
document.write(jiusho("大阪"));
document.write("<br>");

function test(num){
    return"あなたの点数は"+num+"点です。";
}

document.write(test(90));
document.write("<br>");

document.write(test(88));
document.write("<br>");

document.write(test(79));
document.write("<br>");


function oshirase(num){
    return"会員Noは"+num+"です。";
}

document.write(oshirase(1022));
document.write("<br>");
document.write(oshirase(1199));
document.write("<br>");
document.write(oshirase(2048));
document.write("<br>");