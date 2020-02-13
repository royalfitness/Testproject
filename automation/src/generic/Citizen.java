package generic;

public class Citizen extends Student {
	String name;	
	int id ;
    int age;

 Citizen(String name,int id,int age)
	{
	super(name,id);
	this.name=name;
	this.id=id;
	this.age=age;

}
 void display()
 {
 	System.out.println("name is "+name);
 	System.out.println("id is "+id);
 	System.out.println("age is "+age);
 }
}