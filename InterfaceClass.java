interface Shape{
	void area();
	void perimeter();
}
interface Output{
	void print();
}

class Square implements Shape,Output{
	int side;
	float area , perimeter;
	public Square(int side){
		this.side = side;
	}
	public void area(){
		area = side * side;
	}
	public void perimeter(){
		perimeter = 4 * side;
	} 
	public void print(){
		System.out.println(area);
		System.out.println(perimeter);
	}
}

class Rectangle implements Shape,Output{
	int length , width;
	float area , perimeter;
	public Rectangle(int length, int width){
		this.length = length;
		this.width = width;
	}
	public void area(){
		area = length * width;
	}
	public void perimeter(){
		perimeter = 2*(length + width);
	} 
	public void print(){
		System.out.println(area);
		System.out.println(perimeter);
	}
}
public class InterfaceClass{
	public static void main(String[] args) {
		Square obj1 = new Square(5);
		obj1.area();
		obj1.perimeter();
		obj1.print();

		Rectangle obj2 = new Rectangle(4,5);
		obj2.area();
		obj2.perimeter();
		obj2.print();
	}
}