
public class Employee {
	int id;
	String name;
	float salary;
	void insert(int i,String n,int s) {
		id=i;
		name=n;
		salary=s;
	}
	void display() {
		System.out.println(id+""+name+""+salary+"");
	}
}
class TestEmployee{
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Employee e1=new Employee();
     Employee e2=new Employee();
     Employee e3=new Employee();
     e1.insert(101, "Jigna", 25000);
     e2.insert(102, "Niku", 10000);
     e3.insert(103, "Jay", 25000	);
     e1.display();
     e2.display();
     e3.display();
	}

}
