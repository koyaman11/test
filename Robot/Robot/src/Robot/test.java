package Robot;

public class test {
	public static void main(String[]args){
		Robot ai=new Robot();
		ai.name="aibo";
		System.out.println(ai.name);
		ai.talk();
		ai.walk();
		ai.run();

Robot as=new Robot();
as.name="asimo";
System.out.println(as.name);
as.talk();
as.walk();
as.run();

Robot pe=new Robot();
pe.name="pepper";
System.out.println(pe.name);
pe.talk();
pe.walk();
pe.run();

Robot dor=new Robot();
dor.name="doraemon";
System.out.println(dor.name);
dor.talk();
dor.walk();
dor.run();


	}

}
