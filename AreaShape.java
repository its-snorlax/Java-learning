abstract class Shape{
	abstract void area();
	abstract void disp();
}

class Triangle extends Shape{
	int height, base;
	float area;
	public Triangle(int height, int base){
		this.height = height;
		this.base = base;
	}
	void area(){

		area = (height * base)/2;

	}
	void disp(){
		System.out.println(area);
	}
}

class Square extends Shape{
	int side;
	float area;
	public Square(int side){
		this.side = side;
	}
	void area(){
		area = side * side;
	}
	void disp(){
		System.out.println(area);	
	}
}
public class AreaShape {
	public static void main(String[] args) {
		Triangle obj1 = new Triangle(2,4);
		obj1.area();
		obj1.disp();
		Square obj2 = new Square(5);
		obj2.area();
		obj2.disp();
	}
}