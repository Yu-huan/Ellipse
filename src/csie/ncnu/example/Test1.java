package csie.ncnu.example;

public class Test1 {
	public static void main(String[] args) {
		Ellipse e1=new Ellipse(10,5);
		Circle c1=new Circle(5);
		System.out.println("e1�����n: "+e1.area());
		System.out.println("e1���P��: "+e1.perimeter());
		System.out.println("c1�����n:"+c1.area());
		System.out.println("c1���P��:"+c1.perimeter());
	}

}
