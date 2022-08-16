package conditionas;

public class Nestedif {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int age=24;
int weight=55;
if(age>=18) {
	if(weight>=50) {
		System.out.println("you are eligible to donate a Blood");
	}
	else {
		System.out.println("you are not eligible to donate a Blood");
	}
}
else {
	System.out.println("Age must greater then 18");
}
	}

}
