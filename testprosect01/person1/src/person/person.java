package person;

public class person {


	public String name=null;
	public int age=0;
	public person(){}
	public person(String name, int age){
		this.name = name;
		this.age = age;
}
public person(String name){
	this.name=name;
	this.age=0;
}

public person(int age){
	this.name="名前なし";
	this.age=age;
}

public person(int age,String name){
	this.name=name;
	this.age=age;
}

}







