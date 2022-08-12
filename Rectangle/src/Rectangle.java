
public class Rectangle {
int lenght;
int weight;
void insert(int l,int w) {
	lenght=l;
	weight=w;
}
	void calculateArea(){
		System.out.println(lenght*weight);
	}
}
class TestRectangle{
	public static void main(String[] args) {
		// TODO Auto-generated method stub
   Rectangle r1=new Rectangle();
   Rectangle r2=new Rectangle();
   r1.insert(25, 25);
   r2.insert(30, 30);
   r1.calculateArea();
   r2.calculateArea();
	}

}
