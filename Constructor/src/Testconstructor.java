//Constructor overloading example
public class Testconstructor {
	int id;  
	String name;  
	int age;  
	Testconstructor(int i,String n){  
	    id = i;  
	    name = n;  
	    }  
	    Testconstructor(int i,String n,int a){  
	    id = i;  
	    name = n;  
	    age=a;  
	    }  
	    void display(){System.out.println(id+" "+name+" "+age);}  
	   
	    public static void main(String args[]){  
	    Testconstructor s1 = new Testconstructor(111,"Karan");  
	    Testconstructor s2 = new Testconstructor(222,"Aryan",25);  
	    s1.display();  
	    s2.display();  
	   }  
	 
}
