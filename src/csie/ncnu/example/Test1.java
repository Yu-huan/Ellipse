package csie.ncnu.example;

public class Test1 {
	public static void main(String[] args) {
		Ellipse e1=new Ellipse(10,5);
		Circle c1=new Circle(5);
		System.out.println("e1的面積: "+e1.area());
		System.out.println("e1的周長: "+e1.perimeter());
		System.out.println("c1的面積:"+c1.area());
		System.out.println("c1的周長:"+c1.perimeter());
	}

}
