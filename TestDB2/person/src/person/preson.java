package person;

public class preson {
	public String name=null;
	public int age=0;

	public preson(){}

	public preson(String name,int age){
		this.name=name;
		this.age=age;
	}


public preson(String name){
	this.name=name;
	this.age=0;
}

public preson(int age){
	this.name="名前なし";
	this.age=age;
}

public preson(int age,String name){
	this.name=name;
	this.age=age;
}









}
