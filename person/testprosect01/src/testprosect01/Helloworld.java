package testprosect01;

public class Helloworld {

	public static void main(String[] args) {
		// Hello world!の出力
        System.out.println("Hello World!");
        System.out.println("ああああ\r\nいいい");
        
        String name="高橋";
        System.out.println(name);
        
        char no1='A';
        System.out.println(no1);
        
        int no2=12345;
        System.out.println(no2);
        
        boolean no3=true;
        System.out.println(no3);
        
        int a=3+3;
        System.out.println(a);
        
        String abc="山田";
        System.out.println(abc+"さん");
        
        float a4=5/2;
        System.out.println(a4);
        
        float a5=(float)5/2;
        System.out.println(a5);
        
        float a6=(float)10/3;
        System.out.println(a6);
        
        double a7=(double)10/3;
        System.out.println(a7);
        
        int a8=7%3;
        System.out.println(a8);
        
        System.out.println(5%3);
        
        int a9=10;
        if(a9<20){
        	System.out.println("A");
        }
        
        String b="山田";
        if(b.equals("山田")){
        	System.out.println(b+"さん");
        }
        
        int b1=5;
        if(b1<10&&3<b1){
        	System.out.println("A");
        }
        int b2=7;
        if(b2>7){
        	System.out.println("A");
        }else if(b2<10){
        	System.out.println("B");
        }
        
        int b3=3;
        if(b3>5){
        	System.out.println("A");
        }else{
        	System.out.println("Z");
        }
        
        int b4=20;
        if(b4<8){
        	System.out.println("A");
        }else if(b4==8){
        	System.out.println("B");
        }else{
        	System.out.println("C");
        }
        
        int b5=18;
        if(b5>=20){
        	System.out.println("成人");
        }else{
        	System.out.println("未成年");
        }
        
        int b6=35;
        if(b6<20){
        	System.out.println("未成年");
        }else if(b6>80){
        		System.out.println("高齢者");
        	}else{
        		System.out.println("成人");
        	}
        
        int b7=35;
        if(b7<20){
        	System.out.println("未成年");
        }else if(b7>=20&&b7<=80){
        	System.out.println("成人");
        }else{
        	System.out.println("高齢者");
        }
        
        int b8=5;
        if(b8%2==0){
        	System.out.println("偶数");
        }else{
        	System.out.println("奇数");
        }
        
        int b9=20;
        if(b9>10){
        	if(b9<30){
        		System.out.println("A");
        	}
        }
        
        int c=10;
        if(c>0){
        	if(c==2){
        		System.out.println("A");
        	}else if(c==3){
        		System.out.println("B");
        	}else{
        		System.out.println("C");
        	}
        }
        
        int c1=1;
        switch(c1){
        case 0:
        	System.out.println("aは０に等しい");
        	break;
        case 1:
        	System.out.println("aは１と等しい");
        	break;
        }
        	
       
        int c2=5;
        switch(c2){
        case 0:
        	System.out.println("aは0に等しい");
        	break;
        case 1:
        	System.out.println("aは１に等しい!");
        	break;
        	default:
        		System.out.println("aは０でも１でもない");
        }
        
        String[]name1=new String[3];
        name1[0]="田中";
        name1[1]="高橋";
        name1[2]="斉藤";
        System.out.println(name1[0]);
        
        String[]name2={"田中","高橋","斉藤"};
        System.out.println(name2[1]);
        
        char[]c3={'x','y','z'};
        System.out.println(c3[0]);
        
        int[]c4={1,4,20};
        System.out.println(c4[2]);
        
        String[]name3={"田中","高橋","斉藤"};
        name3[0]="加藤";
        System.out.println(name3[0]);
        
        String[][]country={
        		{"日本","タイ"},
        		{"アメリカ","ブラジル"},
        		{"フランス","ロシア"}
        };
        System.out.println(country[0][0]);
        
        String[][]conutry=new String[3][2];
        country[0][0]="日本";
        country[0][1]="タイ";
        country[1][0]="アメリカ";
        country[1][1]="ブラジル";
        country[2][0]="フランス";
        country[2][1]="ロシア";
        System.out.println(country[0][1]);
        
        for(int c5=0;c5<3;c5++){
        	System.out.println(c5);
        }
        
        for(int c6=1;c6<=10;c6++){
        	if(c6%2==0){
        		System.out.println(c6+"\n");
        	}
        }
        
        int c7=10;
        String c8=c7>=0?"ﾌﾟﾗｽ":"ﾏｲﾅｽ";
        System.out.println(c8);
       
        
        int c9=2;
        String d=c9%2==0?"偶数":"奇数";
        System.out.println(d);
        
        for(int d1=0;d1<=5;d1++){
        	String d2=d1%2==0?"☆":"★";
        	System.out.println(d2);
        }
        
        for(int d3=1;d3<=10;d3++){
        	if(d3%2==0){
        		System.out.println(d3+"\n");
        	}
        }
        
        for(int d4=0;d4<3;d4++){
        	for(int d5=1;d5<4;d5++){
        		System.out.println(d5);
        	}
        	System.out.println("\n");
        }
        
        int d5=0;
        while(d5<10){
        	System.out.println(d5);
        	d5++;
        }
        
        int d6=0;
        do{
        	System.out.println(d6);
        	d6++;
        }while(d6<10);
        
        int d7=5;
        do{
        	System.out.println(d7);
        	d7--;
        }while(d7>0);
        
        
        
        
	}

}
