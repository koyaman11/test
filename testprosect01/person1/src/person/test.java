package person;

public class test {
	public static void main(String[]args){
		person sabu =new person("saburo");
System.out.println(sabu.name);
System.out.println(sabu.age);

		person nanasi=new person(25);
		System.out.println(nanasi.age);


		person hanako=new person(17,"hanako");
System.out.println(hanako.age);
System.out.println(hanako.name);


	}

}